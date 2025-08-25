package strings;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne(Scanner scanner) {
		System.out.print("Enter a string to reverse: ");
		String str = scanner.nextLine();

		String reversed = ReverseAString.reverseString(str);
		System.out.println("Reversed string: " + reversed);
	}

	private static void exerciseTwo() {
		String a = "java";
		String b = "java";
		String x = "ja";
		String y = "va";
		String c;
		c = x + y;

		StringBuffer d = new StringBuffer("java");
		StringBuffer e = new StringBuffer("beans");
		StringBuffer f = d.append(e);

		if (a == b)
			System.out.println("a and b are the same object");
		else
			System.out.println("a and b are not the same object");

		if (b == c)
			System.out.println("b and c are the same object");
		else
			System.out.println("b and c are not the same object");

		if (d == f)
			System.out.println("d and f are the same object");
		else
			System.out.println("d and f are not the same object");

		System.out.println(e.reverse());
	}

	private static void exerciseThree() {
		String x = "Java";
		String y = x; // pointing to the same box
		System.out.println("y string is " + y);
		x = x + "Beans"; // reassigning x so it points to a different box then y mow
		System.out.println("y string is " + y);
	}

	private static void exerciseFour() {
		Student joe = new Student("joe", 2024);
		System.out.println(joe); // Printing out object as a string
		System.out.println("Student data is " + joe); // Printing out object as a string
	}

	private static void exerciseFive() {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		String str5 = "hi";
		String str6 = "hen";
		String str7 = "Bill";
		String str8 = "Air";

		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str4.compareTo(str5));
		System.out.println(str5.compareTo(str6));
		System.out.println(str7.compareTo(str8));
	}

	private static void exerciseSix() {
		String sentence, str1, str2;
		int intex;
		sentence = "Now is the time for the birthday party";
		System.out.println("Sentence = \"" + sentence + "\"");
		System.out.println("Sentence.substring(0, 6) = \"" + sentence.substring(0, 6) + "\"");
		System.out.println("Sentence.substring(7, 12) = \"" + sentence.substring(7, 12) + "\"");
		System.out.println("Sentence.substring(4, 10) = \"" + sentence.substring(4, 10) + "\"");
		System.out.println("Sentence.substring(4, 11) = \"" + sentence.substring(4, 11) + "\"");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== ReverseAString =====");
		exerciseOne(scanner);

		System.out.println("\n===== StringRef =====");
		exerciseTwo();

		System.out.println("\n===== StringTest =====");
		exerciseThree();

		System.out.println("\n===== Student =====");
		exerciseFour();

		System.out.println("\n===== TestEqualsString =====");
		exerciseFive();

		System.out.println("\n===== VariousStringMethods =====");
		exerciseSix();

		scanner.close();
	}
}