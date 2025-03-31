package switchCase;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne(Scanner console) {
		final double MEMBERSHIP_PRICE[] = { 20D, 40D, 60D };
		final String MEMBERSHIP_NAME[] = { "Basic", "Premium", "VIP" };
		int choice = 0;

		do {
			System.out.print(
					"Gym Membership Manager:\n1: Basic Membership ($20/month)\n2: Premium Membership ($40/month)\n3: VIP Membership ($60/month)\n4: Exit program\nPlease enter your choice: ");
			choice = console.nextInt();
		} while ((choice < 1) || (choice > 4));
		switch (choice) {
		case 1:
		case 2:
		case 3:
			System.out.println("You have selected " + MEMBERSHIP_NAME[choice - 1] + " Membership. The annual cost is $"
					+ String.format("%.2f", (MEMBERSHIP_PRICE[choice - 1] * 12)) + ".");
			break;
		case 4:
			break;
		}
	}

	private static void exerciseTwo() {
		int num1 = 100;
		switch (num1) {
		case 100:
			System.out.println("The value of the variable is 100!");
			break;
		default:
			System.out.println("The value is not 100!");
			break;
		}
	}

	private static void exerciseThree() {
		int num1 = 100;
		switch (num1) {
		case 5:
			System.out.println("The value of the variable is 5!");
			break;
		case 6:
			System.out.println("The value of the variable is 6!");
			break;
		case 7:
			System.out.println("The value of the variable is 7!");
			break;
		default:
			System.out.println("The value is NOT 5, 6 or 7!");
			break;
		}
	}

	private static void exerciseFour(Scanner console) {
		int day = 0;
		do {
			System.out.print("Enter a day number: ");
			day = console.nextInt();
		} while ((day < 1) || (day > 7));
		switch (day) {
		case 1:
			System.out.println("Today is Monday!");
			break;
		case 2:
			System.out.println("Today is Tuesday!");
			break;
		case 3:
			System.out.println("Today is Wednesday!");
			break;
		case 4:
			System.out.println("Today is Thursday!");
			break;
		case 5:
			System.out.println("Today is Friday!");
			break;
		case 6:
			System.out.println("Today is Saturday!");
			break;
		case 7:
			System.out.println("Today is Sunday!");
			break;
		default:
			System.out.println("Value entered is not valid!");
			break;
		}
	}

	private static void exerciseFive(Scanner console) {
		char charac = 0;
		System.out.print("Enter letter: ");
		charac = console.next().charAt(0);
		charac = Character.toLowerCase(charac);
		switch (charac) {
		case 'a':
			System.out.println("apple!");
			break;
		case 'b':
			System.out.println("banana!");
			break;
		case 'c':
			System.out.println("coconut!");
			break;
		default:
			System.out.println("Invalid value entered!");
			break;
		}
	}

	private static void exerciseSix(Scanner console) {
		int number = 0;
		System.out.print("Enter a number: ");
		number = console.nextInt();
		switch (number) {
		case 1:
			System.out.println("You selected 1.");
			break;
		case 2:
		case 3:
			System.out.println("You selected 2 or 3.");
			break;
		case 4:
			System.out.println("You selected 4.");
			break;
		default:
			System.out.println("Select again please.!");
			break;
		}
	}

	private static void exerciseSeven(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String name;
		System.out.print("Enter username: ");
		name = console.nextLine();
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		switch (name) {
		case "Grace":
			System.out.println("Welcome " + name + " - Admin level access granted!");
			break;
		case "Larry":
			System.out.println("Welcome " + name + " - User level access granted!");
			break;
		default:
			System.out.println("Access is denied!");
			break;
		}
	}

	private static void exerciseEight(Scanner console) {
		double wage = 0D, bonus = 0D;
		char grade;

		do {
			System.out.print("Enter employee current weekly wage: ");
			wage = console.nextDouble();
		} while (wage < 0);
		while (true) {
			System.out.print("Enter employee grade (A/B/C/F): ");
			grade = console.next().charAt(0);
			grade = Character.toUpperCase(grade);
			if (grade == 'A') {
				bonus = 100D;
				break;
			}
			if (grade == 'B') {
				bonus = 50D;
				break;
			}
			if (grade == 'C') {
				bonus = 15D;
				break;
			}
			if (grade == 'F') {
				System.out.println("This weeks wage is " + wage + ", there is no bonus.");
				console.close();
				return;
			}
		}
		System.out.println("Grade " + grade + ". This weeks wage plus bonus is " + (wage + bonus) + ".");
	}

	private static void exerciseNine(Scanner console) {
		double firstNum = 0D, secondNum = 0D;
		char action;
		System.out.print("Enter first number: ");
		firstNum = console.nextDouble();
		System.out.print("Enter second number: ");
		secondNum = console.nextDouble();

		do {
			System.out.print("Enter operator (A/S/M/D): ");
			action = console.next().charAt(0);
			action = Character.toLowerCase(action);
		} while ((action != 'a') && (action != 's') && (action != 'm') && (action != 'd'));

		switch (action) {
		case 'a':
			System.out.println(firstNum + " plus " + secondNum + " is: " + (firstNum + secondNum));
			break;
		case 's':
			System.out.println(firstNum + " minus " + secondNum + " is: " + (firstNum - secondNum));
			break;
		case 'm':
			System.out.println(firstNum + " multiplied by " + secondNum + " is: " + (firstNum * secondNum));
			break;
		case 'd':
			System.out.println(firstNum + " divided by " + secondNum + " is: " + (firstNum / secondNum));
			break;
		default:
			break;
		}
	}

	private static void exerciseTen(Scanner console) {
		final double USD_TO_EUR = 0.85D, EUR_TO_USD = 1.18D, USD_TO_GBP = 0.73D, GBP_TO_USD = 1.37D;
		int choice = 0;
		double amount = 0D;

		do {
			System.out.print(
					"Currency Converter Menu:\n1: Convert from US Dollar to Euro\n2: Convert from Euro to US Dollar\n3: Convert from US Dollar to British Pound\n4: Convert from British Pound to US Dollar\n5: Exit\nEnter your choice: ");
			choice = console.nextInt();
		} while ((choice < 1) || (choice > 5));

		switch (choice) {
		case 5:
			break;
		case 1:
			do {
				System.out.print("Enter amount in US Dollars: ");
				amount = console.nextDouble();
			} while (amount < 0);
			System.out.println("Converted amount: " + (amount * USD_TO_EUR) + " Euro");
			break;
		case 2:
			do {
				System.out.print("Enter amount in Euro: ");
				amount = console.nextDouble();
			} while (amount < 0);
			System.out.println("Converted amount: " + (amount * EUR_TO_USD) + " US Dollars");
			break;
		case 3:
			do {
				System.out.print("Enter amount in US Dollars: ");
				amount = console.nextDouble();
			} while (amount < 0);
			System.out.println("Converted amount: " + (amount * USD_TO_GBP) + " British Pounds");
			break;
		case 4:
			do {
				System.out.print("Enter amount in British Pounds: ");
				amount = console.nextDouble();
			} while (amount < 0);
			System.out.println("Converted amount: " + (amount * GBP_TO_USD) + " US Dollars");
			break;
		}
	}

	private static void exerciseEleven(Scanner console) {
		final String POST_TYPE[] = { "Text", "Image", "Video", "Poll" };
		final String POST_AUDIENCE[] = { "Public", "Friends", "Private" };
		int choice1 = 0, choice2 = 0;

		do {
			System.out.print(
					"Select post type:\n1: Text post\n2: Image post\n3: Video post\n4: Poll\n5: Exit program\nEnter your choice: ");
			choice1 = console.nextInt();
		} while ((choice1 < 1) || (choice1 > 5));
		switch (choice1) {
		case 1:
		case 2:
		case 3:
		case 4:
			do {
				System.out.print("Select audience type:\n1: Public\n2: Friends\n3: Private\nEnter your choice: ");
				choice2 = console.nextInt();
			} while ((choice2 < 1) || (choice2 > 3));
			break;
		case 5:
			break;
		}
		System.out.println("You have selected: " + POST_TYPE[choice1 - 1] + " post.");
		System.out.println("Your audience is set to: " + POST_AUDIENCE[choice2 - 1] + ".");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree();

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

		scanner.close();
	}
}