// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile10 {
    public static void main(String[] args) throws IOException {
        String fileDetails = JOptionPane.showInputDialog(null, "Enter line of text to add to file:");
        FileWriter fWriter = new FileWriter("MyFile.txt", true);
        PrintWriter outputFile = new PrintWriter(fWriter);
        outputFile.printf(fileDetails);
        outputFile.close();
    }
}