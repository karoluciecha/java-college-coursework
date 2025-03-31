package conditions;

import java.lang.reflect.Field;
import java.util.Scanner;

public class EverythingOne {
	public int num1 = 50;

	private static void exerciseOne() {
		try {
			// Create a new instance of EverythingOne
			EverythingOne newObject = new EverythingOne();

			// Get the class object
			Class<?> newClassObject = newObject.getClass();

			// Get the public field named "num1"
			Field variable = newClassObject.getField("num1");

			// Retrieve the value of the field dynamically
			int value = (int) variable.get(newObject);

			// Print field name and its value
			System.out.println(variable.getName() + " variable is: " + value);

			// Conditional check on the value
			if (value > 50) {
				System.out.println("Value is greater than 50!");
			} else if (value == 50) {
				System.out.println("Value is exactly 50!");
			} else {
				System.out.println("Value is less than 50!");
			}

		} catch (NoSuchFieldException | IllegalAccessException e) {
			System.out.println("Error accessing the field: " + e.getMessage());
		}
	}

	private static void exerciseTwo(Scanner console) {
		System.out.print("Enter current temperature: ");
		double temperature = console.nextDouble();
		if (temperature > 25) {
			System.out.println("It's hot outside!");
		} else if (temperature < 5) {
			System.out.println("It's cold outside!");
		} else {
			System.out.println("It's okay outside!");
		}
	}

	private static void exerciseThree(Scanner console) {
		int day;
		System.out.print("Enter day number (1 - 7): ");
		day = console.nextInt();
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Not a valid day number!");
		}
	}

	private static void exerciseFour(Scanner console) {
		int userNumber;
		System.out.print("Enter a number: ");
		userNumber = console.nextInt();
		if (userNumber < 0) {
			System.out.println("The number you entered is negative");
		} else if (userNumber > 0) {
			System.out.println("The number you entered is positive");
		} else if (userNumber == 0) {
			System.out.println("The number you entered equals 0");
		} else {
			System.out.println("NaN?");
		}
	}

	private static void exerciseFive(Scanner console) {
		int firstNum, secondNum;
		System.out.print("Enter first number: ");
		firstNum = console.nextInt();
		System.out.print("Enter second number: ");
		secondNum = console.nextInt();
		if (firstNum < secondNum) {
			System.out.println("The second number is greater than the first number");
		} else if (firstNum > secondNum) {
			System.out.println("The first number is greater than the second number");
		} else if (firstNum == secondNum) {
			System.out.println("The numbers are equal!");
		} else {
			System.out.println("NaN?");
		}
	}

	private static void exerciseSix(Scanner console) {
		double n1, n2;
		char action;
		System.out.print("Enter first number: ");
		n1 = console.nextDouble();
		System.out.print("Enter second number: ");
		n2 = console.nextDouble();
		System.out.print("Enter operator (a, s, d, m): ");
		action = console.next().charAt(0);
		action = Character.toLowerCase(action);
		if (action == 'a') {
			System.out.println(n1 + " plus " + n2 + " is: " + (n1 + n2));
		} else if (action == 's') {
			System.out.println(n1 + " minus " + n2 + " is: " + (n1 - n2));
		} else if (action == 'd') {
			System.out.println(n1 + " divided by " + n2 + " is: " + (n1 / n2));
		} else if (action == 'm') {
			System.out.println(n1 + " multiplied by " + n2 + " is: " + (n1 * n2));
		} else {
			System.out.println("That's not a valid option!");
		}
	}

	private static void exerciseSeven(Scanner console) {
		int score;
		System.out.print("Enter score number: ");
		score = console.nextInt();
		if (score > 100) {
			System.out.println("An incorrect score was entered");
		} else if (score >= 70) {
			System.out.println("Score of " + score + ". Grade is A");
		} else if (score >= 60) {
			System.out.println("Score of " + score + ". Grade is B");
		} else if (score >= 50) {
			System.out.println("Score of " + score + ". Grade is C");
		} else if (score >= 40) {
			System.out.println("Score of " + score + ". Grade is D");
		} else if (score >= 0) {
			System.out.println("Score of " + score + "is less than 40. Grade is E");
		} else {
			System.out.println("An incorrect score was entered");
		}
	}

	private static void exerciseEight() {
		int a = 20, b = 30, c = 3;
		if (a > 10) {
			System.out.println("A greater than 10\n");
		}
		if (a > b) {
			System.out.println("A greater than B\n");
		} else {
			System.out.println("A less than B\n");
		}

		if (a == b) {
			System.out.println("A euals B\n");
		} else if (a > b) {
			System.out.println("A greater than B\n");
		} else {
			System.out.println("A less than B\n");
		}

		if ((a == 1) && (b == 2) && (c == 3)) {
			System.out.println("a is 1, b is 2, c is 3 (with And &&)");
		} else {
			System.out.println("Not: a is 1, b is 2, c is 3 (with And &&)");
		}
	}

	private static void exerciseNine(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String s1, s2;

		System.out.print("Enter s1: ");
		s1 = console.nextLine();
		System.out.print("Enter s2: ");
		s2 = console.nextLine();

		System.out.println("\nString s1 contains: " + s1 + " with length: " + s1.length());
		System.out.println("String s1 Upper Case: " + s1.toUpperCase());

		System.out.println("\nString s2 contains: " + s2 + " with length: " + s2.length());
		System.out.println("String s2 Lower Case: " + s2.toLowerCase());

		if (s1.equals(s2)) {
			System.out.println(s1 + " equals " + s2);
		} else {
			System.out.println(s1 + " NOT equals " + s2);
		}

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println(s1 + " equals ignore case " + s2);
		} else {
			System.out.println(s1 + " NOT equals ignore case " + s2);
		}

		if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + " compareTo (less than) " + s2);
		} else if (s1.compareTo(s2) > 0) {
			System.out.println(s1 + " compareTo (greater than) " + s2);
		} else {
			System.out.println(s1 + " compareTo (equal) " + s2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n===== Exercise 1 =====");
		exerciseOne();

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
		exerciseEight();

		System.out.println("\n===== Exercise 9 =====");
		exerciseNine(scanner);

		scanner.close();
	}
}