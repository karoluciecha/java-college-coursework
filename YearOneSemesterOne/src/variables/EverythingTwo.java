package variables;

public class EverythingTwo {

	private static void exerciseOne() {
		byte number1 = 10, number2 = 20;
		int addition = number1 + number2;
		long substraction = number1 - number2;
		double division = number1 / number2;
		float multiplication = number1 * number2;
		System.out.println(number1 + " + " + number2 + " = " + addition);
		System.out.println(number1 + " - " + number2 + " = " + substraction);
		System.out.println(number1 + "/ " + number2 + " = " + division);
		System.out.println(number1 + " * " + number2 + " = " + multiplication);
	}

	private static void exerciseTwo() {
		final double TAX_RATE = 0.21;
		double wage = 450, taxPaid;
		// Calculate the tax paid by multiplying the wage by the tax rate
		taxPaid = wage * TAX_RATE;
		System.out.println("WAGE: £" + wage);
		System.out.println("TAX RATE: " + TAX_RATE);
		System.out.println("TAX PAID: " + taxPaid);
		System.out.println("TAKE HOMTE PAY: " + (wage - taxPaid));
	}

	private static void exerciseThree() {
		System.out.println(-5 + (8 * 6));
		System.out.println((55 + 9) % 9);
		System.out.println((20 - 3) * (5 / 8));
		System.out.println((5 + 13) / 3 * ((2 + 8) + 3));
	}

	private static void exerciseFour() {
		int number = 8;
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " times " + i + " is " + (number * i));
		}
	}

	private static void exerciseFive() {
		char letter1 = 'H';
		char letter2 = 'i';

		System.out.println("The first character variable is: " + letter1);
		System.out.println("The second character variable is: " + letter2);
		System.out.println("Output: " + letter1 + letter2 + ", " + letter1 + letter2 + ", " + letter1 + letter2 + ".");
	}

	private static void exerciseSix() {
		// byte
		// Byte data type is an 8-bit integer
		// Minimum value is -128
		// Maximum value is 127
		// Default value is 0
		byte b = 100;

		// short
		// Short data type is a 16-bit integer
		// Minimum value is -32,768
		// Maximum value is 32,767
		// Default value is 0
		short s = 32000;

		// int
		// Int data type is a 32-bit integer
		// Minimum value is -2,147,483,648
		// Maximum value is 2,147,483,647
		// Default value is 0
		int i = 1234;

		// long
		// Long data type is a 64-bit integer
		// Maximum value is 9,223,372,036,854,775,807
		// Default value is 0L
		long l = 123456789L;

		// float
		// Float data type is a single-precision 32-bit IEEE 754 floating point
		// Float is mainly used to save memory in large arrays of floating point numbers
		// Default value is 0.0F
		float f = 1.5F;

		// double
		// Double data type is a double-precision 64-bit IEEE 754 floating point
		// Double is generally used as the default data type for decimal values,
		// generally the default choice
		// Default value is 0.0D
		double d = 12.345D;

		// boolean
		// Boolean data type represents one bit of information
		// There are only two possible values: true and false
		// Default value is false
		boolean bool = true;

		// char
		// Char data type is a single 16-bit Unicode character
		char c = 'A';

		System.out.println("byte: " + b + "\nshort: " + s + "\nint: " + i + "\nlong: " + l + "\nfloat: " + f
				+ "\ndouble: " + d + "\nboolean: " + bool + "\nchar: " + c);
	}

	private static void exerciseSeven() {
		int num1 = 10, num2 = 20, num3 = 30;
		double result = num1 + num2 + num3, multiplication = num1 * num2 * num3, substraction = num1 - num2 - num3,
				division = num1 / num2 / num3, modulus = num1 % num2 % num3;
		System.out.println("The sum of the three integers is: " + result);
		System.out.println("The product of the three integers is: " + multiplication);
		System.out.println("The difference of the three integers is: " + substraction);
		System.out.println("The quotient of the three integers is: " + division);
		System.out.println("The reminder of the three integers is: " + modulus);
	}

	private static void exerciseEight() {
		final double KILOGRAMS_PER_POUND = 0.454;
		double kilos = 50, pounds;
		System.out.println("Number of kilos: " + kilos);
		System.out.println("----------------------------------------");
		System.out.println("Conversion:");
		pounds = kilos / KILOGRAMS_PER_POUND;
		System.out.println(kilos + " kilos is " + pounds + " pounds\n");
	}

	private static void exerciseNine() {
		final double KILOMETERS_PER_MILE = 1.609;
		double kilometers = 100, miles = kilometers / KILOMETERS_PER_MILE;
		System.out.println("Distance in kilometers: " + kilometers);
		System.out.println("\n" + kilometers + " kilometers is " + miles + " miles.\n");
	}

	private static void exerciseTen() {
		final double METERS_TO_FEET = 3.2808;
		double meters = 2, feet = meters * METERS_TO_FEET;
		System.out.println(meters + " meters is equal to " + feet + " feet.");
	}

	private static void exerciseEleven() {
		int number = 8;
		System.out.print(number + " plus " + 10 + " is ");
		number += 10;
		System.out.print(number + "\n");
		for (int i = 10; i <= 100; i += 5) {
			System.out.print(number + " plus " + i + " is ");
			number += 5;
			System.out.print(number + "\n");
		}
	}

	private static void exerciseTwelve() {
		int y1 = 1883, y2 = 1959, y3 = 1972;
		String title = "Computer History: A Timeline of Computer Programming Languages";
		String part1 = ": The first programming language was developed in 1883 when Ada Lovelace and Charles Babbage worked together on the Analytical Engine, which was a primitive mechanical computer.";
		String part2 = ": COBOL was created by Dr. Grace Murray Hopper to be a language that could operate on all types of computers.";
		String part3 = ": Dennis Ritchie developed C, generally regarded as the first high-level programming language. This means that it's closer to human language and less like machine code.";
		System.out.println(
				title + "\n-----------------------------------------------------------------------------------\n" + y1
						+ part1 + "\n\n" + y2 + part2 + "\n\n" + y3 + part3 + "\n");
	}

	public static void main(String[] args) {
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
		exerciseTen();

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven();

		System.out.println("\n===== Exercise 12 =====");
		exerciseTwelve();
	}
}