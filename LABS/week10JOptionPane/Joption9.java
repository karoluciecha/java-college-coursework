// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption9 {
    public static void main(String[] args) {
        int num1, num2;
        char operator;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number:"));
        operator = JOptionPane.showInputDialog(null, "Enter operator: A to add, S to substract, M to multiply, D to divide").toLowerCase().charAt(0);
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
                JOptionPane.showMessageDialog(null, (num1 / num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Unknown operator!", null, JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}