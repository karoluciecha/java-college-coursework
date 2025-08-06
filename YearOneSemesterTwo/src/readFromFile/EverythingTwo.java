package readFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EverythingTwo {

	private static void exerciseOne() throws IOException {
    	String fileName, line = "";
    	fileName = JOptionPane.showInputDialog(null, "Enter the filename (Fortune_1000.data): ");
    	File inFile = new File("src/readFromFile/" + fileName);
        Scanner inputFile = new Scanner(inFile);
        while(inputFile.hasNext()) line = inputFile.nextLine();
        JOptionPane.showMessageDialog(null, "The last line is: " + line);
        inputFile.close();
	}

	private static void exerciseTwo() throws FileNotFoundException {
    	String fileName, text = "";
    	int counter = 1;
    	fileName = JOptionPane.showInputDialog(null, "Enter the name of the file you want to read (Computingtopics.txt):");
    	File inFile = new File("src/readFromFile/" + fileName);
        Scanner inputFile = new Scanner(inFile);
        while(inputFile.hasNext()) {
        	if ((counter % 10) == 0) {
            	text += String.format("%s\n", inputFile.nextLine());
        	}
        	else {
            	inputFile.nextLine();
        	}
        	counter++;
        }
        JOptionPane.showMessageDialog(null, text);
        inputFile.close();
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		scanner.close();
	}
}