package equivalence;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		// Objects using implicit default constructor;
		No n1 = new No();
		No n2 = new No();
		n1.i = 9;
		n2.i = 47;
		System.out.println("n1.i is " + n1.i + " n2.i is " + n2.i);
		n1 = n2; // Aliasing at work
		System.out.println("n1.i is " + n1.i + " n2.i is " + n2.i);
		n1.i = 27;
		System.out.println("n1.i is " + n1.i + " n2.i is " + n2.i);
	}

	private static void exerciseTwo() {
		// Use implicit default constructor
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
	}

	private static void exerciseThree() {
		// Create Integer objects
		// Deprecation for Wrapper classes
		// Integer n1 = new Integer(47); // Deprecated Java 9 / 10
		Integer n1 = Integer.valueOf(456);
		Integer n2 = Integer.valueOf(456); // Newer way Integer objects
		// Integer Short Byte Character wrapper classes use same cache for numbers -127 to 128
		Integer n3 = Integer.valueOf(4);
		Integer n4 = Integer.valueOf(4);
		Float f1 = Float.valueOf(4f);
		Float f2 = Float.valueOf(4f);
		String s1 = new String("mary");
		String s2 = new String("mary");
		System.out.println(n1 == n2); // Comparing object references
		System.out.println(n1.equals(n2)); // Comparing objects
		System.out.println(f1 == f2); // Comparing object references
		System.out.println(f1.equals(f2)); // Comparing objects
		System.out.println(s1 == s2); // Comparing object references
		System.out.println(s1.equals(s2)); // Comparing objects
		System.out.println(n3 == n4); // Falls into cache -127 to 128
	}

	private static void exerciseFour() {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("x.c is " + x.c);
		PassObject.f(x); // Pass by reference
		System.out.println("x.c is " + x.c);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Assignment =====");
		exerciseOne();

		System.out.println("\n===== EqualsMethod =====");
		exerciseTwo();

		System.out.println("\n===== Equivalence =====");
		exerciseThree();

		System.out.println("\n===== PassObject =====");
		exerciseFour();

		scanner.close();
	}
}