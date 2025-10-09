package assessment;

import java.util.Scanner;

/**
 * Utility class for displaying the main menu and collecting user input for file
 * paths, configuration options, and other actions.
 */
public class Menu {

	/**
	 * Default constructor.
	 */
	public Menu() {
		// No initialization required
	}

	/**
	 * Prints the main application menu to the console.
	 *
	 * <p>
	 * This includes program branding and a numbered list of actions the user can
	 * select from, such as file selection, encoding, and decoding options.
	 * </p>
	 */
	public static void print() {
		System.out.println(ConsoleColour.WHITE);
		System.out.println("************************************************************");
		System.out.println("*     ATU - Dept. of Computer Science & Applied Physics    *");
		System.out.println("*                                                          *");
		System.out.println("*              Encoding Words with Suffixes                *");
		System.out.println("*                                                          *");
		System.out.println("************************************************************");
		System.out.println("1. Specify Mapping File");
		System.out.println("2. Specify Input File");
		System.out.println("3. Specify Output File");
		System.out.println("4. Configure Options");
		System.out.println("5. Encode Text File");
		System.out.println("6. Decode Text File");
		System.out.println("7. Quit");
	}

	/**
	 * Prompts the user to select an option from the menu.
	 *
	 * @param scanner A <code>Scanner</code> object for reading user input.
	 * @return The user's selected option as an integer (1–7), or <code>-1</code> if
	 *         the input was invalid.
	 *
	 *         <p>
	 *         <strong>Note:</strong> Invalid numeric inputs (e.g. letters or empty
	 *         strings) result in <code>-1</code>.
	 *         </p>
	 */
	public static int getSelection(Scanner scanner) {
		System.out.print(ConsoleColour.BLACK_BOLD_BRIGHT);
		System.out.print("Select an option (1 - 7): ");
		String input = scanner.nextLine();
		try {
			return Integer.parseInt(input.trim());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	/**
	 * Prompts the user for a file path and allows accepting a default.
	 *
	 * @param label       A descriptive label to show before the prompt.
	 * @param defaultPath The default file path to use if the user presses Enter.
	 * @param scanner     A <code>Scanner</code> object for reading user input.
	 * @return The user-specified file path, or the default if the input was empty.
	 *
	 *         <p>
	 *         <strong>Example:</strong> If the prompt is <code>Input File</code>
	 *         and the default is <code>text.txt</code>, pressing Enter uses
	 *         <code>text.txt</code>.
	 *         </p>
	 */
	public static String promptForFile(String label, String defaultPath, Scanner scanner) {
		System.out.print(label + " (default: " + defaultPath + "): ");
		String input = scanner.nextLine().trim();
		String chosen = input.isEmpty() ? defaultPath : input;
		System.out.println(label + " set to: " + chosen);
		return chosen;
	}

	/**
	 * Prompts the user to choose between two labeled options.
	 *
	 * @param title   A description of the choice being made.
	 * @param option1 The label for option 1.
	 * @param option2 The label for option 2.
	 * @param scanner A <code>Scanner</code> object for reading user input.
	 * @return <code>1</code> or <code>2</code>, depending on the user's choice.
	 *         Defaults to <code>1</code> for any input other than <code>"2"</code>.
	 *
	 *         <p>
	 *         This is a simplified binary selection used for toggles like
	 *         <em>Enable casing?</em> or <em>Preserve punctuation?</em>
	 *         </p>
	 */
	public static int promptTwoChoice(String title, String option1, String option2, Scanner scanner) {
		System.out.println(title + ":");
		System.out.println("1. " + option1);
		System.out.println("2. " + option2);
		System.out.print("Select (1 - 2): ");
		String line = scanner.nextLine().trim();
		return (line.equals("2") ? 2 : 1);
	}
}