// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption12 {
    public static void main(String[] args) {
        double sum = 0D;
        int repeats = 0;
        do {
            repeats = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you wish to enter:"));
        } while (repeats <= 0);
        for(int i = 1; i <= repeats; i++) {
            sum += Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number " + i + ":"));
        }
        sum /= repeats;
        JOptionPane.showMessageDialog(null, "The average was " + sum + ".\n\nYou input " + repeats + " numbers.");
    }
}