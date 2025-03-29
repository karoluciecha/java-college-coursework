// Karol - G00436758

import java.io.*;

public class WriteToFile3 {
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("ComputingQuote.txt");
        outputFile.printf("A computer will do what yo tell it to do,\nbut that may be much different from what you had in mind.\nJoseph Weizenbaum");
        outputFile.close();
    }
}