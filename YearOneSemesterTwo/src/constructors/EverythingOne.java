package constructors;

import java.util.Random;
import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		Circle c1 = new Circle();

		System.out.printf("%d", c1.getRadius());
	}

	private static void exerciseTwo() {
		Rectangle a = new Rectangle();

		System.out.printf("%d\n", a.getLength());
		System.out.printf("%d\n", a.getWidth());
	}

	private static void exerciseThree() {
		Employee emp1 = new Employee("Donald");
		Employee emp2 = new Employee("Emma", 33);

		System.out.printf("%s, %d\n", emp1.getName(), emp1.getAge());
		System.out.printf("%s, %d\n", emp2.getName(), emp2.getAge());
	}

	private static void exerciseFour(Scanner console) {
		Die player = new Die('y');
		Die computer = new Die();
		Random random = new Random();

		System.out.printf("Press any key to roll the dices...");
		console.nextLine();

		while (player.getCont() == 'y') {
			player.addPoints(random.nextInt(11) + 2);
			computer.addPoints(random.nextInt(11) + 2);
			System.out.printf("Points: %d\n\nRoll the dice again? (y/n): ", player.getPoints());
			player.setCont(console.next().charAt(0));
		}

		System.out.printf("\nGame Over\n\nUser's points: %d\nComputer's points: %d\n", player.getPoints(),
				computer.getPoints());
		if (player.getPoints() > 21) {
			if (computer.getPoints() > 21) {
				if (player.getPoints() > computer.getPoints()) {
					System.out.printf("The computer wins!\n");
				} else {
					System.out.printf("The user wins!\n");
				}
			} else {
				System.out.printf("The computer wins!\n");
			}
		} else {
			if (player.getPoints() < computer.getPoints()) {
				System.out.printf("The computer wins!\n");
			} else {
				System.out.printf("The user wins!\n");
			}
		}
	}

	private static void exerciseFive(Scanner console) {
		SwimmingPool p1 = new SwimmingPool(10, 5, 3);
		SwimmingPool p2 = new SwimmingPool();

		System.out.printf("Pool data:\n  Length: ");
		p2.setLength(console.nextDouble());
		System.out.printf("  Width: ");
		p2.setWidth(console.nextDouble());
		System.out.printf("  Depth: ");
		p2.setDepth(console.nextDouble());
		System.out.printf("Total pool capacity (constructor): %.2f\nTotal pool capacity (user input): %.2f\n",
				p1.calculate(), p2.calculate());
	}

	private static void exerciseSix(Scanner console) {
		Fishing game = new Fishing();
		Random random = new Random();

		System.out.printf("Let's go fishing!\n");

		do {
			System.out.printf("\nYou cast your line into the water...\n");
			game.setDice(random.nextInt(6) + 1);
			game.calculate();
			System.out.printf("You caught [%s].\n", game.getItemName());
			System.out.printf("\nTry fishing again? (Y or N): ");
			game.setCont(console.next().charAt(0));
		} while (game.getCont() == 'y');
		System.out.printf("%s", game.gameEnds());
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
		exerciseFour(scanner);

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive(scanner);

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix(scanner);

		scanner.close();
	}
}