import java.io.IOException;

import javax.swing.JOptionPane;

// Karol - G00436758

public class WriteToFile19 {
    public static void main(String[] args) throws IOException {
        int birthYear = -1, birthMonth = -1;
        String fName = JOptionPane.showInputDialog(null, "Enter first name:");
        String sName = JOptionPane.showInputDialog(null, "Enter surname:");
        String occupation = JOptionPane.showInputDialog(null, "Enter occupation:");
        do {
            try {
                birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Year of birth:"));
            }
            catch (Exception e) {}
        } while (birthYear < 0);
        do {
            try {
                birthMonth = Integer.parseInt(JOptionPane.showInputDialog(null, "Month of birth (1 - 12):"));
            }
            catch (Exception e) {}
        } while ((birthMonth < 0) || (birthMonth > 12));
    }
}
