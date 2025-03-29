// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile13 {
    public static void main(String[] args) throws IOException {
        int countStart = 0, countEnd = 0;
        try {
            countStart = Integer.parseInt(JOptionPane.showInputDialog(null, "Start count from:"));
        }
        catch (Exception e) {}
        
        do {
            try {
                countEnd = Integer.parseInt(JOptionPane.showInputDialog(null, "Finish count at:"));
            }
            catch (Exception e) {}
        } while (countEnd <= countStart);

        int choice = JOptionPane.showConfirmDialog(null, "Would you like to output on the screen (Yes) or in a file (No)?", "Select an Option", JOptionPane.YES_NO_OPTION);
        
        if (choice == 1) {
            String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
            FileWriter fWriter = new FileWriter(fileName, true);
            PrintWriter outputFile = new PrintWriter(fWriter);
            for (int i = countStart; i <= countEnd; i++) {
                outputFile.printf(i + "\n");
            }
            outputFile.close();
        } else {
            for (int i = countStart; i <= countEnd; i++) {
                System.out.printf("%d\n", i);
            }
        }
    }
}