// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption15 {
    public static void main(String[] args) {
        int choice;
        choice = JOptionPane.showConfirmDialog(null, "Click yes or no.");
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You clicked Yes!");
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "You clicked No!");
        } else if (choice == 2) {
            JOptionPane.showMessageDialog(null, "You clicked Cancel!");
        }
    }
}