package dinner;

import java.util.Scanner;

import dessert.Cookie;

public class EverythingOne {

	private static void exerciseOne() {
		Cookie x = new Cookie();
		Cake y = new Cake();
		// x.bite(); friendly access - can't use
		y.bite(); // Friendly access
	}

	private static void exerciseTwo() {
		// Sundae x = new Sundae(); Sundae constructor is private
		Sundae x = Sundae.makeASundae();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Dinner =====");
		exerciseOne();

		System.out.println("\n===== IceCream =====");
		exerciseTwo();

		scanner.close();
	}
}