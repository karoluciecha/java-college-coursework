// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption14 {
    public static void main(String[] args) {
        int times = 0;
        String words, message;
        words = JOptionPane.showInputDialog(null, "What word(s) will be output:");
        message = JOptionPane.showInputDialog(null, "What is the message title?");
        do {
            times = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of times word should be printed:"));
        } while (times <= 0);
        for (; times > 0; times--) JOptionPane.showMessageDialog(null, words + " " + times, message, JOptionPane.PLAIN_MESSAGE);
    }
}