// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile12 {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        boolean append = false;
        int appendi = JOptionPane.showConfirmDialog(null, "Would you like to overwrite existing file content?", "Select an Option", JOptionPane.YES_NO_OPTION);
        if (appendi == 1) {
            append = true;
        }
        FileWriter fWriter = new FileWriter(fileName, append);
        PrintWriter outputFile = new PrintWriter(fWriter);
        String fileDetails = JOptionPane.showInputDialog(null, "Enter file content:");
        fileDetails = String.format("%s\n", fileDetails);
        outputFile.printf(fileDetails);
        outputFile.close();
    }
}