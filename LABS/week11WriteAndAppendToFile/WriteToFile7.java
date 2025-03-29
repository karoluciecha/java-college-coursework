// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile7 {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        String fileDetails = JOptionPane.showInputDialog(null, "Enter File Content:");
        int count = Integer.parseInt(JOptionPane.showInputDialog(null, "How many lines of text in file?"));
        fileDetails = String.format("%s\n", fileDetails);
        PrintWriter outputFile = new PrintWriter(fileName);
        for (int i = 0; i < count; i++) {
            outputFile.printf(fileDetails);
        }
        outputFile.close();
    }
}