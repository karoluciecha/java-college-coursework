// Karol - G00436758

import java.io.*;

public class WriteToFile1 {
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("MyFile.txt");
        outputFile.println("Hello World!");
        outputFile.close();
    }
}