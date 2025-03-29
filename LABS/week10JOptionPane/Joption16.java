// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption16 {
    public static void main(String[] args) {
        int choice;
        choice = JOptionPane.showConfirmDialog(null, "Was the Java programming language first released in 1995?", "Yes or no?", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "Yes, that's correct! The Java programming language was first released by Sun Microsystems in 1995.");
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again.");
        }
    }
}