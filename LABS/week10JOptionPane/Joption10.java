// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption10 {
    public static void main(String[] args) {
        double num1, num2;
        char operator;
        String division;
        while (true) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter first number:"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter second number:"));
            operator = JOptionPane.showInputDialog(null, "Enter operator (A, S, D or M - or type Exit to end):").toLowerCase().charAt(0);
            switch (operator) {
                case 'a':
                    JOptionPane.showMessageDialog(null, (num1 + num2));
                    break;
                case 's':
                    JOptionPane.showMessageDialog(null, (num1 - num2));
                    break;
                case 'm':
                    JOptionPane.showMessageDialog(null, (num1 * num2));
                    break;
                case 'd':
                    division = String.format("%.5f", (num1 / num2));
                    JOptionPane.showMessageDialog(null, division);
                    break;
                case 'e':
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Unknown operator!", null, JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}