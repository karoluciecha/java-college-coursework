package input;

import java.util.Scanner;

public class EverythingThree {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";

	private static void exerciseOne(Scanner console) {
		double maths, phy, chem, sum;
		System.out.print("Enter your score in Mathematics (%): ");
		maths = console.nextDouble();
		System.out.print("Enter your score in Physics (%): ");
		phy = console.nextDouble();
		System.out.print("Enter your score in Chemistry (%): ");
		chem = console.nextDouble();
		sum = maths + phy + chem;
		if ((maths >= 65) && (phy >= 55) && (chem >= 50) && (sum >= 190)) {
			System.out.println("The candidate is eligible for admission.");
		} else {
			System.out.println("The candidate is not eligible for admission.");
		}
	}

	private static void exerciseTwo(Scanner console) {
		double n1;
		System.out.print("Enter a number: ");
		n1 = console.nextDouble();
		if ((n1 % 3) == 0) {
			System.out.println("Divisible by 3.");
		} else {
			System.out.println("Not divisible by 3.");
		}
	}

	private static void exerciseThree(Scanner console) {
		int customerID, units;
		String name;
		System.out.print("Enter customer ID: ");
		customerID = console.nextInt();
		System.out.print("Enter customer name: ");
		console.nextLine();
		name = console.nextLine();
		System.out.print("Enter number of units consumed: ");
		units = console.nextInt();
		System.out.println("- - - - - CUSTOMER BILL - - - - -");
		System.out.println("Customer ID: " + customerID);
		System.out.println("Customer name: " + name);
		System.out.println("Units consumed: " + units);
		if (units <= 199) {
			System.out.println("Total amount to pay: " + (units * 1.20));
		} else if ((units > 200) && (units <= 400)) {
			System.out.println("Total amount to pay: " + (units * 1.50));
		} else {
			System.out.println("Total amount to pay: too much units!");
		}
	}

	private static void exerciseFour(Scanner console) {
		double n1, d3, d5;
		System.out.print("Enter a number: ");
		n1 = console.nextDouble();
		d3 = n1 % 3;
		d5 = n1 % 5;
		if ((d3 == 0) && (d5 == 0)) {
			System.out.println("Fizz Buzz");
		} else if (d3 == 0) {
			System.out.println("Fizz");
		} else if (d5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("Number is not divisible by 3 nor 5.");
		}
	}

