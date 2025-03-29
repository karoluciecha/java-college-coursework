// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption17 {
    public static void main(String[] args) {
        int choice;
        String[] question = {"Was the Java programming language first released in 1995?", "Is Java an object-oriented language?", "Was the Java programming language developed by Bill Gates?"};
        String[] addition = {"", "", " - Bill Gates did not develop the Java programming language."}
        int[] truthTable = {0, 0, 1};
        choice = JOptionPane.showConfirmDialog(null, "Was the Java programming language first released in 1995?", "Yes or no?", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "Yes, that's correct! The Java programming language was first released by Sun Microsystems in 1995.");
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again.");
        }
    }
}