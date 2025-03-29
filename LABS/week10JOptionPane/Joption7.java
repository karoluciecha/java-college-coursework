// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption7 {
    public static void main(String[] args) {
        double wage;
        char grade;
        String wageDisplay;
        wage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter employee current weekly wage:"));
        grade = JOptionPane.showInputDialog(null, "Enter employee grade (A, B or C):").charAt(0);

        switch (grade) {
            case 'A':
            case 'a':
                wageDisplay = String.format("%.2f", wage + 100);
                JOptionPane.showMessageDialog(null, "Grade A employee: This weeks wage plus bonus is " + wageDisplay + ".");
                break;
            case 'B':
            case 'b':
                wageDisplay = String.format("%.2f", wage + 50);
                JOptionPane.showMessageDialog(null, "Grade B employee: This weeks wage plus bonus is " + wageDisplay + ".");
                break;
            case 'C':
            case 'c':
                wageDisplay = String.format("%.2f", wage + 15);
                JOptionPane.showMessageDialog(null, "Grade C employee: This weeks wage plus bonus is " + wageDisplay + ".");
                break;
            default:
                wageDisplay = String.format("%.2f", wage);
                JOptionPane.showMessageDialog(null, "Grade is out of bonus scale: This weeks wage is " + wageDisplay + ".");
                break;
        }
    }
}