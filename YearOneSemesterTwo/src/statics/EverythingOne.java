package statics;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		System.out.println(Exchange.euroToDollar(100));
	}

	private static void exerciseTwo() {
		final int HUNDRED = 100;
		System.out.printf("%d Euro to Dollar: %.2f\n", HUNDRED, Currency.euroToDollar(HUNDRED));
		System.out.printf("%d Dollar to Euro: %.2f\n", HUNDRED, Currency.dollarToEuro(HUNDRED));
		System.out.printf("%d Euro to Sterling: %.2f\n", HUNDRED, Currency.euroToSterling(HUNDRED));
		System.out.printf("%d Sterling to Euro: %.2f\n", HUNDRED, Currency.sterlingToEuro(HUNDRED));
		System.out.printf("%d Sterling to Dollar: %.2f\n", HUNDRED, Currency.sterlingToDollar(HUNDRED));
		System.out.printf("%d Dollar to Sterling: %.2f\n", HUNDRED, Currency.dollarToSterling(HUNDRED));
	}

	private static void exerciseThree() {
		System.out.printf("The area of a circle with a radius of %d is %.2f\n", 20, Area.circle(20));
		System.out.printf("The area of a rectangle with a length of %d and a width of %d is %.2f\n", 10, 20,
				Area.rectangle(10, 20));
		System.out.printf("The area of a cylinder with a radius of %d and a height of %d is %.2f\n", 10, 15,
				Area.cylinder(10, 15));
	}

	private static void exerciseFour() {
		Person a = new Person("Grace", "Hopper");
		Person b = new Person("Bill", "Gates");
		Person c = new Person("Karol", "Pollard");
		Person d = new Person("Oliver", "Uciecha");
		System.out.printf("%d\n", a.getInstanceCount());
		System.out.printf("%d\n", b.getInstanceCount());
		System.out.printf("%d\n", c.getInstanceCount());
		System.out.printf("%d\n", d.getInstanceCount());
		System.out.printf("%d\n", Person.count());
	}

	private static void exerciseFive() {
		Account a = new Account("Grace", "Hopper", 100);
		Account b = new Account("Bill", "Gates", 300);
		Account c = new Account("Ada", "Lovelace", 400);
		Account d = new Account("James", "Gosling", 230);

		System.out.printf("The vault currently has %.2f\n", Account.getVault());
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

		scanner.close();
	}
}