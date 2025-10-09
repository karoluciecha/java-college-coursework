package assessment;

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Encodes plain‐text files into numeric code streams using a word or suffix ->
 * code map.
 * 
 * <p>
 * Words are emitted as sequences of integer codes, each terminated by a special
 * end‐of‐word marker, with optional markers for case and punctuation.
 * </p>
 */
public class Encoder {

	/** End‐of‐word marker code. */
	private static final int CODE_EOW = 10000;
	/** Marker code indicating the entire word was upper-case. */
	private static final int CODE_UPPER = 10001;
	/** Marker code indicating the word was capitalized. */
	private static final int CODE_CAPITAL = 10002;

	/**
	 * Default constructor.
	 */
	public Encoder() {
		// No initialization required
	}

	/** Mapping from marker codes to actual punctuation characters. */
	private static final Map<Character, Integer> PUNCT_MAP = Map.of('.', 10003, ',', 10004, '?', 10005, '!', 10006, ';',
			10007, ':', 10008);

	/**
	 * <p>
	 * Reads a text file line by line, encodes each word into a sequence of integer
	 * codes (with optional case and punctuation markers), and writes the resulting
	 * numeric stream to the output file.
	 * </p>
	 *
	 * @param inputPath           Path to the input plain‐text file.
	 * @param outputPath          Path where encoded numeric output will be written.
	 * @param forwardMap          Map from words or suffix tokens -> integer codes
	 * @param preserveCase        If <code>true</code>, emit codes to preserve word
	 *                            casing.
	 * @param preservePunctuation If <code>true</code>, encode punctuation.
	 * @throws IOException If an I/O error occurs reading or writing files.
	 * 
	 *                     <p>
	 *                     <strong>Complexity:</strong>
	 *                     </p>
	 *                     <ul>
	 *                     <li><strong>Time:</strong> O(N &times; M &times; K
	 *                     &times; L), where:
	 *                     <ul>
	 *                     <li><code>N</code> is the number of lines in the
	 *                     file,</li>
	 *                     <li><code>M</code> is the number of tokens (words) per
	 *                     line,</li>
	 *                     <li><code>K</code> is the number of suffix tokens,</li>
	 *                     <li><code>L</code> is the average suffix token
	 *                     length.</li>
	 *                     </ul>
	 *                     </li>
	 *                     <li><strong>Space:</strong> O(K) for the sorted suffix
	 *                     token list, and O(1) for in-place processing.</li>
	 *                     </ul>
	 */
	public static void encodeFile(String inputPath, String outputPath, Map<String, Integer> forwardMap,
			boolean preserveCase, boolean preservePunctuation) throws IOException {

		int total = (int) Files.lines(Paths.get(inputPath)).count();

		// Prepare and sort suffix tokens by descending length
		List<String> suffixTokens = new ArrayList<>();
		for (String t : forwardMap.keySet()) {
			if (t.startsWith("@@")) {
				suffixTokens.add(t);
			}
		}
		suffixTokens.sort((a, b) -> Integer.compare(b.length(), a.length()));

		try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
				PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {

			String line;
			int lineNo = 0;
			while ((line = reader.readLine()) != null) {
				lineNo++;
				ProgressMeter.printProgress(lineNo, total);

				int i = 0, n = line.length();
				while (i < n) {
					char c = line.charAt(i);

					// Word: letters or digits
					if (Character.isLetterOrDigit(c)) {
						int start = i;
						while (i < n && Character.isLetterOrDigit(line.charAt(i))) {
							i++;
						}
						String word = line.substring(start, i);

						// Determine and emit case marker if requested
						int marker = 0;
						if (preserveCase) {
							if (word.equals(word.toUpperCase())) {
								marker = CODE_UPPER;
							} else if (Character.isUpperCase(word.charAt(0))) {
								marker = CODE_CAPITAL;
							}
							word = word.toLowerCase();
						} else {
							word = word.toLowerCase();
						}

						// Encode the word into codes list
						List<Integer> codes = new ArrayList<>();
						if (marker != 0) {
							codes.add(marker);
						}
						encodeRecursive(word, forwardMap, suffixTokens, codes);
						codes.add(CODE_EOW);

						// Write codes to output
						for (int code : codes) {
							writer.print(code);
							writer.print(' ');
						}

					}
					// Whitespace: copy directly
					else if (Character.isWhitespace(c)) {
						writer.print(c);
						i++;
					}
					// Punctuation: optionally encode
					else {
						if (preservePunctuation && PUNCT_MAP.containsKey(c)) {
							int pc = PUNCT_MAP.get(c);
							writer.print(pc);
							writer.print(' ');
						}
						i++;
					}
				}
				writer.println();
			}

			// Finish progress bar
			System.out.println();
		}
	}

	/**
	 * Recursively encodes a word by greedily matching the longest suffix‐tokens
	 * first.
	 * 
	 * <p>
	 * Attempts to find the longest suffix match in the suffix token list. If a full
	 * word match exists in the map, it is encoded directly. Otherwise, suffixes are
	 * matched and emitted after recursively encoding the prefix. Unknown fragments
	 * emit code <code>0</code>.
	 * </p>
	 *
	 * @param word         The lower-case word to encode.
	 * @param forwardMap   Map from word or suffix -> integer code
	 * @param suffixTokens List of suffix tokens (with "@@" prefix), sorted by
	 *                     descending length.
	 * @param out          Output list to which integer codes are appended.
	 * 
	 *                     <p>
	 *                     <strong>Complexity:</strong>
	 *                     </p>
	 *                     <ul>
	 *                     <li><strong>Time:</strong> O(n &times; k &times; m),
	 *                     where:
	 *                     <ul>
	 *                     <li><code>n</code> is the length of the word,</li>
	 *                     <li><code>k</code> is the number of suffix tokens,</li>
	 *                     <li><code>m</code> is the average length of
	 *                     suffixes.</li>
	 *                     </ul>
	 *                     </li>
	 *                     <li><strong>Space:</strong> O(n) stack space in the worst
	 *                     case due to recursion depth.</li>
	 *                     </ul>
	 */
	private static void encodeRecursive(String word, Map<String, Integer> forwardMap, List<String> suffixTokens,
			List<Integer> out) {
		if (word.isEmpty()) {
			return;
		}
		Integer code = forwardMap.get(word);
		if (code != null) {
			out.add(code);
			return;
		}
		for (String tok : suffixTokens) {
			String suf = tok.substring(2);
			if (word.length() > suf.length() && word.endsWith(suf)) {
				encodeRecursive(word.substring(0, word.length() - suf.length()), forwardMap, suffixTokens, out);
				out.add(forwardMap.get(tok));
				return;
			}
		}
		// Unknown remainder
		out.add(0);
	}
}