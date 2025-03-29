// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile6 {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        String fileDetails = JOptionPane.showInputDialog(null, "Enter File Content:");
        fileDetails = String.format("%s\n", fileDetails);
        PrintWriter outputFile = new PrintWriter(fileName);
        for (int i = 0; i < 10; i++) {
            outputFile.printf(fileDetails);
        }
        outputFile.close();
    }
}