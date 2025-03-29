// Karol - G00436758

import java.io.*;

public class WriteToFile9 {
    public static void main(String[] args) throws IOException {
        FileWriter fWriter = new FileWriter("MyFile.txt", true);
        PrintWriter outputFile = new PrintWriter(fWriter);
        outputFile.printf("this is using FileWriter!\n");
        outputFile.close();
    }
}