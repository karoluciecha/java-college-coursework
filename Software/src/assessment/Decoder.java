package assessment;

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Provides functionality to decode files of numeric codes back into
 * human-readable text, optionally preserving original casing and punctuation.
 */
public class Decoder {

	/** End‐of‐word marker code. */
	private static final int CODE_EOW = 10000;
	/** Marker code indicating the entire word was upper-case. */
	private static final int CODE_UPPER = 10001;
	/** Marker code indicating the word was capitalized. */
	private static final int CODE_CAPITAL = 10002;

	/** Mapping from marker codes to actual punctuation characters. */
	private static final Map<Integer, Character> REV_PUNCT_MAP = Map.of(10003, '.', 10004, ',', 10005, '?', 10006, '!',
			10007, ';', 10008, ':');

	/**
	 * Default constructor.
	 */
	public Decoder() {
		// No initialization required
	}

	/**
	 * Reads an encoded file of space-separated numeric codes (with optional case
	 * and punctuation markers), decodes each line, and writes the resulting text to
	 * the output file.
	 *
	 * @param inputPath           Path to the file containing encoded numeric codes.
	 * @param outputPath          Path to write the decoded plain-text output.
	 * @param reverseMap          Map from integer code -> token or suffix.
	 * @param preserveCase        If <code>true</code>, re-apply casing markers.
	 * @param preservePunctuation If <code>true</code>, convert punctuation markers
	 *                            back into characters.
	 * @throws IOException : If an I/O error occurs reading or writing files.
	 *
	 *                     <p>
	 *                     <strong>Complexity:</strong>
	 *                     </p>
	 *                     <ul>
	 *                     <li><strong>Time:</strong> O(N &times; M), where:
	 *                     <ul>
	 *                     <li><code>N</code> is the number of lines in the input
	 *                     file,</li>
	 *                     <li><code>M</code> is the number of tokens (codes) per
	 *                     line.</li>
	 *                     </ul>
	 *                     </li>
	 *                     <li><strong>Space:</strong> O(W), where <code>W</code> is
	 *                     the maximum number of codes per word.</li>
	 *                     </ul>
	 */
	public static void decodeFile(String inputPath, String outputPath, Map<Integer, String> reverseMap,
			boolean preserveCase, boolean preservePunctuation) throws IOException {

		// Count total lines for progress meter
		int total = (int) Files.lines(Paths.get(inputPath)).count();

		try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
				PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {

			String line;
			int lineNo = 0;
			while ((line = reader.readLine()) != null) {
				lineNo++;
				ProgressMeter.printProgress(lineNo, total);

				StringBuilder out = new StringBuilder();
				List<Integer> buffer = new ArrayList<>();
				int i = 0, n = line.length();

				while (i < n) {
					char c = line.charAt(i);

					if (Character.isDigit(c)) {
						// Parse a code number
						int start = i;
						while (i < n && Character.isDigit(line.charAt(i)))
							i++;
						int num = Integer.parseInt(line.substring(start, i));

						if (num == CODE_EOW) {
							// End-of-word marker - decode and flush
							appendDecoded(buffer, reverseMap, out, preserveCase);
							buffer.clear();
						} else if (preservePunctuation && REV_PUNCT_MAP.containsKey(num)) {
							// Punctuation marker - flush any pending word, then append punctuation
							appendDecoded(buffer, reverseMap, out, preserveCase);
							buffer.clear();
							out.append(REV_PUNCT_MAP.get(num));
						} else {
							// Regular code - add to buffer
							buffer.add(num);
						}
						// Skip separator space if present
						if (i < n && line.charAt(i) == ' ')
							i++;

					} else {
						// Non-digit: flush buffer if needed, then append whitespace
						if (!buffer.isEmpty()) {
							appendDecoded(buffer, reverseMap, out, preserveCase);
							buffer.clear();
						}
						if (Character.isWhitespace(c)) {
							out.append(c);
						}
						i++;
					}
				}

				// Flush any remaining buffered word at end of line
				if (!buffer.isEmpty()) {
					appendDecoded(buffer, reverseMap, out, preserveCase);
				}

				writer.println(out.toString());
			}
			// Move to next line after progress bar completes
			System.out.println();
		}
	}

	/**
	 * Helper to decode a buffered list of codes into a single word and append it.
	 *
	 * @param buf          List of integer codes for one word.
	 * @param reverseMap   Map of code -> token string.
	 * @param out          StringBuilder to append decoded word to.
	 * @param preserveCase If <code>true</code>, re-apply casing markers.
	 *
	 *                     <p>
	 *                     <strong>Complexity:</strong>
	 *                     </p>
	 *                     <ul>
	 *                     <li><strong>Time:</strong> O(W), where <code>W</code> is
	 *                     the number of codes in the buffer.</li>
	 *                     <li><strong>Space:</strong> O(1), all operations are
	 *                     in-place on <code>StringBuilder</code>.</li>
	 *                     </ul>
	 */
	private static void appendDecoded(List<Integer> buf, Map<Integer, String> reverseMap, StringBuilder out,
			boolean preserveCase) {
		if (buf.isEmpty())
			return;

		int marker = 0;
		if (preserveCase && (buf.get(0) == CODE_UPPER || buf.get(0) == CODE_CAPITAL)) {
			marker = buf.remove(0);
		}

		String word = decodeCodes(buf, reverseMap);

		if (preserveCase && marker != 0) {
			if (marker == CODE_UPPER) {
				word = word.toUpperCase();
			} else {
				word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
			}
		}
		out.append(word);
	}

	/**
	 * Greedily reconstructs a single word from a sequence of codes by concatenating
	 * full-word tokens and suffix tokens.
	 *
	 * @param codes      List of integer codes (excluding EOW &amp; case markers).
	 * @param reverseMap Map from integer code -> token string (with suffixes
	 *                   prefixed "@@").
	 * @return The decoded word.
	 *
	 *         <p>
	 *         <strong>Complexity:</strong>
	 *         </p>
	 *         <ul>
	 *         <li><strong>Time:</strong> O(C), where <code>C</code> is the number
	 *         of codes in the list.</li>
	 *         <li><strong>Space:</strong> O(L), where <code>L</code> is the length
	 *         of the decoded string.</li>
	 *         </ul>
	 */
	public static String decodeCodes(List<Integer> codes, Map<Integer, String> reverseMap) {
		StringBuilder result = new StringBuilder();
		StringBuilder curr = new StringBuilder();
		boolean first = true;

		for (int code : codes) {
			String tok = reverseMap.getOrDefault(code, "[???]");
			if (tok.startsWith("@@")) {
				// Suffix: append without the "@@"
				curr.append(tok.substring(2));
			} else {
				// Flush previous token
				if (curr.length() > 0) {
					if (!first)
						result.append(' ');
					result.append(curr);
					first = false;
				}
				curr.setLength(0);
				curr.append(tok);
			}
		}

		// Flush final token
		if (curr.length() > 0) {
			if (!first)
				result.append(' ');
			result.append(curr);
		}
		return result.toString();
	}
}