	private static void exerciseFive(Scanner console) {
		char attendLab, submitProgram1, submitProgram3, programByDeadline;
		System.out.print("Did you attend lab this week? [y/n]: " + ANSI_GREEN);
		attendLab = console.next().charAt(0);
		if ((attendLab == 'y') || (attendLab == 'Y')) {
			System.out.print(ANSI_RESET + "Did you submit program 1 to D2L? [y/n]: " + ANSI_GREEN);
			submitProgram1 = console.next().charAt(0);
			if ((submitProgram1 == 'y') || (submitProgram1 == 'Y')) {
				System.out.print(ANSI_RESET + "Did you submit the program by the deadline? [y/n]: " + ANSI_GREEN);
				programByDeadline = console.next().charAt(0);
				if ((programByDeadline == 'y') || (programByDeadline == 'Y')) {
					System.out.println(
							ANSI_RESET + "\nCongratulations! You fulfilled your lab obligations for this week.");
				} else if ((programByDeadline == 'n') || (programByDeadline == 'N')) {
					System.out.println(ANSI_RESET
							+ "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
				} else {
					System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
				}
			} else if ((submitProgram1 == 'n') || (submitProgram1 == 'N')) {
				System.out.println(ANSI_RESET
						+ "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
			} else {
				System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
			}
		} else if ((attendLab == 'n') || (attendLab == 'N')) {
			System.out.print(ANSI_RESET + "Did you submit program 3 to D2L? [y/n]: " + ANSI_GREEN);
			submitProgram3 = console.next().charAt(0);
			if ((submitProgram3 == 'y') || (submitProgram3 == 'Y')) {
				System.out.print(ANSI_RESET + "Did you submit the program by the deadline? [y/n]: " + ANSI_GREEN);
				programByDeadline = console.next().charAt(0);
				if ((programByDeadline == 'y') || (programByDeadline == 'Y')) {
					System.out.println(
							ANSI_RESET + "\nCongratulations! You fulfilled your lab obligations for this week.");
				} else if ((programByDeadline == 'n') || (programByDeadline == 'N')) {
					System.out.println(ANSI_RESET
							+ "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
				} else {
					System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
				}
			} else if ((submitProgram3 == 'n') || (submitProgram3 == 'N')) {
				System.out.println(ANSI_RESET
						+ "\nSorry, you did not fultill your lab obligations for the week.\nPlease try to get your program submitted on time in the future!");
			} else {
				System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
			}
		} else {
			System.out.println(ANSI_RESET + "\nNot a valid input! Try again.");
		}
	}

	private static void exerciseSix(Scanner console) {
		int number;
		System.out.print("Enter a number: ");
		number = console.nextInt();
		boolean positive = (number > 0);
		boolean divisibleBy2 = ((number % 2) == 0);
		if (positive && divisibleBy2) {
			System.out.println("Number " + number + " is positive and divisible by 2.");
		} else {
			System.out.println("Number " + number + " is negative and/or non-divisible by 2.");
		}
	}

	private static void exerciseSeven(Scanner console) {
		char c1, c2;
		System.out.print("Enter first character: ");
		c1 = console.next().charAt(0);
		System.out.print("Enter second character: ");
		c2 = console.next().charAt(0);
		if (c1 == c2) {
			System.out.println("The first character: " + c1 + " is the same as the second character: " + c2 + ".");
		} else {
			System.out.println("The first character: " + c1 + " is not the same as the second character: " + c2 + ".");
		}
	}

	private static void exerciseEight(Scanner console) {
		double n1, n2;
		System.out.print("Enter first number: ");
		n1 = console.nextDouble();
		System.out.print("Enter second number: ");
		n2 = console.nextDouble();
		if (n1 == n2) {
			System.out.println("The first number: " + n1 + " is the same as the second number: " + n2 + ".");
		} else {
			System.out.println("The first number: " + n1 + " is not the same as the second number: " + n2 + ".");
		}
	}

	private static void exerciseNine(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String s1, s2;
		System.out.print("Enter first string: ");
		s1 = console.nextLine();
		System.out.print("Enter second string: ");
		s2 = console.nextLine();
		if (s1.equals(s2)) {
			System.out.println("The first string: " + s1 + " is the same as the second string: " + s2 + ".");
		} else {
			System.out.println("The first string: " + s1 + " is not the same as the second string: " + s2 + ".");
		}
	}

	private static void exerciseTen(Scanner console) {
		double temperatureB, temperatureA;
		char unit;
		System.out.println("-- Temperature Converter --");
		System.out.print("Please enter a temperature: ");
		temperatureB = console.nextDouble();
		System.out.print("Is this temperature in Fahrenheit or Celsius? (F/C): ");
		unit = console.next().charAt(0);
		if ((unit == 'c') || (unit == 'C')) {
			temperatureA = (temperatureB * (9.0 / 5.0)) + 32;
			System.out.println("\nThe temperature in Celsius is: " + temperatureA + ".");
		} else if ((unit == 'f') || (unit == 'F')) {
			temperatureA = ((temperatureB - 32) * (5.0 / 9.0));
			System.out.println("\nThe temperature in Fahrenheit is: " + temperatureA + ".");
		}
	}

	private static void exerciseEleven(Scanner console) {
		double y;
		int x = 0;
		System.out.print("Enter a number: ");
		y = console.nextDouble();
		if (y > 0) {
			x = 1;
		}
		System.out.println("X: " + x + ".");
	}

	private static void exerciseTwelve(Scanner console) {
		int id;
		String fname, sname;
		double maths, chem, hist, avg;

		System.out.print("Enter student ID: ");
		id = console.nextInt();
		console.nextLine();
		System.out.print("Enter student first name: ");
		fname = console.nextLine();
		System.out.print("Enter student surname: ");
		sname = console.nextLine();
		System.out.print("Enter result for Maths: ");
		maths = console.nextDouble();
		System.out.print("Enter result for Chemistry: ");
		chem = console.nextDouble();
		System.out.print("Enter result for History: ");
		hist = console.nextDouble();

		avg = (maths + hist + chem) / 3;

		System.out
				.println("\nStudent ID: " + id + "\nStudent name: " + fname + " " + sname + "\nAverage score: " + avg);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo(scanner);

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour(scanner);

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive(scanner);

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix(scanner);

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven(scanner);

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight(scanner);

		System.out.println("\n===== Exercise 9 =====");
		exerciseNine(scanner);

		System.out.println("\n===== Exercise 10 =====");
		exerciseTen(scanner);

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven(scanner);

		System.out.println("\n===== Exercise 12 =====");
		exerciseTwelve(scanner);

		scanner.close();
	}
}