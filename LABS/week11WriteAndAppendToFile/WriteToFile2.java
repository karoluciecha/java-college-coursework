// Karol - G00436758

import java.io.*;

public class WriteToFile2 {
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("ComputingQuote.txt");
        outputFile.printf("The Internet?\nWe are not interested in it.\nBill Gates, 1993.");
        outputFile.close();
    }
}