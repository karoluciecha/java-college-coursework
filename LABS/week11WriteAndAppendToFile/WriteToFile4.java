// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile4 {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf("This is Java!");
        outputFile.close();
    }
}