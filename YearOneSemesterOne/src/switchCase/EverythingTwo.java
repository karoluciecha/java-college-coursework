package switchCase;

import java.util.Calendar;
import java.util.Scanner;

public class EverythingTwo {

	private static void exerciseOne(Scanner console) {
		double num1 = 0D, num2 = 0D, result = 0D;
		int choice = 0, precision = 0;
		String formattedResult;

		System.out.printf("Enter first number: ");
		num1 = console.nextDouble();
		System.out.printf("Enter second number: ");
		num2 = console.nextDouble();

		do {
			System.out.printf(
					"Select an operation:\n1: Addition\n2: Substraction\n3: Multiplication\n4: Division\nEnter your choice: ");
			choice = console.nextInt();
		} while ((choice < 1) || (choice > 4));

		do {
			System.out.printf("Enter the number of decimal places for the answer (1 to 5): ");
			precision = console.nextInt();
		} while ((precision < 1) || (precision > 5));

		switch (choice) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		}
		formattedResult = String.format("%." + precision + "f", result);
		System.out.printf("The result is: %s\n\n", formattedResult);
	}

	private static void exerciseTwo(Scanner console) {
		final double DTE = 0.86143522D, ETD = 1.1609D;
		char choice;
		double amount = -1D, result = 0D;

		do {
			System.out.printf("Enter A to convert dollars to euros or B to convert euros to dollars: ");
			choice = console.next().charAt(0);
			choice = Character.toUpperCase(choice);
		} while ((choice != 'A') && (choice != 'B'));

		do {
			System.out.printf("Enter amount: ");
			amount = console.nextDouble();
		} while (amount < 0);

		switch (choice) {
		case 'A':
			result = amount * DTE;
			System.out.printf("%.2f dollars is %.2f euros.\n", amount, result);
			break;
		case 'B':
			result = amount * ETD;
			System.out.printf("%.2f euros is %.2f dollars.\n", amount, result);
			break;
		}
	}

	private static void exerciseThree(Scanner console) {
		final double MTK = 1.609D;
		double miles = -1D, kilometers = 0D;
		int precision = 0;
		do {
			System.out.printf("Enter miles: ");
			miles = console.nextDouble();
		} while (miles < 0);
		do {
			System.out.printf("Enter how many decimal points required in answer (0/1/2/3): ");
			precision = console.nextInt();
		} while (miles < 0);
		kilometers = miles * MTK;

		String formattedResult = String.format("%." + precision + "f", kilometers);
		System.out.printf("%f miles is %s kilometers.", miles, formattedResult);
	}

	private static void exerciseFour() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR), month = cal.get(Calendar.MONTH), day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.printf("Current year is: %d and month is: %d and day is: %d\n", year, month, day);
	}

	private static void exerciseFive() {
		double pay = 123.4567D, temperature = 14.5D;
		System.out.printf("Pay is: %.2f, outside temperature is: %.1f.\n\n", pay, temperature);
	}

	private static void exerciseSix(Scanner console) {
		Calendar cal = Calendar.getInstance();
		double temperature = 14.5D;
		String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int dayN = cal.get(Calendar.DAY_OF_WEEK);
		String day = days[dayN];
		int counter = 100;
		float wage = 200.50F;
		System.out.printf("Temperature is: %.1f\nToday is: %s\nThe counter is at: %d\nWages are: %.2f\n", temperature,
				day, counter, wage);
	}

	private static void exerciseSeven() {
		double num1 = 12345.6789D, num2 = 12345.68D, num3 = 1234567D;
		System.out.printf("num1: %.1f\nnum2: %,.2f\nnum3: %,.0f\n", num1, num2, num3);
	}

	private static void exerciseEight(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		final double WAGE = 20076.345D;
		System.out.printf("Enter employee name: ");
		String name = console.nextLine().toUpperCase();
		System.out.printf("Wage is currently: EUR %,.2f\n", WAGE);
		System.out.printf("Enter percentage increase: ");
		double wageIncrease = console.nextDouble();
		System.out.printf("Percentage wage increase is: %.3f\n", wageIncrease);
		double wageAdd = WAGE * (wageIncrease / 100);
		System.out.printf("Wage increase in value is: EUR %,.2f\n", wageAdd);
		System.out.printf("%s's new wage is: EUR %,.2f\n", name, (WAGE + wageAdd));
	}

	private static void exerciseNine(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String bname, aname, category;
		int year = -1;
		int choice1 = 0;
		do {
			System.out.printf("Enter the name of the book: ");
			bname = console.nextLine();
		} while (bname.equals(""));
		do {
			System.out.printf("Enter the autor's name: ");
			aname = console.nextLine();
		} while (aname.equals(""));
		do {
			System.out.printf("Enter the year the book was published: ");
			year = console.nextInt();
		} while (year < 0);
		console.nextLine();
		do {
			System.out.printf("Enter the category of the book: ");
			category = console.nextLine();
		} while (category.equals(""));

		do {
			System.out.printf(
					"What would you like to do next?\n1: Display book information\n2: Display author's bibliography\nEnter your choice: ");
			choice1 = console.nextInt();
		} while ((choice1 < 1) || (choice1 > 2));

		switch (choice1) {
		case 1:
			choice1 = 0;
			do {
				System.out.printf(
						"How would you like the book information to be displayed?\n1: Display all information as is\n2: Display all information in uppercase\n3: Display all information, but with book title in uppercase\nEnter your choice: ");
				choice1 = console.nextInt();
			} while ((choice1 < 1) || (choice1 > 3));
			switch (choice1) {
			case 1:
				System.out.printf("Book: %s\t | Author: %s\t | Year: %s\t | Category: %s\n\n", bname, aname, year,
						category);
				break;
			case 2:
				System.out.printf("BOOK: %s\t | AUTHOR: %s\t | YEAR: %s\t | CATEGORY: %s\n\n", bname.toUpperCase(),
						aname.toUpperCase(), year, category.toUpperCase());
				break;
			case 3:
				System.out.printf("Book: %s\t | Author: %s\t | Year: %s\t | Category: %s\n\n", bname.toUpperCase(),
						aname, year, category);
				break;
			}
			break;
		case 2:
			choice1 = 0;
			do {
				System.out.printf(
						"How would you like the author's bibliography information to be displayed?\n1: Display all information as is\n2: Display all information in uppercase\nEnter your choice: ");
				choice1 = console.nextInt();
			} while ((choice1 < 1) || (choice1 > 2));
			switch (choice1) {
			case 1:
				System.out.printf("\t| Author: %s\t |\n\n", aname);
				break;
			case 2:
				System.out.printf("\t| AUTHOR: %s\t |\n\n", aname.toUpperCase());
				break;
			}
			break;
		}
	}

	private static void exerciseTen(Scanner console) {
		String comas;
		double mv1 = -1D, mv2 = -1D, mv3 = -1D;
		do {
			System.out.printf("Enter the first monetary value: ");
			mv1 = console.nextDouble();
		} while (mv1 < 0);
		do {
			System.out.printf("Enter the second monetary value: ");
			mv2 = console.nextDouble();
		} while (mv2 < 0);
		do {
			System.out.printf("Enter the third monetary value: ");
			mv3 = console.nextDouble();
		} while (mv3 < 0);
		console.nextLine();
		do {
			System.out.printf("Would you lke to use comas? (yes/no): ");
			comas = console.nextLine();
			comas = comas.toLowerCase();
		} while (!(comas.equals("y")) && !(comas.equals("n")) && !(comas.equals("yes")) && !(comas.equals("no")));

		System.out.printf("Your monetary values and their sums:\n");

		if (comas.equals("yes") || comas.equals("y")) {
			System.out.printf("The 1st monetary value is: %,20.2f\n", mv1);
			System.out.printf("The 2nd monetary value is: %,20.2f\n", mv2);
			System.out.printf("The 3rd monetary value is: %,20.2f\n", mv3);
			System.out.printf("%47s\n", "---------------");
			System.out.printf("The sum monetary value is: %,20.2f\n", (mv1 + mv2 + mv2));
		} else {
			System.out.printf("The 1st monetary value is: %20.2f\n", mv1);
			System.out.printf("The 2nd monetary value is: %20.2f\n", mv2);
			System.out.printf("The 3rd monetary value is: %20.2f\n", mv3);
			System.out.printf("%47s\n", "---------------");
			System.out.printf("The sum monetary value is: %20.2f\n", (mv1 + mv2 + mv2));
		}
	}

	private static void exerciseEleven(Scanner console) {
		int choice, ni1 = 0, ni2 = 0;
		double nd1 = 0D;
		float nf1 = 0F, nf2 = 0F;
		String s1, s2;
		char c;
		boolean b1, b2;
		do {
			System.out.printf(
					"Choose a data type to perform an operation:\n1: int\n2: double\n3: float\n4: string\n5: char\n6: boolean\nEnter your choice: ");
			choice = console.nextInt();
		} while ((choice < 1) || (choice > 6));

		switch (choice) {
		case 1:
			System.out.printf("Enter two integers separated by a space: ");
			ni1 = console.nextInt();
			ni2 = console.nextInt();
			System.out.printf("The sum of %d and %d is %d.\n\n", ni1, ni2, (ni1 + ni2));
			break;
		case 2:
			System.out.printf("Enter a double: ");
			nd1 = console.nextDouble();
			System.out.printf("The square root of %.2f is %.2f.\n\n", nd1, Math.sqrt(nd1));
			break;
		case 3:
			System.out.printf("Enter two floats separated by a space: ");
			nf1 = console.nextFloat();
			nf2 = console.nextFloat();
			System.out.printf("The reminder of %.2f divided by %.2f is %.2f.\n\n", nf1, nf2, (nf1 % nf2));
			break;
		case 4:
			System.out.printf("Enter two strings separated by a space: ");
			s1 = console.nextLine();
			s2 = console.nextLine();
			System.out.printf("The concatenated string is %s.\n\n", (s1 + s2));
			break;
		case 5:
			System.out.printf("Enter a lowercase character: ");
			c = console.next().charAt(0);
			System.out.printf("The uppercase of '%c' is '%c'.\n\n", c, Character.toUpperCase(c));
			break;
		case 6:
			System.out.printf("Enter two boolean values separated by a space (true/false): ");
			b1 = console.nextBoolean();
			b2 = console.nextBoolean();
			System.out.printf("The logical AND of %b and %b is %b.\n\n", b1, b2, (b1 && b2));
			break;
		}
	}

	private static void exerciseTwelve(Scanner console) {
		int choice = 0;

		do {
			System.out.printf(
					"Please enter the type of product you have purchased:\n1: Electronic\n2: Books\n3: Clothing\n4: Home Appliances\nEnter your choice: ");
			choice = console.nextInt();
		} while ((choice < 1) || (choice > 4));
		System.out.printf("\n---- Order Report ----\n");
		switch (choice) {
		case 1:
			System.out.printf("Product type: Electrnics\n");
			break;
		case 2:
			System.out.printf("Product type: Books\n");
			break;
		case 3:
			System.out.printf("Product type: Clothing\n");
			break;
		case 4:
			System.out.printf("Product type: Home Appliances\n");
			break;
		}
		System.out.printf("Total Price: $150.00\n");
	}

	private static void exerciseThirteen(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String fname, sname;
		int age = -1;
		int choice = 0;
		do {
			System.out.printf("Enter your first name: ");
			fname = console.nextLine();
		} while (fname.equals(""));
		do {
			System.out.printf("Enter your surname: ");
			sname = console.nextLine();
		} while (sname.equals(""));
		do {
			System.out.printf("Enter your age: ");
			age = console.nextInt();
		} while (age < 0);

		do {
			System.out.printf(
					"Choose a formatting option:\n1: Display each detail on a new line\n2: Display all details on a single line separated by comas\n3: Display full name on one line and age on the next\n4: Display surname in uppercase\n5: Right-align age with the last character of surname\n6: Display all text in uppercase\n7: Display all text aligned to the left\nEnter your choice: ");
			choice = console.nextInt();
		} while ((choice < 1) || (choice > 7));

		switch (choice) {
		case 1:
			System.out.printf("Name: %s\nSurname: %s\nAge: %d\n\n", fname, sname, age);
			break;
		case 2:
			System.out.printf("Name: %s, surname: %s, age: %d.\n\n", fname, sname, age);
			break;
		case 3:
			System.out.printf("Full name: %s %s\nAge: %d\n\n", fname, sname, age);
			break;
		case 4:
			System.out.printf("SURNAME: %s\n\n", sname.toUpperCase());
			break;
		case 5:
			System.out.printf("%20s\n%20s\n%20d\n\n", fname, sname, age);
			break;
		case 6:
			System.out.printf("%s %s, %d\n\n", fname.toUpperCase(), sname.toUpperCase(), age);
			break;
		case 7:
			System.out.printf("%-1s\n%-1s\n%-1d\n\n", fname, sname, age);
			break;
		}
	}

	private static void exerciseFourteen(Scanner console) {
		int choiceI = 0;
		char choiceC;
		do {
			System.out.printf(
					"Select a component to control:\n1: Lights\n2: Thermostat\n3: Music Player\n4: Locks\n5: Security System\nEnter your choice: ");
			choiceI = console.nextInt();
		} while ((choiceI < 1) || (choiceI > 5));
		System.out.printf("Would you like to:\n");
		switch (choiceI) {
		case 1:
			do {
				System.out.printf("A: Turn ON\nB: Turn OFF\nEnter your choice: ");
				choiceC = console.next().charAt(0);
				choiceC = Character.toUpperCase(choiceC);
			} while ((choiceC != 'A') && (choiceC != 'B'));
			switch (choiceC) {
			case 'A':
				System.out.printf("The lights are now ON.\n\n");
				break;
			case 'B':
				System.out.printf("The lights are now OFF.\n\n");
				break;
			}
			break;
		case 2:
			do {
				System.out.printf("A: Increase temperature\nB: Decrease temperature\nEnter your choice: ");
				choiceC = console.next().charAt(0);
				choiceC = Character.toUpperCase(choiceC);
			} while ((choiceC != 'A') && (choiceC != 'B'));
			switch (choiceC) {
			case 'A':
				System.out.printf("Temperature increased.\n\n");
				break;
			case 'B':
				System.out.printf("Temperature decreased.\n\n");
				break;
			}
			break;
		case 3:
			do {
				System.out.printf("A: Play music\nB: Pause music\nEnter your choice: ");
				choiceC = console.next().charAt(0);
				choiceC = Character.toUpperCase(choiceC);
			} while ((choiceC != 'A') && (choiceC != 'B'));
			switch (choiceC) {
			case 'A':
				System.out.printf("Music is playing.\n\n");
				break;
			case 'B':
				System.out.printf("Music is paused.\n\n");
				break;
			}
			break;
		case 4:
			do {
				System.out.printf("A: Lock\nB: Unlock\nEnter your choice: ");
				choiceC = console.next().charAt(0);
				choiceC = Character.toUpperCase(choiceC);
			} while ((choiceC != 'A') && (choiceC != 'B'));
			switch (choiceC) {
			case 'A':
				System.out.printf("Locks are now locked.\n\n");
				break;
			case 'B':
				System.out.printf("Locks are now unlocked.\n\n");
				break;
			}
			break;
		case 5:
			do {
				System.out.printf("A: Activate\nB: Deactivate\nEnter your choice: ");
				choiceC = console.next().charAt(0);
				choiceC = Character.toUpperCase(choiceC);
			} while ((choiceC != 'A') && (choiceC != 'B'));
			switch (choiceC) {
			case 'A':
				System.out.printf("Security system activated.\n\n");
				break;
			case 'B':
				System.out.printf("Security system deactivated.\n\n");
				break;
			}
			break;
		}
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
		exerciseFour();

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive();

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix(scanner);

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven();

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

		System.out.println("\n===== Exercise 13 =====");
		exerciseThirteen(scanner);

		System.out.println("\n===== Exercise 14 =====");
		exerciseFourteen(scanner);

		scanner.close();
	}
}