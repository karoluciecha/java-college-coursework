// Karol - G00436758

import java.io.*;
import java.util.Random;

public class WriteToFile17 {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        String fileName = String.format("A%d.txt", rnd.nextInt(9000) + 1000);
        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf("This is a file with a randomly generated file name.\nThe name of this file is %s.\n", fileName);
        outputFile.close();
    }
}