// Karol - G00436758

import java.io.*;

import javax.swing.JOptionPane;

public class WriteToFile14 {
    public static void main(String[] args) throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter file name:");
        fileName = String.format("Data\\%s.txt", fileName);
        FileWriter fWriter = new FileWriter(fileName, true);
        PrintWriter outputFile = new PrintWriter(fWriter);
        outputFile.close();
        if (new File(fileName).isFile()) {
            JOptionPane.showMessageDialog(null, "File write complete!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
