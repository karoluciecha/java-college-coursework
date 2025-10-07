package assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for loading encoding mappings from a CSV file and building the
 * reverse mapping for decoding.
 *
 * <p>
 * This class reads a CSV of "token,code" lines (e.g. "word,1234"), constructs a
 * forward Map&lt;String,Integer&gt;, and produces a reverse
 * Map&lt;Integer,String&gt;.
 * </p>
 */
public class EncodingMap {

	/**
	 * Default constructor.
	 */
	public EncodingMap() {
		// No initialization required
	}

	/**
	 * Loads the word or suffix -> code mappings from a CSV file.
	 *
	 * <p>
	 * Each line should be of the form <code>token,code</code>. Lines with missing
	 * or non-integer codes are skipped. A progress bar is shown during loading.
	 * </p>
	 *
	 * @param csvPath : Path to the encodings CSV file.
	 * @return : A map where keys are tokens (words or suffixes) and values are
	 *         their integer codes.
	 * @throws IOException       If the file cannot be read.
	 * @throws SecurityException If access to the file is denied.
	 *
	 *                           <p>
	 *                           <strong>Complexity:</strong> O(N) time and O(N)
	 *                           space, where N is the number of lines in the CSV.
	 *                           Each line is read once and parsed in O(1) time.
	 *                           </p>
	 */
	public static Map<String, Integer> loadMap(String csvPath) throws IOException {
		int total = (int) Files.lines(Paths.get(csvPath)).count();
		Map<String, Integer> forwardMap = new HashMap<>(10000);
		try (BufferedReader reader = new BufferedReader(new FileReader(csvPath))) {
			String line;
			int count = 0;
			while ((line = reader.readLine()) != null) {
				count++;
				// Update progress bar
				ProgressMeter.printProgress(count, total);

				String[] parts = line.split(",", 2);
				if (parts.length < 2) {
					// Malformed line - skip
					continue;
				}
				String token = parts[0].trim();
				try {
					int code = Integer.parseInt(parts[1].trim());
					forwardMap.put(token, code);
				} catch (NumberFormatException e) {
					// Invalid code - skip
				}
			}
		}
		// Finish the progress bar line
		System.out.println();
		return forwardMap;
	}

	/**
	 * Builds a reverse mapping from code -> token for decoding.
	 *
	 * @param forwardMap The original token -> code map.
	 * @return A map where keys are integer codes and values are the corresponding
	 *         tokens.
	 *
	 *         <p>
	 *         <strong>Complexity:</strong> O(N) time and O(N) space, where N is the
	 *         number of entries in <code>forwardMap</code>. Iterates each entry
	 *         once.
	 *         </p>
	 */
	public static Map<Integer, String> buildReverseMap(Map<String, Integer> forwardMap) {
		Map<Integer, String> reverseMap = new HashMap<>(forwardMap.size());
		for (Map.Entry<String, Integer> entry : forwardMap.entrySet()) {
			reverseMap.put(entry.getValue(), entry.getKey());
		}
		return reverseMap;
	}
}