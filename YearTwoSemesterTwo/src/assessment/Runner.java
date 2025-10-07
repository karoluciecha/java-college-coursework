package assessment;

import java.util.Map;
import java.util.Scanner;

/**
 * Entry point for the encoding/decoding application.
 * 
 * @author Karol Uciecha
 * @version 1.0
 *
 * <p>This class manages user interaction through a text menu, coordinates loading
 * of the encoding map, and delegates to the Encoder and Decoder classes.</p>
 */
public class Runner {
	
	/**
	 * Default constructor for the Runner class.
	 */
	public Runner() {
	    // No setup required
	}
	
	/**
	 * Entry point of the application.
	 *
	 * @param args Command-line arguments (not used).
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Default path for the mapping CSV
		String mappingFilePath = "src/assessmentFiles/encodings-10000.csv";
		
		// Encoding maps (forward: token -> code, reverse: code -> token)
		Map<String, Integer> forwardMap = null;
		Map<Integer, String> reverseMap = null;

		// File paths for encoder and decoder operations
		String encoderInputFile = "src/assessmentFiles/text.txt";
		String encoderOutputFile = "src/assessmentFiles/encrypted.txt";
		String decoderInputFile = "src/assessmentFiles/encrypted.txt";
		String decoderOutputFile = "src/assessmentFiles/decrypted.txt";

		// Flags to track whether user has overridden default file paths
		boolean encoderInputSet = false;
		boolean encoderOutputSet = false;
		boolean decoderInputSet = false;
		boolean decoderOutputSet = false;

		// User options: whether to preserve casing and punctuation
		boolean preserveCase = false;
		boolean preservePunctuation = false;

		// Main program loop
		boolean exit = false;
		while (!exit) {
			Menu.print(); // Show menu options
			int choice = Menu.getSelection(scanner);

			switch (choice) {
			case 1:
				// Load mapping CSV file and build encoding/decoding maps
				System.out.print("Enter mapping CSV path (default: " + mappingFilePath + "): ");
				String mp = scanner.nextLine().trim();
				if (!mp.isEmpty())
					mappingFilePath = mp;
				try {
					long t0 = System.currentTimeMillis();
					forwardMap = EncodingMap.loadMap(mappingFilePath);
					reverseMap = EncodingMap.buildReverseMap(forwardMap);
					long dt = System.currentTimeMillis() - t0;
					System.out.println("Loaded " + forwardMap.size() + " entries in " + dt + " ms.");
					System.out.println(
							"Mapping file set to: " + mappingFilePath + " (" + forwardMap.size() + " entries)");
				} catch (Exception e) {
					System.err.println("Failed to load mapping: " + e.getMessage());
				}
				break;

			case 2:
				// Prompt user for encoder and decoder input file paths
				encoderInputFile = Menu.promptForFile("Encoder input file", encoderInputFile, scanner);
				decoderInputFile = Menu.promptForFile("Decoder input file", decoderInputFile, scanner);
				encoderInputSet = true;
				decoderInputSet = true;
				break;
				
			case 3:
				// Prompt user for encoder and decoder output file paths
				encoderOutputFile = Menu.promptForFile("Encoder output file", encoderOutputFile, scanner);
				decoderOutputFile = Menu.promptForFile("Decoder output file", decoderOutputFile, scanner);
				encoderOutputSet = true;
				decoderOutputSet = true;
				break;

			case 4:
				// Prompt for configuration options: case and punctuation handling
				int c = Menu.promptTwoChoice("Case handling", "Ignore case (default)", "Preserve original casing",
						scanner);
				preserveCase = (c == 2);

				int p = Menu.promptTwoChoice("Punctuation", "Ignore punctuation (default)", "Preserve punctuation",
						scanner);
				preservePunctuation = (p == 2);
				break;

			case 5:
				// Run the encoder
				if (forwardMap == null) {
					System.out.println("Please load the mapping first (option 1).");
					break;
				}
				// Notify if default file paths are still being used
				if (!encoderInputSet)
					System.out.println("Using default encoder input file: " + encoderInputFile);
				if (!encoderOutputSet)
					System.out.println("Using default encoder output file: " + encoderOutputFile);

				try {
					long t0 = System.currentTimeMillis();
					Encoder.encodeFile(encoderInputFile, encoderOutputFile, forwardMap, preserveCase,
							preservePunctuation);
					long dt = System.currentTimeMillis() - t0;
					System.out.println("Encoding done in " + dt + " ms. Output: " + encoderOutputFile);
				} catch (Exception e) {
					System.err.println("Error during encoding: " + e.getMessage());
				}
				break;

			case 6:
				// Run the decoder
				if (reverseMap == null) {
					System.out.println("Please load the mapping first (option 1).");
					break;
				}
				// Notify if default file paths are still being used
				if (!decoderInputSet)
					System.out.println("Using default decoder input file: " + decoderInputFile);
				if (!decoderOutputSet)
					System.out.println("Using default decoder output file: " + decoderOutputFile);

				try {
					long t0 = System.currentTimeMillis();
					Decoder.decodeFile(decoderInputFile, decoderOutputFile, reverseMap, preserveCase,
							preservePunctuation);
					long dt = System.currentTimeMillis() - t0;
					System.out.println("Decoding done in " + dt + " ms. Output: " + decoderOutputFile);
				} catch (Exception e) {
					System.err.println("Error during decoding: " + e.getMessage());
				}
				break;

			case 7:
				// Exit the application
				exit = true;
				break;

			default:
				System.out.println("Invalid selection. Please try again.");
			}
		}
		// Cleanup before exiting
		scanner.close();
		System.out.println("See you next time!");
	}
}