package jOptionPane;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EverythingOne {

	private static void exerciseOne() {
		JOptionPane.showMessageDialog(null, "Hello World!");
	}

	private static void exerciseTwo() {
		int num1 = 55, num2 = 44;
		JOptionPane.showMessageDialog(null, "num1 + num2 = " + (num1 + num2));
	}

	private static void exerciseThree(Scanner console) {
		String name;
		System.out.printf("Enter your name: ");
		name = console.next();
		JOptionPane.showMessageDialog(null, "Hello " + name + "\n\nWelceome to the program!");
	}

	private static void exerciseFour() {
		String name;
		name = JOptionPane.showInputDialog(null, "Enter Your Name:");
		JOptionPane.showMessageDialog(null, "Hello " + name + "\n\nThis was created using swing!\n\n");
	}

	private static void exerciseFive() {
		String fname, sname, address;
		fname = JOptionPane.showInputDialog(null, "Enter your first name:");
		sname = JOptionPane.showInputDialog(null, "Enter your surname:");
		address = JOptionPane.showInputDialog(null, "Enter your address:");
		JOptionPane.showMessageDialog(null,
				"Frst name: " + fname + "\nSurname: " + sname + "\n********************\nAddress: " + address);
	}

	private static void exerciseSix() {
		String username, password;
		username = JOptionPane.showInputDialog(null, "Enter a username:");
		password = JOptionPane.showInputDialog(null, "Enter a password:");

		if (username.equalsIgnoreCase("bob") && password.equals("pass")) {
			JOptionPane.showMessageDialog(null, "Welcome " + username + " - User level access granted!");
		} else if (username.equalsIgnoreCase("admin") && password.equals("super")) {
			JOptionPane.showMessageDialog(null, "Welcome " + username + " - Admin level access granted!");
		} else {
			JOptionPane.showMessageDialog(null, "Access is denied!");
		}
	}

	private static void exerciseSeven() {
		double wage;
		char grade;
		String wageDisplay;
		wage = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter employee current weekly wage:"));
		grade = JOptionPane.showInputDialog(null, "Enter employee grade (A, B or C):").charAt(0);

		switch (grade) {
		case 'A':
		case 'a':
			wageDisplay = String.format("%.2f", wage + 100);
			JOptionPane.showMessageDialog(null, "Grade A employee: This weeks wage plus bonus is " + wageDisplay + ".");
			break;
		case 'B':
		case 'b':
			wageDisplay = String.format("%.2f", wage + 50);
			JOptionPane.showMessageDialog(null, "Grade B employee: This weeks wage plus bonus is " + wageDisplay + ".");
			break;
		case 'C':
		case 'c':
			wageDisplay = String.format("%.2f", wage + 15);
			JOptionPane.showMessageDialog(null, "Grade C employee: This weeks wage plus bonus is " + wageDisplay + ".");
			break;
		default:
			wageDisplay = String.format("%.2f", wage);
			JOptionPane.showMessageDialog(null, "Grade is out of bonus scale: This weeks wage is " + wageDisplay + ".");
			break;
		}
	}

	private static void exerciseEight() {
		double num1, num2;
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter first number:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter second number:"));
		JOptionPane.showMessageDialog(null, "First number entered: " + num1 + "\nSecond number entered: " + num2 + "\n"
				+ num1 + " plus " + num2 + " = " + (num1 + num2));
	}

	private static void exerciseNine() {
		int num1, num2;
		char operator;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number:"));
		operator = JOptionPane
				.showInputDialog(null, "Enter operator: A to add, S to substract, M to multiply, D to divide")
				.toLowerCase().charAt(0);
		switch (operator) {
		case 'a':
			JOptionPane.showMessageDialog(null, (num1 + num2));
			break;
		case 's':
			JOptionPane.showMessageDialog(null, (num1 - num2));
			break;
		case 'm':
			JOptionPane.showMessageDialog(null, (num1 * num2));
			break;
		case 'd':
			JOptionPane.showMessageDialog(null, (num1 / num2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Unknown operator!", null, JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	private static void exerciseTen() {
		double num1, num2;
		char operator;
		String division;
		while (true) {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter first number:"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter second number:"));
			operator = JOptionPane.showInputDialog(null, "Enter operator (A, S, D or M - or type Exit to end):")
					.toLowerCase().charAt(0);
			switch (operator) {
			case 'a':
				JOptionPane.showMessageDialog(null, (num1 + num2));
				break;
			case 's':
				JOptionPane.showMessageDialog(null, (num1 - num2));
				break;
			case 'm':
				JOptionPane.showMessageDialog(null, (num1 * num2));
				break;
			case 'd':
				division = String.format("%.5f", (num1 / num2));
				JOptionPane.showMessageDialog(null, division);
				break;
			case 'e':
				return;
			default:
				JOptionPane.showMessageDialog(null, "Unknown operator!", null, JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
	}

	private static void exerciseEleven() {
		final double EURO_TO_STERLING = 0.8391;
		final double STERLING_TO_EURO = 1.1917;
		double amount;
		char operator;
		String result;
		operator = JOptionPane
				.showInputDialog(null, "Enter G to convert Sterling to Euros\nor E to convert Euros to Sterling:")
				.toLowerCase().charAt(0);
		amount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter amount:"));
		switch (operator) {
		case 'e':
			result = String.format("%.2f", (amount * EURO_TO_STERLING));
			JOptionPane.showMessageDialog(null, amount + " Euros is " + result + " Sterling");
			break;
		case 's':
			result = String.format("%.2f", (amount * STERLING_TO_EURO));
			JOptionPane.showMessageDialog(null, amount + " Euros is " + result + " Sterling");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Unknown operator!", "Error", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	private static void exerciseTwelve() {
		double sum = 0D;
		int repeats = 0;
		do {
			repeats = Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you wish to enter:"));
		} while (repeats <= 0);
		for (int i = 1; i <= repeats; i++) {
			sum += Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number " + i + ":"));
		}
		sum /= repeats;
		JOptionPane.showMessageDialog(null, "The average was " + sum + ".\n\nYou input " + repeats + " numbers.");
	}

	private static void exerciseThirteen() {
		int number;
		String result;
		number = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Multiplication Table\n\nEnter a number to generate multiplication tables for:"));
		result = String.format("%d times %d is %d", number, 1, number);
		for (int i = 2; i <= 10; i++) {
			result += String.format("\n%d times %d is %d", number, i, (number * i));
		}
		JOptionPane.showMessageDialog(null, result, number + " times tables", JOptionPane.PLAIN_MESSAGE);
	}

	private static void exerciseFourteen() {
		int times = 0;
		String words, message;
		words = JOptionPane.showInputDialog(null, "What word(s) will be output:");
		message = JOptionPane.showInputDialog(null, "What is the message title?");
		do {
			times = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Enter number of times word should be printed:"));
		} while (times <= 0);
		for (; times > 0; times--)
			JOptionPane.showMessageDialog(null, words + " " + times, message, JOptionPane.PLAIN_MESSAGE);
	}

	private static void exerciseFifteen() {
		int choice;
		choice = JOptionPane.showConfirmDialog(null, "Click yes or no.");
		if (choice == 0) {
			JOptionPane.showMessageDialog(null, "You clicked Yes!");
		} else if (choice == 1) {
			JOptionPane.showMessageDialog(null, "You clicked No!");
		} else if (choice == 2) {
			JOptionPane.showMessageDialog(null, "You clicked Cancel!");
		}
	}

	private static void exerciseSixteen() {
		int choice;
		choice = JOptionPane.showConfirmDialog(null, "Was the Java programming language first released in 1995?",
				"Yes or no?", JOptionPane.YES_NO_OPTION);
		if (choice == 0) {
			JOptionPane.showMessageDialog(null,
					"Yes, that's correct! The Java programming language was first released by Sun Microsystems in 1995.");
		} else if (choice == 1) {
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again.");
		}
	}

	private static void exerciseFeventeen() {
		int choice;
		String[] question = { "Was the Java programming language first released in 1995?",
				"Is Java an object-oriented language?", "Was the Java programming language developed by Bill Gates?" };
		String[] addition = { "", "", " - Bill Gates did not develop the Java programming language." };
		int[] truthTable = { 0, 0, 1 };
		choice = JOptionPane.showConfirmDialog(null, "Was the Java programming language first released in 1995?",
				"Yes or no?", JOptionPane.YES_NO_OPTION);
		if (choice == 0) {
			JOptionPane.showMessageDialog(null,
					"Yes, that's correct! The Java programming language was first released by Sun Microsystems in 1995.");
		} else if (choice == 1) {
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

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
		exerciseFeventeen();

		scanner.close();
	}
}