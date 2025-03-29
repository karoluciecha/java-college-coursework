// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption11 {
    public static void main(String[] args) {
        final double EURO_TO_STERLING = 0.8391;
        final double STERLING_TO_EURO = 1.1917;
        double amount;
        char operator;
        String result;
            operator = JOptionPane.showInputDialog(null, "Enter G to convert Sterling to Euros\nor E to convert Euros to Sterling:").toLowerCase().charAt(0);
            amount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount:"));
            switch (operator) {
                case 'e':
                    result = String.format("%.2f", (amount * EURO_TO_STERLING));
                    JOptionPane.showMessageDialog(null, amount + "Euros is " + result + " Sterling");
                    break;
                case 's':
                    result = String.format("%.2f", (amount * STERLING_TO_EURO));
                    JOptionPane.showMessageDialog(null, amount + "Euros is " + result + " Sterling");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Unknown operator!", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
    }
}