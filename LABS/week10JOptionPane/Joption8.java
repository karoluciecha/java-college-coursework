// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption8 {
    public static void main(String[] args) {
        double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter first number:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter second number:"));
        JOptionPane.showMessageDialog(null, "First number entered: " + num1 + "\nSecond number entered: " + num2 + "\n" + num1 + " plus " + num2 + " = " + (num1 + num2));
    }
}