package loops;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne(Scanner console) {
		double number = 0D;

		do {
			System.out.printf("Enter a number: ");
			number = console.nextDouble();
		} while ((number >= 0) && (number <= 50));
	}

	private static void exerciseTwo(Scanner console) {
		double number = 0D;
		char answer;

		do {
			System.out.printf("Enter a number: ");
			number = console.nextDouble();
			if ((number % 2) == 0) {
				System.out.printf("Number is even.\n");
			} else {
				System.out.printf("Number is odd.\n");
			}
			System.out.printf("Enter Y to continue: ");
			answer = console.next().charAt(0);
			answer = Character.toLowerCase(answer);
		} while (answer == 'y');
	}

	private static void exerciseThree(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String pass;

		do {
			System.out.printf("Enter password: ");
			pass = console.nextLine();
		} while (!pass.equals("mypass"));
		System.out.printf("Access granted!\n");
	}

	private static void exerciseFour() {
		int number1 = 10;
		System.out.printf("Variable value is: %d\n", number1);
		System.out.printf("Variable value is: %d\n", number1++);
	}

	private static void exerciseFive() {
		int test = 5;
		while (test > 0) {
			System.out.print("This is inside the while loop! Test value is " + test + ". ");
			test--;
		}
		System.out.println();
	}

	private static void exerciseSix(Scanner console) {
		String words;
		int count = -1;
		do {
			System.out.printf("What word(s) will be output: ");
			words = console.nextLine();
		} while (words.equals(""));
		do {
			System.out.printf("Enter number of times word should be printed: ");
			count = console.nextInt();
		} while (count < 0);
		while (count > 0) {
			System.out.println(words);
			count--;
		}
	}

	private static void exerciseSeven(Scanner console) {
		char answer;
		int count = 0;

		do {
			System.out.printf("Value of number variable is %d\n", count);
			System.out.printf("Enter Y to continue: ");
			answer = console.next().charAt(0);
			answer = Character.toLowerCase(answer);
			count++;
		} while (answer == 'y');
	}

	private static void exerciseEight(Scanner console) {
		double number = 0D, result = 0D;

		while (true) {
			System.out.printf("Enter a number: ");
			number = console.nextDouble();
			if (number < 0) {
				break;
			}
			result += number;
		}
		System.out.printf("Sum of all numbers entered is: %.2f.\n\n", result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo(scanner);

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour();

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive();

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix(scanner);

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven(scanner);

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight(scanner);

		scanner.close();
	}
}