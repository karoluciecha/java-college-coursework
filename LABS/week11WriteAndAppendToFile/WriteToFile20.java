// Karol - G00436758

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile20 {
    public static void main(String[] args) throws IOException {
        int countOfFiles = 0, checksum = 0;
        try {
            countOfFiles = Integer.parseInt(JOptionPane.showInputDialog(null, "How many files would you like to create?\nEnter value between 1 and 10:"));
        }
        catch (Exception e) {}
        while ((countOfFiles < 1) || (countOfFiles > 10)) {
            try {
                countOfFiles = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid entry.\n\nHow many files would you like to create?\nEnter value between 1 and 10:"));
            }
            catch (Exception e) {}
        }
        for (int i = 1; i <= countOfFiles; i++) {
            PrintWriter outputFile = new PrintWriter("Ex20_File" + i + ".txt");
            outputFile.printf("This is a file number " + i + "\n");
            outputFile.close();
            if(new File("Ex20_File" + i + ".txt").isFile()) {
                checksum++;
            }
        }
        if (checksum == countOfFiles) {
            JOptionPane.showMessageDialog(null, "Complete!\n\n" + checksum + " files created!\nName of file: Ex20_FileX.txt - X: file number", "File creation report", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}