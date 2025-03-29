// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile5 {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        String fileDetails = JOptionPane.showInputDialog(null, "Enter File Content:");

        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf(fileDetails);
        outputFile.close();
    }
}