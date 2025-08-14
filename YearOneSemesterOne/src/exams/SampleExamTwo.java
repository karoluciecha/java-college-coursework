package exams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SampleExamTwo {

	private static void exerciseOne() {
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Random rnd = new Random();
        int day = rnd.nextInt(28) + 1, month = rnd.nextInt(12), year = 2023;
        JOptionPane.showMessageDialog(null, day + " " + monthName[month] + " " + year + "\n");
	}

	private static void exerciseTwo(Scanner console) {
		final double INCREMENT_VALUE = 0.05D;
		double startNum = 0D, endNum = 0D;
		int forCounter = 0;
		boolean checker = false;
		
		do {
			checker = false;
			System.out.printf("Enter starting number: ");
			try {
				startNum = console.nextDouble();
			}
			catch (Exception e) {
				System.out.printf("Please enter a real number!\n");
				console.nextLine();
				checker = true;
			}
		} while (checker);
		do {
			checker = false;
			System.out.printf("Enter finishing number: ");
			try {
				endNum = console.nextDouble();
			}
			catch (Exception e) {
				System.out.printf("Please enter a real number!\n");
				console.nextLine();
				checker = true;
			}
			if (startNum >= endNum) {
				System.out.printf("Finishing number must be greater than starting number!\n");
				checker = true;
			}
		} while (checker);
		for (; startNum <= endNum; startNum += INCREMENT_VALUE) {
			System.out.printf("%.2f, ", startNum);
			forCounter++;
			if (forCounter % 10 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n");
	}
	
	private static void exerciseThree() {
		String[] nameList = {"Gary", "Helen", "Ian", "Jane", "Kevin", "Dave", "Mary", "Noel", "Bob", "Alice"};
		Random rnd = new Random();
		int num1 = rnd.nextInt(11), num2 = 0, num3 = 0;
		do {
			num2 = rnd.nextInt(11);
		} while (num1 == num2);
		do {
			num3 = rnd.nextInt(11);
		} while ((num1 == num3) || (num2 == num3));
		System.out.printf("This program will select 3 random names from the following:\n");
		for (int i = 0; i < (nameList.length - 1); ++i) {
			System.out.printf("%s, ", nameList[i]);
		}
		System.out.printf("%s\n\nFirst random name is: %s\nSecond random name is: %s\nThird random name is: %s\n", nameList[nameList.length - 1], nameList[num1], nameList[num2], nameList[num3]);
	}

	private static void exerciseFour() throws IOException {
		final String EURO = "\u20ac";
		float gym = 9F, sauna = 12.5F, pt = 39F, beverage = 0F, snack = 0F, gift = 0F, totalCost = 0F;
		char[] pinLetter = {'A', 'B', 'C'};
		Random rnd = new Random();
		
	    File billsFolder = new File("bills");
	    if (!billsFolder.exists()) {
	        billsFolder.mkdirs();
	    }
		
		String pinNumber = String.format("%c%d", pinLetter[rnd.nextInt(3)], rnd.nextInt(900) + 100), billJOP, billFile, AI;
		int memNum = 0;
		String enteredPin = JOptionPane.showInputDialog(null, "Pass Pin: " + pinNumber + "\n\nConfirm access by entering Pass Pin:", "Input", JOptionPane.QUESTION_MESSAGE);
		if (!pinNumber.equals(enteredPin)) {
			JOptionPane.showMessageDialog(null, "Pass Pin entered is incorrect!\nGoodbye.", "PASS PIN INCORRECT", JOptionPane.ERROR_MESSAGE);
			return;
		}
		JOptionPane.showMessageDialog(null, "Welcome to\nTHE JAVA GYM", "Message", JOptionPane.INFORMATION_MESSAGE);
		FileWriter fWriterAI = new FileWriter(new File(billsFolder, "All items.txt"), true);
		PrintWriter pWriterAI = new PrintWriter(fWriterAI);
		do {
			gym = 9F;
			sauna = 12.5F;
			pt = 39F;
			beverage = 0F;
			snack = 0F;
			gift = 0F;
			totalCost = 0F;
			billJOP = "";
			billFile = "";
			memNum = 0;
			AI = "";
			if (JOptionPane.showConfirmDialog(null, "Do you want to set gym rates?", "Select an Option", JOptionPane.YES_NO_OPTION) == 0) {
				try {
					gym = Float.parseFloat(JOptionPane.showInputDialog(null, "Change gym only rate\n(Currently " + EURO + gym + ")" , "Input", JOptionPane.QUESTION_MESSAGE));
				}
				catch (Exception e) {}
				try {
					sauna = Float.parseFloat(JOptionPane.showInputDialog(null, "Change gym and sauna rate\n(Currently " + EURO + sauna + ")" , "Input", JOptionPane.QUESTION_MESSAGE));
				}
				catch (Exception e) {}
				try {
					pt = Float.parseFloat(JOptionPane.showInputDialog(null, "Change personal trainer rate\n(Currently " + EURO + pt + ")" , "Input", JOptionPane.QUESTION_MESSAGE));
				}
				catch (Exception e) {}
			}
			do {
				try {
					memNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter gym member number:" , "Input", JOptionPane.QUESTION_MESSAGE));
				}
				catch (Exception e) {}
			} while ((memNum < 100) || (memNum > 399));
			if (JOptionPane.showConfirmDialog(null, "Item Entry for member number " + memNum + "\nAdd beverage items?", "Select an Option", JOptionPane.YES_NO_OPTION) == 0) {
				try {
					beverage = Float.parseFloat(JOptionPane.showInputDialog(null, "Beverage cost:" , "Input", JOptionPane.QUESTION_MESSAGE));
				}
				catch (Exception e) {}
			}
			if (JOptionPane.showConfirmDialog(null, "Item Entry for member number " + memNum + "\nAdd snack items?", "Select an Option", JOptionPane.YES_NO_OPTION) == 0) {
				try {
					snack = Float.parseFloat(JOptionPane.showInputDialog(null, "Snack cost:" , "Input", JOptionPane.QUESTION_MESSAGE));
				}
				catch (Exception e) {}
			}
			if (JOptionPane.showConfirmDialog(null, "Item Entry for member number " + memNum + "\nAdd gift shop items?", "Select an Option", JOptionPane.YES_NO_OPTION) == 0) {
				try {
					gift = Float.parseFloat(JOptionPane.showInputDialog(null, "Gift shop cost:" , "Input", JOptionPane.QUESTION_MESSAGE));
				}
				catch (Exception e) {}
			}
			billJOP = String.format("Rate for ");
			billFile = "Charges for Gym Member " + memNum + "\n==========================\n\nRate for ";
			if (memNum >= 100 && memNum <= 199) {
				billJOP += String.format("gym only %d is %s%.2f\n\n", memNum, EURO, gym);
				billFile += String.format("gym only %d is %s%.2f\n\n", memNum, EURO, gym);
				AI = String.format("RATE FOR %d: %s%.2f\n\n", memNum, EURO, gym);
				totalCost += gym;
			}
			if (memNum >= 200 && memNum <= 299) {
				billJOP += String.format("sauna %d is %s%.2f\n\n", memNum, EURO, sauna);
				billFile += String.format("sauna %d is %s%.2f\n\n", memNum, EURO, sauna);
				AI = String.format("RATE FOR %d: %s%.2f\n\n", memNum, EURO, sauna);
				totalCost += sauna;
			}
			if (memNum >= 300 && memNum <= 399) {
				billJOP += String.format("personal trainer %d is %s%.2f\n\n", memNum, EURO, pt);
				billFile += String.format("personal trainer %d is %s%.2f\n\n", memNum, EURO, pt);
				AI = String.format("RATE FOR %d: %s%.2f\n\n", memNum, EURO, pt);
				totalCost += pt;
			}
			totalCost += beverage + snack + gift;
			billJOP += String.format("Item Entry for member number %d\n", memNum);
			billFile += "Item Entry for member number " + memNum + "\n";
			if (beverage != 0) {
				billJOP += String.format("Beverage cost: %s%.2f\n", EURO, beverage);
				billFile += String.format("Beverage cost: %s%.2f\n", EURO, beverage);
				pWriterAI.printf("Member %d - Beverage cost: %s%.2f\n", memNum, EURO, beverage);
			}
			if (snack != 0) {
				billJOP += String.format("Snack cost: %s%.2f\n", EURO, snack);
				billFile += String.format("Snack cost: %s%.2f\n", EURO, snack);
				pWriterAI.printf("Member %d - Snack cost: %s%.2f\n", memNum, EURO, snack);
			}
			if (gift != 0) {
				billJOP += String.format("Gift shop cost: %s%.2f\n", EURO, gift);
				billFile += String.format("Gift shop cost: %s%.2f\n", EURO, gift);
				pWriterAI.printf("Member %d - Gift shop cost: %s%.2f\n", memNum, EURO, gift);
			}
			billJOP += String.format("\n\n\nTOTAL COST: %s%.2f\n", EURO, totalCost);
			billFile += String.format("\n\nTOTAL COST: %s%.2f\n", EURO, totalCost);
			JOptionPane.showMessageDialog(null, billJOP, "TOTAL BILL", JOptionPane.PLAIN_MESSAGE);
			FileWriter fWriter = new FileWriter("bills" + File.separator + memNum + ".txt", false);
			PrintWriter pWriter = new PrintWriter(fWriter);
			pWriter.printf("%s", billFile);
			pWriter.close();
			pWriterAI.printf("%s", AI);
			if(JOptionPane.showConfirmDialog(null, "End of item entry.\n\nWould you like to calculate bill for another member?", "Select an Option", JOptionPane.YES_NO_OPTION) == 1) break;
	} while (true);
		pWriterAI.close();
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo(scanner);
		
		System.out.println("===== Exercise 3 =====");
		exerciseThree();

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour();

		scanner.close();
	}
}