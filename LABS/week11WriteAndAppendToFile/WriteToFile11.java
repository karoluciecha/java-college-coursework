// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile11 {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        boolean append = false;
        String fileDetails;
        int appendi = JOptionPane.showConfirmDialog(null, "Would you like to overwrite existing file content?", "Select an Option", JOptionPane.YES_NO_OPTION);
        if (appendi == 1) {
            append = true;
        }
        int count = Integer.parseInt(JOptionPane.showInputDialog(null, "How many lines of text in file?"));
        FileWriter fWriter = new FileWriter(fileName, append);
        PrintWriter outputFile = new PrintWriter(fWriter);
        for (int i = 1; i <= count; i++) {
            fileDetails = JOptionPane.showInputDialog(null, "Enter file content for line " + i + ":");
            fileDetails = String.format("%s\n", fileDetails);
            outputFile.printf(fileDetails);
        }
        outputFile.close();
    }
}