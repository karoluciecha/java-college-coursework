package variables;

import java.time.Year;
import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		// Declare and assign variables
		int myInt = 200, myInt2 = 99;

		// Output to console
		System.out.println(myInt);
		System.out.println(myInt2);
	}

	private static void exerciseTwo() {
		// Declare and assign variables
		double myInt = 20, myInt2 = 55.6;

		// Output to console
		System.out.println(myInt);
		System.out.println(myInt2);
		System.out.println(myInt + myInt2);
		System.out.println(myInt - myInt2);
	}

	private static void exerciseThree() {
		byte num1 = 2;
		System.out.println("Num 1 is: " + num1);
		System.out.println("Num 1 times 10 is: " + (num1 * 10));
		System.out.println("Half of num 1 is: " + (num1 / 2));
	}

	private static void exerciseFour() {
		int n1 = 99;
		int n2 = 51;
		float add = n1 + n2, divide = n1 / n2, multiply = n1 * n2, substract = n1 - n2, modulo = n1 % n2;
		System.out.println("The variable value of n1 is: " + n1);
		System.out.println("The variable value of n2 is: " + n2);
		System.out.println("n1 plus n2 is: " + add);
		System.out.println("n1 divide n2 is: " + divide);
		System.out.println("n1 multiply n2 is: " + multiply);
		System.out.println("n1 substract n2 is: " + substract);
		System.out.println("n1 modulo n2 is: " + modulo);
	}

	private static void exerciseFive() {
		float number1 = 0.345F, number2 = 0.235F;
		System.out.println(number1);
		System.out.println(number2);
		System.out.println("num1 plus num2 is: " + (number1 + number2));
		System.out.println("num1 divide num2 is: " + (number1 / number2));
		System.out.println("num1 multiply num2 is: " + (number1 * number2));
		System.out.println("num1 substract num2 is: " + (number1 - number2));
	}

	private static void exerciseSix() {
		byte b1 = Byte.MIN_VALUE, b2 = Byte.MAX_VALUE;
		short s1 = Short.MIN_VALUE, s2 = Short.MAX_VALUE;
		int i1 = Integer.MIN_VALUE, i2 = Integer.MAX_VALUE;
		long l1 = Long.MIN_VALUE, l2 = Long.MAX_VALUE;
		double d1 = Double.MIN_VALUE, d2 = Double.MAX_VALUE;
		float f1 = Float.MIN_VALUE, f2 = Float.MAX_VALUE;
		char c1 = 'c';
		boolean boo1 = true;
		System.out.println("Min Byte value is: " + b1);
		System.out.println("Max Byte value is: " + b2);
		System.out.println("Min Short value is: " + s1);
		System.out.println("Max Short value is: " + s2);
		System.out.println("Min Int value is: " + i1);
		System.out.println("Max Int value is: " + i2);
		System.out.println("Min Long value is: " + l1);
		System.out.println("Max Long value is: " + l2);
		System.out.println("Min Double value is: " + d1);
		System.out.println("Max Double value is: " + d2);
		System.out.println("Min Float value is: " + f1);
		System.out.println("Max Float value is: " + f2);
		System.out.println("Char: " + c1);
		System.out.println("Boolean: " + boo1);
	}

	private static void exerciseSeven() {
		float number1 = 12.3f, number2 = 5.5f;
		System.out.println("Number 1 + Number 2 = " + (number1 + number2));
		System.out.println("Number 1 - Number 2 = " + (number1 - number2));
		System.out.println("Number 1 * Number 2 = " + (number1 * number2));
		System.out.println("Number 1 / Number 2 = " + (number1 / number2));
		System.out.println("Number 1 % Number 2 = " + (number1 % number2));
		System.out.println("Number 2 - Number 1 = " + (number2 - number1));
		System.out.println("Number 2 % Number 1 = " + (number2 % number1));
	}

	private static void exerciseEight() {
		float num1 = 22F, num2 = 32F, num3 = 65F, average = (num1 + num2 + num3) / 3F;
		System.out.println("The average is: " + average);
	}

	private static void exerciseNine() {
		byte num1 = 29;
		for (int i = 0; i <= 1; i++) {
			System.out.println(num1 + " " + num1 + " " + num1 + " " + num1);
			System.out.println("" + num1 + num1 + num1 + num1);
		}
	}

	private static void exerciseTen(Scanner myObj) {
		char answer = 'y';
		do {
			int length, width;
			System.out.print("Enter length: ");
			length = myObj.nextInt();
			System.out.print("Enter width: ");
			width = myObj.nextInt();
			double area = length * width;
			System.out.println("The area of the rectangle is: " + area + "\n\n");
			System.out.print("\t ");
			for (int i = 0; i < (length / 2) - 1; i++) {
				System.out.print(" ");
			}
			System.out.println(length);
			System.out.print("\t ");
			for (int i = 0; i < length; i++) {
				System.out.print("-");
			}
			System.out.println();
			for (int i = 0; i < width; i++) {
				System.out.print("\t|");
				for (int j = 0; j < (length); j++) {
					System.out.print(" ");
				}
				if ((width % 2 == 0) && ((i + 1) == (width / 2))) {
					System.out.print("| " + width + "\n");
				} else if (width % 2 == 1 && ((i + 1) == ((width + 1) / 2))) {
					System.out.print("| " + width + "\n");
				} else {
					System.out.print("|\n");
				}
			}
			System.out.print("\t ");
			for (int i = 0; i < length; i++) {
				System.out.print("-");
			}
			System.out.println();
			System.out.print("Do you want to start over? (Y/N): ");
			answer = myObj.next().charAt(0);
		} while ((answer == 'y') || (answer == 'Y'));
	}

	private static void exerciseEleven() {
		int quantityItem1 = 6, quantityItem2 = 2;
		double priceItem1 = 5.00D, priceItem2 = 4.00D,
				totalCost = (priceItem1 * quantityItem1) + (priceItem2 * quantityItem2);
		System.out.println("---- Receipt ----");
		System.out.println("  Item 1\n  Price: " + priceItem1 + "\n  Quantity: " + quantityItem1
				+ "\n-----------------\n  Item 2\n  Price: " + priceItem2 + "\n  Quantity: " + quantityItem2
				+ "\n-----------------\nTOTAL COST: " + totalCost + "\n\n\n");
	}

	private static void exerciseTwelve(Scanner myObj) {
		System.out.println("- - - - Age Calculator - - - -");
		System.out.print("Enter your birth year: ");
		int yearBorn = myObj.nextInt();
		System.out.println("Year entered: " + yearBorn);
		int yearCurrent = (Year.now().getValue()) - yearBorn;
		System.out.println("You are " + yearCurrent + " this year!");
		System.out.println("- - - - - - - - - - - - - - -");
	}

	private static void exerciseThirteen() {
		final double pi = 3.1415D;
		double radius = 5D, area = pi * (radius * radius);
		System.out.println("The area of a circle\nwith a radius of " + radius + "\nis: " + area);
		System.out.println("\nThe diameter of a circle\nwith a radius of " + radius + "\nis: " + (radius * 2));
		System.out
				.println("\nThe circumference of a circle\nwith a radius of " + radius + "\nis: " + (radius * 2 * pi));
	}

	private static void exerciseFourteen() {
		int calories = 75;
		System.out.println("\nCalories per " + 1 + " cookie: " + (1 * calories));
		System.out.println("\nCalories per " + 3 + " cookies: " + (3 * calories));
		System.out.println("\nCalories per " + 5 + " cookies: " + (5 * calories));
		System.out.println("\nCalories per " + 10 + " cookies: " + (10 * calories));
		System.out.println("\nCalories per serving: " + (4 * calories));
		System.out.println("\nCalories in the whole bag: " + (40 * calories) + "\n");
	}

	private static void exerciseFifteen() {
		int people = 12467;
		double oneMorePerWeek = people * 0.14, preferCitrus = oneMorePerWeek * 0.64;
		System.out.println("We syrveyed " + people + " people.\nOut of those surveyed, approximately " + oneMorePerWeek
				+ " purchase at least one energy drink per year.\nApproximately " + preferCitrus
				+ " of those prefer citrus flavored energy drinks.");
	}

	private static void exerciseSixteen() {
		double numberOfShares = 2000, purchasePrice = numberOfShares * 40.00D, commissionBuy = purchasePrice * 0.03,
				totalPaid = purchasePrice + commissionBuy, sellPrice = 42.75,
				moneyRecieved = numberOfShares * sellPrice, commissionSell = moneyRecieved * 0.03,
				earn = moneyRecieved - commissionSell, totalEarn = earn - totalPaid;
		System.out.println("Joe paid $" + purchasePrice + " for the stock.\nJoe paid his broker a commission of $"
				+ commissionBuy + " on the purchase.\nSo, Joe paid a total of $" + totalPaid + ".\n");
		System.out.println("Joe sold the stock for $" + moneyRecieved + "\nJoe paid his broker a commission of $"
				+ commissionSell + " on the sale.\nSo, Joe recieved a total of $" + earn + ".\n");
		System.out.println("Joe's profit or loss: $" + totalEarn + ".");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n===== Exercise 1 =====");
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
		exerciseSix();

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven();

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight();

		System.out.println("\n===== Exercise 9 =====");
		exerciseNine();

		System.out.println("\n===== Exercise 10 =====");
		exerciseTen(scanner);

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven();

		System.out.println("\n===== Exercise 12 =====");
		exerciseTwelve(scanner);

		System.out.println("\n===== Exercise 13 =====");
		exerciseThirteen();

		System.out.println("\n===== Exercise 14 =====");
		exerciseFourteen();

		System.out.println("\n===== Exercise 15 =====");
		exerciseFifteen();

		System.out.println("\n===== Exercise 16 =====");
		exerciseSixteen();

		scanner.close();
	}
}