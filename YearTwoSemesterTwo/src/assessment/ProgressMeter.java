package assessment;

/**
 * Utility class for printing a simple terminal-based progress bar.
 *
 * <p>
 * This class provides a static method to display a single-line progress bar
 * with a visual representation of completion based on the current index and
 * total steps.
 * </p>
 */
public class ProgressMeter {

	/**
	 * Default constructor.
	 */
	public ProgressMeter() {
		// No initialization required
	}

	/**
	 * Prints a progress bar to the terminal representing the current completion
	 * percentage.
	 *
	 * <p>
	 * The progress bar is drawn using a fixed width of 50 characters, where
	 * completed steps are rendered as <code>'█'</code> and remaining steps as
	 * <code>'░'</code>. The bar updates in-place using carriage return
	 * (<code>\r</code>).
	 * </p>
	 *
	 * @param index The current step or item completed.
	 * @param total The total number of steps or items.
	 *
	 *              <p>
	 *              <strong>Example Output:</strong>
	 *              </p>
	 * 
	 *              <pre>
	 * [████████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░] 25%
	 *              </pre>
	 *
	 *              <p>
	 *              <strong>Complexity:</strong>
	 *              </p>
	 *              <ul>
	 *              <li><strong>Time:</strong> O(W), where <code>W</code> is the
	 *              width of the progress bar (fixed at 50).</li>
	 *              <li><strong>Space:</strong> O(W) for the in-memory
	 *              <code>StringBuilder</code>.</li>
	 *              </ul>
	 */
	public static void printProgress(int index, int total) {
		if (index > total)
			return;
		int size = 50;
		char done = '█';
		char todo = '░';
		int percent = (100 * index) / total;
		int doneLen = size * percent / 100;

		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			sb.append(i < doneLen ? done : todo);
		}
		sb.append("] ").append(percent).append("%");

		System.out.print("\r" + sb);
		if (percent >= 100)
			System.out.println();
	}
}
