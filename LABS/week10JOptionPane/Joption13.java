// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption13 {
    public static void main(String[] args) {
        int number;
        String result;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Multiplication Table\n\nEnter a number to generate multiplication tables for:"));
        result = String.format("%d times %d is %d", number, 1, number);
        for(int i = 2; i <= 10; i++) {
            result += String.format("\n%d times %d is %d", number, i, (number * i));
        }
        JOptionPane.showMessageDialog(null, result, number + " times tables", JOptionPane.PLAIN_MESSAGE);
    }
}