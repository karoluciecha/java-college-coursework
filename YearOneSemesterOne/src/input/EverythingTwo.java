package input;

import java.util.Scanner;

public class EverythingTwo {

	private static void exerciseOne() {
		int number1;
		number1 = 10;

		if (number1 < 55) {
			System.out.println("This is an output from an if statement!");
		}
	}

	private static void exerciseTwo() {
		double num1 = 0;
		if (num1 > 0) {
			System.out.println("Number is greater than zero");
		}
		if (num1 < 0) {
			System.out.println("Number is less than zero");
		}
		if (num1 == 0) {
			System.out.println("Number is zero");
		}
	}

	private static void exerciseThree() {
		double number1 = 12.25;
		if (number1 < 15) {
			System.out.println("Number is less than 15");
		} else if (number1 == 15) {
			System.out.println("Number is equal to 15");
		}
		System.out.println("END OF PROGRAM!");
	}

	private static void exerciseFour() {
		int n1 = 0;
		if (n1 < 0) {
			System.out.println("Value of n1 is " + n1 + ". That's negative!");
		} else if (n1 >= 0) {
			System.out.println("Value of n1 is " + n1 + ". That's positive!");
		}
	}

	private static void exerciseFive() {
		int age = 17;
		System.out.println("If you are " + age + " years old . . . You are:");
		if (age < 13) {
			System.out.println("\ttoo young to create a Facebook account");
		} else {
			System.out.println("\told enough to create a Facebook account");
		}
		if (age < 16) {
			System.out.println("\ttoo young to get a driver's license");
		} else {
			System.out.println("\told enough to get a driver's license");
		}
		if (age < 18) {
			System.out.println("\ttoo young to vote");
			System.out.println("\ttoo young to buy alcohol");
		} else {
			System.out.println("\told enough to vote");
			System.out.println("\told enough to buy alcohol");
		}
		if (age < 21) {
			System.out.println("\ttoo young to become a T.D");
		} else {
			System.out.println("\told enough to become a T.D");
		}
		if (age > 50) {
			System.out.println("\tgetting old");
		} else {
			System.out.println("\tstill young");
		}
	}

	private static void exerciseSix(Scanner console) {
		double n1;
		System.out.print("Enter number: ");
		n1 = console.nextDouble();
		if (n1 < 100) {
			System.out.println("Number you entered is less than 100");
		} else {
			System.out.println("Number you entered is 100 or greater!");
		}
	}

	private static void exerciseSeven(Scanner console) {
		double n1, n2;
		char action;
		System.out.print("Enter first number: ");
		n1 = console.nextDouble();
		System.out.print("Enter second number: ");
		n2 = console.nextDouble();
		System.out.print("Would you like to add (+), substract (-), divide (/), multiply (*) or modulo (%)?: ");
		action = console.next().charAt(0);
		if (action == '+') {
			System.out.println("Answer is: " + (n1 + n2));
		} else if (action == '-') {
			System.out.println("Answer is: " + (n1 - n2));
		} else if (action == '/') {
			System.out.println("Answer is: " + (n1 / n2));
		} else if (action == '*') {
			System.out.println("Answer is: " + (n1 * n2));
		} else if (action == '%') {
			System.out.println("Answer is: " + (n1 % n2));
		} else {
			System.out.println("No such option!");
		}
	}

	private static void exerciseEight(Scanner console) {
		double n1, n2;
		System.out.print("Enter first number: ");
		n1 = console.nextDouble();
		System.out.print("Enter second number: ");
		n2 = console.nextDouble();
		if (n1 == n2) {
			System.out.println("The numbers are the same!");
		} else if (n1 > n2) {
			System.out.println("The first number, " + n1 + ", is greater than the second number, " + n2 + ".");
		} else if (n1 < n2) {
			System.out.println("The second number, " + n2 + ", is greater than the first number, " + n1 + ".");
		}
	}

	private static void exerciseNine(Scanner console) {
		double n1;
		System.out.print("Enter number: ");
		n1 = console.nextDouble();
		if ((n1 % 2) == 0) {
			System.out.println("The number entered is even.");
		} else {
			System.out.println("The number entered is odd.");
		}
	}

	private static void exerciseTen(Scanner console) {
		final int COST = 99;
		final double DISCOUNT = 9.9D;
		int n1;
		System.out.print("Enter quantity being purchased: ");
		n1 = console.nextInt();
		if (n1 <= 10) {
			System.out.println("Cost is: " + (COST * n1) + ".");
			System.out.println("There is no discount on this order.");
		} else {
			System.out.println("Cost is: " + (n1 * (COST - DISCOUNT)) + ".");
			System.out.println("You recieved a discount of: " + (DISCOUNT * n1) + ".");
			System.out.println("Cost without discount would normally be: " + (n1 * COST) + ".");
		}
	}

	private static void exerciseEleven(Scanner console) {
		int day;
		System.out.print("Enter a day number (1 - 7): ");
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

	private static void exerciseTwelve(Scanner console) {
		int month;
		System.out.print("Enter month number (1 - 12): ");
		month = console.nextInt();
		if (month == 1) {
			System.out.println("January - 31 days");
		} else if (month == 2) {
			System.out.println("February - 28 (or 29) days");
		} else if (month == 3) {
			System.out.println("March - 31 days");
		} else if (month == 4) {
			System.out.println("April - 30 days");
		} else if (month == 5) {
			System.out.println("May - 31 days");
		} else if (month == 6) {
			System.out.println("June - 30 days");
		} else if (month == 7) {
			System.out.println("July - 31 days");
		} else if (month == 8) {
			System.out.println("August - 31 days");
		} else if (month == 9) {
			System.out.println("September - 30 days");
		} else if (month == 10) {
			System.out.println("October - 31 days");
		} else if (month == 11) {
			System.out.println("November - 30 days");
		} else if (month == 12) {
			System.out.println("December - 31 days");
		} else {
			System.out.println("Not a valid month number!");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

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