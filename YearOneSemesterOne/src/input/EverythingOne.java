package input;

import java.util.Calendar;
import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne(Scanner keyboard) {
		System.out.print("Enter an integer: ");
		int number1 = keyboard.nextInt();
		System.out.println("Number input was: " + number1);
	}

	private static void exerciseTwo(Scanner keyboard) {
		int num1, num2, num3;
		System.out.print("Enter first number: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextInt();
		System.out.print("Enter third number: ");
		num3 = keyboard.nextInt();
		System.out.println("First number entered was: " + num1);
		System.out.println("Second number entered was: " + num2);
		System.out.println("Third number entered was: " + num3);
	}

	private static void exerciseThree(Scanner keyboard) {
		int num1, num2;
		System.out.print("Enter first number: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextInt();
		int sum = num1 + num2;
		double avg = (num1 + num2) / 2;
		System.out.println("- - - - - - - - - - - - - - - - -");
		System.out.println("First number entered was: " + num1);
		System.out.println("Second number entered was: " + num2);
		System.out.println("- - - - - - - - - - - - - - - - -");
		System.out.println("Sum of numbers entered is: " + sum);
		System.out.println("Average of numbers entered is: " + avg);
	}

	private static void exerciseFour(Scanner keyboard) {
		double num1, num2;
		System.out.print("Enter first number: ");
		num1 = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();
		double sum = num1 + num2;
		double avg = (num1 + num2) / 2;
		System.out.println("First number entered was: " + num1);
		System.out.println("Second number entered was: " + num2);
		System.out.println("\n\n\nSum of the two numbers entered is: " + sum);
		System.out.println("Average of the two numbers entered is: " + avg);
	}

	private static void exerciseFive(Scanner keyboard) {
		int num1;
		double num2;
		System.out.print("Enter integer number: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter decimal point number: ");
		num2 = keyboard.nextDouble();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		double sum = num1 + num2;
		double avg = (num1 + num2) / 2;
		System.out.println("First number entered was: " + num1);
		System.out.println("Second number entered was: " + num2);
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		System.out.println("Sum of numbers: " + sum);
		System.out.println("Average of numbers: " + avg);
	}

	private static void exerciseSix(Scanner keyboard) {
		final double VAT = 0.23;
		double price, finalPrice;
		System.out.print("Enter price of the product: ");
		price = keyboard.nextDouble();
		System.out.println("____________________________");
		System.out.println("Price of the product is: " + price);
		System.out.println("VAT at " + (100 * VAT) + "% is: " + (price * VAT) + "\n\n\n");
		finalPrice = price + (price * VAT);
		System.out.println("TOTAL COST: " + finalPrice);
	}

	private static void exerciseSeven(Scanner keyboard) {
		double num1, num2;
		System.out.print("Enter first number: ");
		num1 = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		num2 = keyboard.nextDouble();
		System.out.println("______________________________");
		System.out.println("Number 1 + number 2 is: " + (num1 + num2));
		System.out.println("Number 1 - number 2 is: " + (num1 - num2));
		System.out.println("Number 1 / number 2 is: " + (num1 / num2));
		System.out.println("Number 1 * number 2 is: " + (num1 * num2));
		System.out.println("______________________________");
	}

	private static void exerciseEight(Scanner keyboard) {
		if (keyboard.hasNextLine())
			keyboard.nextLine();
		// Declare a string variable called name
		String name;

		// Prompt the user to enter their name
		System.out.print("Please enter your name: ");

		// Store what is typed to the variable created in line 11
		name = keyboard.nextLine();

		// Output to the console displaying greeting
		System.out.println("Greetings, " + name + "!");
	}

	private static void exerciseNine(Scanner keyboard) {
		String name;
		int age;
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Please enter your age: ");
		age = keyboard.nextInt();
		System.out.println("Greetings, " + name + "!\nYou are " + age + " years old.");
	}

	private static void exerciseTen(Scanner keyboard) {
		if (keyboard.hasNextLine())
			keyboard.nextLine();
		String name;
		int yearBorn, age;
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Please enter your year of birth: ");
		yearBorn = keyboard.nextInt();
		age = Calendar.getInstance().get(Calendar.YEAR) - yearBorn;
		// age = Year.now().getValue() - yearBorn;
		System.out.println("Greetings, " + name + "!\nYou were born in " + yearBorn + " and therefore you are " + age
				+ " years old this year.");
	}

	private static void exerciseEleven(Scanner keyboard) {
		if (keyboard.hasNextLine())
			keyboard.nextLine();
		String fName, lName;
		int empID;
		double salary, taxRate;
		System.out.print("Enter first name: ");
		fName = keyboard.nextLine();
		System.out.print("Enter surname: ");
		lName = keyboard.nextLine();
		System.out.print("Enter employee ID: ");
		empID = keyboard.nextInt();
		System.out.print("Enter salary: ");
		salary = keyboard.nextDouble();
		System.out.print("Enter current tax rate: ");
		taxRate = keyboard.nextDouble();
		System.out.println("\n|------------------------------------------|");
		System.out.println("| PAYSLIP                                  |");
		System.out.println("|------------------------------------------|");
		System.out.println("| EMPLOYEE: " + fName + " " + lName);
		System.out.println("| ID: " + empID);
		System.out.println("|                                          |");
		System.out.println("| SALARY: " + salary);
		System.out.println("| PRSI: " + salary * (taxRate / 100));
		System.out.println("| ANNUAL TAKE HOME: " + (salary - (salary * (taxRate / 100))));
		System.out.println("| MONTHLY TAKE HOME: " + ((salary - (salary * (taxRate / 100)))) / 12);
		System.out.println("|------------------------------------------|");
	}

	private static void exerciseTwelve(Scanner keyboard) {
		if (keyboard.hasNextLine())
			keyboard.nextLine();
		String country;
		double population, area;
		System.out.println("Pupulation density calculator");
		System.out.println("-----------------------------");
		System.out.print("Enter country name: ");
		country = keyboard.nextLine();
		System.out.print("Enter country population: ");
		population = keyboard.nextDouble();
		System.out.print("Enter country area in square KM: ");
		area = keyboard.nextDouble();
		System.out.println("-----------------------------");
		System.out.println(country + " has " + (population / area) + " people per square kilometer.\n");
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