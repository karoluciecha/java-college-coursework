package constructors;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EverythingOne {

	private static void exerciseOne() throws IOException {
		String myVariable;

		// Specify file to use
		File myFile = new File("src/readFromFile/Quotes.txt");

		// Use Scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		// Read 1st line and output
		myVariable = inputFile.nextLine();
		System.out.printf("%s\n", myVariable);

		// Read 2nd line and output
		myVariable = inputFile.nextLine();
		System.out.printf("%s\n", myVariable);

		// Read 3rd line and output
		myVariable = inputFile.nextLine();
		System.out.printf("%s\n", myVariable);

		inputFile.close();
	}

	private static void exerciseTwo() throws FileNotFoundException {
		String myVariable;

		// Specify file to use
		File myFile = new File("src/readFromFile/Quotes.txt");

		// Use Scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		// Read 3 lines and output
		for (int i = 1; i <= 3; i++) {
			myVariable = inputFile.nextLine();
			System.out.printf("%d: %s\n", i, myVariable);
		}

		inputFile.close();
	}

	private static void exerciseThree(Scanner keyboard) throws IOException {
		String myVariable;
		int inpt;

		File myFile = new File("src/readFromFile/Quotes.txt");
		Scanner inputFile = new Scanner(myFile);
		System.out.printf("Output which line?: ");
		inpt = keyboard.nextInt();

		for (int i = 1; i <= inpt; i++) {
			myVariable = inputFile.nextLine();
			if (i == inpt) {
				System.out.printf("%d: %s\n", i, myVariable);
			}
		}

		inputFile.close();
	}

	private static void exerciseFour(Scanner keyboard) throws IOException {
		String myVariable, fileName;
		int inpt;

		System.out.printf("Enter the filename: ");
		fileName = keyboard.next();
		System.out.printf("Output which line?: ");
		inpt = keyboard.nextInt();
		File myFile = new File("src/readFromFile/" + fileName);
		Scanner inputFile = new Scanner(myFile);

		for (int i = 1; i <= inpt; i++) {
			myVariable = inputFile.nextLine();
			if (i == inpt) {
				System.out.printf("%d: %s\n", i, myVariable);
			}
		}

		inputFile.close();
	}

	private static void exerciseFive(Scanner keyboard) throws IOException {
		String myVariable, fileName;

		System.out.printf("Enter the filename: ");
		fileName = keyboard.next();
		File myFile = new File("src/readFromFile/" + fileName);
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext()) {
			myVariable = inputFile.nextLine();
			System.out.printf("%s\n", myVariable);
		}

		inputFile.close();
	}

	private static void exerciseSix() throws IOException {
		int current, total = 0, numbers = 0;

		File myFile = new File("src/readFromFile/Add_int_single.txt");
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext()) {
			current = inputFile.nextInt();
			System.out.printf("%d\n", current);
			total += current;
			numbers++;
		}
		System.out.printf("TOTAL OF ALL NUMBERS IN FILE IS: %d\nCOUNT OF ALL NUMBERS IN FILE IS: %d\n", total, numbers);
		inputFile.close();
	}

	private static void exerciseSeven() throws IOException {
		double current, total = 0;
		int numbers = 0;

		File myFile = new File("src/readFromFile/Add_Double.txt");
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext()) {
			current = inputFile.nextDouble();
			System.out.printf("%f\n", current);
			total += current;
			numbers++;
		}
		System.out.printf("TOTAL OF ALL NUMBERS IN FILE IS: %.2f\nCOUNT OF ALL NUMBERS IN FILE IS: %d\n", total,
				numbers);
		inputFile.close();
	}

	private static void exerciseEight() throws IOException {
		double[] temps = { 0D, 0D, 0D };
		String[] days = { "", "", "" };
		int iterator = 0;

		File myFile = new File("src/readFromFile/Temp.txt");
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext()) {
			days[iterator] = inputFile.next();
			temps[iterator] = inputFile.nextDouble();
			System.out.printf("DAY %d : %s - TEMPERATURE: %.1f\n\n", iterator + 1, days[iterator], temps[iterator]);
			iterator++;
		}
		inputFile.close();
	}

	private static void exerciseNine(Scanner keyboard) throws IOException {
		String fileName, tempLastName;

		System.out.printf("Enter file name (Employee.dat): ");
		fileName = keyboard.next();
		File myFile = new File("src/readFromFile/" + fileName);
		Scanner inputFile = new Scanner(myFile);
		System.out.printf("FILE OPENED IS: %s\n\nEMPLOYEE DETAILS\n\n--------------------\n", fileName);

		while (inputFile.hasNext()) {
			tempLastName = inputFile.next();
			System.out.printf("%s %s - RAISE WILL BE: %.2f\n--------------------\n", inputFile.next(), tempLastName,
					inputFile.nextDouble() * (inputFile.nextDouble() / 100));
		}
		inputFile.close();
	}

	private static void exerciseTen(Scanner keyboard) throws IOException {
		String fileName;
		int count = 0;

		System.out.printf("Enter file name: ");
		fileName = keyboard.next();
		File myFile = new File("src/readFromFile/" + fileName);
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext()) {
			inputFile.nextLine();
			count++;
		}
		System.out.printf("This file has %d lines of text.\n", count);
		inputFile.close();
	}

	private static void exerciseEleven(Scanner keyboard) throws IOException {
		String fileName;

		System.out.printf("Enter the filename: ");
		fileName = keyboard.next();

		File myFile = new File("src/readFromFile/" + fileName);
		if (!myFile.exists()) {
			System.out.printf("No such file. Exiting program...");
			keyboard.close();
			return;
		}
		Scanner inputFile = new Scanner(myFile);
		System.out.printf("File exists. Outputting first line from file...\n\n%s\n", inputFile.nextLine());
		inputFile.close();
	}

	private static void exerciseTwelve() throws IOException {
		String fileName;
		int count = 1;

		fileName = JOptionPane.showInputDialog(null, "Enter the filename (random.txt):");
		File myFile = new File("src/readFromFile/" + fileName);
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext()) {
			inputFile.next();
			count++;
		}
		JOptionPane.showMessageDialog(null, "This file has " + count + " words.");
		inputFile.close();
	}

	private static void exerciseThirteen() throws IOException {
		int quoteNo;
		Random rand = new Random();
		quoteNo = rand.nextInt(1900) + 1;

		File myFile = new File("src/readFromFile/random.txt");
		Scanner inputFile = new Scanner(myFile);

		for (int i = 1; i < quoteNo; i++) {
			inputFile.nextLine();
		}
		JOptionPane.showMessageDialog(null, "Random Quote of the Day\n\n" + inputFile.nextLine() + "\n\n");
		inputFile.close();
	}

	private static void exerciseFourteen() throws IOException {
		final double PI = 3.1415926535897932384;
		double rad, cir, len, wid, areaR, areaC;
		File inFile = new File("src/readFromFile/rectangle.txt");
		File outFile = new File("src/readFromFile/dataOut.txt");
		Scanner inputFile = new Scanner(inFile);
		PrintWriter outputFile = new PrintWriter(outFile);
		len = inputFile.nextDouble();
		wid = inputFile.nextDouble();
		rad = inputFile.nextDouble();
		inputFile.close();

		areaR = len * wid;
		areaC = PI * (rad * rad);
		cir = 2 * PI * rad;
		outputFile.printf(
				"Rectangle:\nLength = %.2f, width = %.2f, area = %.2f\n\nCircle:\nRadius = %.2f, area = %.2f, circumference = %.2f",
				len, wid, areaR, rad, areaC, cir);
		outputFile.close();
	}

	private static void exerciseFifteen() throws FileNotFoundException {
		int year = Year.now().getValue();
		String fname;
		File inFile = new File("src/readFromFile/dataIn.txt");
		Scanner inputFile = new Scanner(inFile);
		while (inputFile.hasNext()) {
			fname = inputFile.next();
			System.out.printf("Name: %s, %s - Age: %d\n", inputFile.next(), fname, year - inputFile.nextInt());
		}
		inputFile.close();
	}

	private static void exerciseSixteen() throws IOException {
		int year = Year.now().getValue();
		String fname;
		File inFile = new File("src/readFromFile/dataInMulti.txt");
		Scanner inputFile = new Scanner(inFile);
		while (inputFile.hasNext()) {
			fname = inputFile.next();
			System.out.printf("Name: %s, %s - Age: %d\n\n", inputFile.next(), fname, year - inputFile.nextInt());
		}
		inputFile.close();
	}

	private static void exerciseSeventeen() throws IOException {
		String fileName;
		fileName = JOptionPane.showInputDialog(null, "Enter name of file to copy:");
		File inFile = new File("src/readFromFile/" + fileName);
		File outFile = new File("src/readFromFile/COPY - " + fileName);
		Scanner inputFile = new Scanner(inFile);
		PrintWriter outputFile = new PrintWriter(outFile);
		while (inputFile.hasNext()) {
			outputFile.printf("%s", inputFile.nextLine());
			if (inputFile.hasNext())
				outputFile.printf("\n");
		}
		JOptionPane.showMessageDialog(null, "FILE COPY COMPLETE!");
		inputFile.close();
		outputFile.close();
	}

	private static void exerciseEighteen() throws FileNotFoundException {
		String fileName1, fileName2;
		fileName1 = JOptionPane.showInputDialog(null, "Enter first file to merge:");
		fileName2 = JOptionPane.showInputDialog(null, "Enter second file to merge:");
		File inFile1 = new File("src/readFromFile/" + fileName1);
		File inFile2 = new File("src/readFromFile/" + fileName2);
		File outFile = new File("src/readFromFile/merged.txt");
		Scanner inputFile1 = new Scanner(inFile1);
		Scanner inputFile2 = new Scanner(inFile2);
		PrintWriter outputFile = new PrintWriter(outFile);
		while (inputFile1.hasNext()) {
			outputFile.printf("%s\n", inputFile1.nextLine());
		}
		while (inputFile2.hasNext()) {
			outputFile.printf("%s", inputFile2.nextLine());
			if (inputFile2.hasNext())
				outputFile.printf("\n");
		}
		JOptionPane.showMessageDialog(null, "FILE MERGE COMPLETE!");
		inputFile1.close();
		inputFile2.close();
		outputFile.close();
	}

	private static void exerciseNineteen() throws IOException {
		String fileName1, fileName2, truthS;
		boolean truth = true;
		fileName1 = JOptionPane.showInputDialog(null, "Enter first file to compare:");
		fileName2 = JOptionPane.showInputDialog(null, "Enter second file to compare:");
		File inFile1 = new File("src/readFromFile/" + fileName1);
		File inFile2 = new File("src/readFromFile/" + fileName2);
		Scanner inputFile1 = new Scanner(inFile1);
		Scanner inputFile2 = new Scanner(inFile2);
		while (inputFile1.hasNext() && truth) {
			if (inputFile2.hasNext()) {
				if (!inputFile1.nextLine().equals(inputFile2.nextLine()))
					truth = false;
			}
		}
		// truthS = truth ? "Files are identical." : "Files are different.";
		if (truth) {
			truthS = "Files are identical.";
			JOptionPane.showMessageDialog(null, truthS);
		} else {
			truthS = "Files are different.";
			JOptionPane.showMessageDialog(null, truthS, "WARNING", JOptionPane.ERROR_MESSAGE);
		}
		inputFile1.close();
		inputFile2.close();
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour(scanner);

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive(scanner);

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix();

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven();

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight();

		System.out.println("\n===== Exercise 9 =====");
		exerciseNine(scanner);

		System.out.println("\n===== Exercise 10 =====");
		exerciseTen(scanner);

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven(scanner);

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

		System.out.println("\n===== Exercise 19 =====");
		exerciseNineteen();

		scanner.close();
	}
}