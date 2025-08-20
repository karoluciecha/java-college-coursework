package codeSnippets;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import simple.List;
import simple.Vector;

public class EverythingOne {

	private static void exerciseOne() {
		// object creation
		No n1 = new No();
		No n2 = new No();
		n1.i = 9;
		n2.i = 47;
		System.out.println("n1 is " + n1.i);
		System.out.println("n2 is " + n2.i);
		n1 = n2; // Aliasing at work
		System.out.println("n1 is " + n1.i);
		System.out.println("n2 is " + n2.i);
		n1.i = 27;
		System.out.println("n1 is " + n1.i);
		System.out.println("n2 is " + n2.i);
	}

	private static void exerciseTwo() {
		// sys ctrl + space
		// out - object; blue and italic(static) resides in the System class
		System.out.printf("Hello, its ");
		System.out.println(new Date()); // ctrl + shift + o
	}

	private static void exerciseThree() {
		Vector v = new Vector();
		List l = new List();
		// In TextPad you may have to manually specify the package,
		// if not - collision - does not know which List or Vector class to pick -
		// java.util or java.simple
	}

	private static void exerciseFour() {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c " + x.c);
		PassObject.f(x);// pass by reference - any object passed into method - 'z'
		System.out.println("1: x.c " + x.c);
	}

	private static void exerciseFive() {
		for (int i = 1; i <= 10; i++)
			// Cast to an int
			System.out.println((int) (Math.random() * i) + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Assignment =====");
		exerciseOne();

		System.out.println("\n===== HelloDate =====");
		exerciseTwo();

		System.out.println("\n===== LibTest =====");
		exerciseThree();

		System.out.println("\n===== PassObject =====");
		exerciseFour();

		System.out.println("\n===== RandomMethod =====");
		exerciseFive();

		scanner.close();
	}
}