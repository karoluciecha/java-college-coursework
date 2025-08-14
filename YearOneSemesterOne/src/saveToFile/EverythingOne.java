package saveToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class EverythingOne {

	private static void exerciseOne() throws IOException {
        boolean append = true;
        int choice = JOptionPane.showConfirmDialog(null, "Append (yes)?", "Conformation", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            append = true;
        } else {
            append = false;
        }
        String text = "This is a line of text from a string";
        String file = "output.txt";

        FileWriter fWriter = new FileWriter(file, append);
        PrintWriter pWriter = new PrintWriter(fWriter);
        pWriter.println(text);
        pWriter.close();
	}

	private static void exerciseTwo() throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("MyFile.txt");
        outputFile.println("Hello World!");
        outputFile.close();
	}

	private static void exerciseThree() throws IOException {
        PrintWriter outputFile = new PrintWriter("ComputingQuote.txt");
        outputFile.printf("The Internet?\nWe are not interested in it.\nBill Gates, 1993.");
        outputFile.close();
	}

	private static void exerciseFour() throws IOException {
        PrintWriter outputFile = new PrintWriter("ComputingQuote.txt");
        outputFile.printf("A computer will do what you tell it to do,\nbut that may be much different from what you had in mind.\nJoseph Weizenbaum");
        outputFile.close();
	}

	private static void exerciseFive() throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf("This is Java!");
        outputFile.close();
	}

	private static void exerciseSix() throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        String fileDetails = JOptionPane.showInputDialog(null, "Enter File Content:");

        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf(fileDetails);
        outputFile.close();
	}

	private static void exerciseSeven() throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        String fileDetails = JOptionPane.showInputDialog(null, "Enter File Content:");
        fileDetails = String.format("%s\n", fileDetails);
        PrintWriter outputFile = new PrintWriter(fileName);
        for (int i = 0; i < 10; i++) {
            outputFile.printf(fileDetails);
        }
        outputFile.close();
	}

	private static void exerciseEight() throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        String fileDetails = JOptionPane.showInputDialog(null, "Enter File Content:");
        int count = Integer.parseInt(JOptionPane.showInputDialog(null, "How many lines of text in file?"));
        fileDetails = String.format("%s\n", fileDetails);
        PrintWriter outputFile = new PrintWriter(fileName);
        for (int i = 0; i < count; i++) {
            outputFile.printf(fileDetails);
        }
        outputFile.close();
	}
	
	private static void exerciseNine() throws IOException {
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

	private static void exerciseTen() throws IOException {
        FileWriter fWriter = new FileWriter("MyFile.txt", true);
        PrintWriter outputFile = new PrintWriter(fWriter);
        outputFile.printf("this is using FileWriter!\n");
        outputFile.close();
	}

	private static void exerciseEleven() throws IOException {
        String fileDetails = JOptionPane.showInputDialog(null, "Enter line of text to add to file:");
        FileWriter fWriter = new FileWriter("MyFile.txt", true);
        PrintWriter outputFile = new PrintWriter(fWriter);
        outputFile.printf(fileDetails);
        outputFile.close();
	}

	private static void exerciseTwelve() throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        boolean append = false;
        String fileDetails;
        int appendi = JOptionPane.showConfirmDialog(null, "Would you like to overwrite existing file content?", "Select an Option", JOptionPane.YES_NO_OPTION);
        if (appendi == 1) {
            append = true;
        }
        int count = Integer.parseInt(JOptionPane.showInputDialog(null, "How many lines of text in file?"));
        FileWriter fWriter = new FileWriter(fileName, append);
        PrintWriter outputFile = new PrintWriter(fWriter);
        for (int i = 1; i <= count; i++) {
            fileDetails = JOptionPane.showInputDialog(null, "Enter file content for line " + i + ":");
            fileDetails = String.format("%s\n", fileDetails);
            outputFile.printf(fileDetails);
        }
        outputFile.close();
	}

	private static void exerciseThirteen() throws IOException {
        String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
        boolean append = false;
        int appendi = JOptionPane.showConfirmDialog(null, "Would you like to overwrite existing file content?", "Select an Option", JOptionPane.YES_NO_OPTION);
        if (appendi == 1) {
            append = true;
        }
        FileWriter fWriter = new FileWriter(fileName, append);
        PrintWriter outputFile = new PrintWriter(fWriter);
        String fileDetails = JOptionPane.showInputDialog(null, "Enter file content:");
        fileDetails = String.format("%s\n", fileDetails);
        outputFile.printf(fileDetails);
        outputFile.close();
	}

	private static void exerciseFourteen() throws IOException {
        int countStart = 0, countEnd = 0;
        try {
            countStart = Integer.parseInt(JOptionPane.showInputDialog(null, "Start count from:"));
        }
        catch (Exception e) {}
        
        do {
            try {
                countEnd = Integer.parseInt(JOptionPane.showInputDialog(null, "Finish count at:"));
            }
            catch (Exception e) {}
        } while (countEnd <= countStart);

        int choice = JOptionPane.showConfirmDialog(null, "Would you like to output on the screen (Yes) or in a file (No)?", "Select an Option", JOptionPane.YES_NO_OPTION);
        
        if (choice == 1) {
            String fileName = JOptionPane.showInputDialog(null, "Enter File Name:");
            FileWriter fWriter = new FileWriter(fileName, true);
            PrintWriter outputFile = new PrintWriter(fWriter);
            for (int i = countStart; i <= countEnd; i++) {
                outputFile.printf(i + "\n");
            }
            outputFile.close();
        } else {
            for (int i = countStart; i <= countEnd; i++) {
                System.out.printf("%d\n", i);
            }
        }
	}

	private static void exerciseFifteen() {
	    try {
	        String fileName = JOptionPane.showInputDialog(null, "Enter file name:");
	        fileName = String.format("Data\\%s.txt", fileName);
	        
	        // Attempt to create directory if it doesn't exist
	        File directory = new File("Data");
	        if (!directory.exists()) {
	            if (!directory.mkdirs()) {
	                throw new IOException("Failed to create 'Data' directory.");
	            }
	        }

	        FileWriter fWriter = new FileWriter(fileName, true);
	        PrintWriter outputFile = new PrintWriter(fWriter);
	        outputFile.close();

	        if (new File(fileName).isFile()) {
	            JOptionPane.showMessageDialog(null, "File write complete!", "Message", JOptionPane.INFORMATION_MESSAGE);
	        }
	    } catch (IOException e) {
	        JOptionPane.showMessageDialog(null, "Failed to write file. Skipping to next exercise.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	private static void exerciseSixteen() throws IOException {
        Random rnd = new Random();
        String fileName = String.format("A%d.txt", rnd.nextInt(9000) + 1000);
        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf("This is a file with a randomly generated file name.\nThe name of this file is %s.\n", fileName);
        outputFile.close();
	}
	
	private static void exerciseSeventeen() throws IOException {
        char[] charSym = {'R', 'S', 'T'};
        Random rnd = new Random();
        String fileName = String.format("%c-%d.txt", charSym[rnd.nextInt(3)], rnd.nextInt(501) + 5500);
        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.printf("This is a file with a randomly generated file name.\nThe name of this file is %s.\n", fileName);
        outputFile.close();
	}

	private static void exerciseEighteen() {
        int birthYear = -1, birthMonth = -1;
        String fName = JOptionPane.showInputDialog(null, "Enter first name:");
        String sName = JOptionPane.showInputDialog(null, "Enter surname:");
        String occupation = JOptionPane.showInputDialog(null, "Enter occupation:");
        do {
            try {
                birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Year of birth:"));
            }
            catch (Exception e) {}
        } while (birthYear < 0);
        do {
            try {
                birthMonth = Integer.parseInt(JOptionPane.showInputDialog(null, "Month of birth (1 - 12):"));
            }
            catch (Exception e) {}
        } while ((birthMonth < 0) || (birthMonth > 12));
        
        JOptionPane.showMessageDialog(null, String.format(
        	    "Name: %s %s\nOccupation: %s\nDOB: %d/%d",
        	    fName, sName, occupation, birthMonth, birthYear
        	));

	}

	public static void main(String[] args) throws IOException {

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree();

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour();

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive();

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix();

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven();

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight();

		System.out.println("\n===== Exercise 9 =====");
		exerciseNine();

		System.out.println("\n===== Exercise 10 =====");
		exerciseTen();

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven();

		System.out.println("\n===== Exercise 12 =====");
		exerciseTwelve();

		System.out.println("\n===== Exercise 13 =====");
		exerciseThirteen();

		System.out.println("\n===== Exercise 14 =====");
		exerciseFourteen();

		System.out.println("\n===== Exercise 15 =====");
		exerciseFifteen();

		System.out.println("\n===== Exercise 16 =====");
		exerciseSixteen();
		
		System.out.println("\n===== Exercise 17 =====");
		exerciseSeventeen();

		System.out.println("\n===== Exercise 18 =====");
		exerciseEighteen();

	}
}