// Karol - G00436758

import java.io.*;
import java.util.Random;

public class WriteToFile18 {
    public static void main(String[] args) throws IOException {
        char[] charSym = {'R', 'S', 'T'};
        Random rnd = new Random();
        String fileName = String.format("%c-%d.txt", charSym[rnd.nextInt(3)], rnd.nextInt(501) + 5500);
        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf("This is a file with a randomly generated file name.\nThe name of this file is %s.\n", fileName);
        outputFile.close();
    }
}