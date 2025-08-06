package labA;
import java.util.Random;
import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Die player = new Die('y');
		Die computer = new Die();
		Scanner console = new Scanner(System.in);
		Random random = new Random();
		
		
		System.out.printf("Press any key to roll the dices...");
		console.nextLine();
		
		while(player.getCont() == 'y') {
			player.addPoints(random.nextInt(11) + 2);
			computer.addPoints(random.nextInt(11) + 2);
			System.out.printf("Points: %d\n\nRoll the dice again? (y/n): ", player.getPoints());
			player.setCont(console.next().charAt(0));
		}
		
		System.out.printf("\nGame Over\n\nUser's points: %d\nComputer's points: %d\n", player.getPoints(), computer.getPoints());
		if (player.getPoints() > 21) {
			if (computer.getPoints() > 21) {
				if (player.getPoints() > computer.getPoints()) {
					System.out.printf("The computer wins!\n");
				}
				else {
					System.out.printf("The user wins!\n");
				}
			}
			else {
				System.out.printf("The computer wins!\n");
			}
		}
		else {
			if (player.getPoints() < computer.getPoints()) {
				System.out.printf("The computer wins!\n");
			}
			else {
				System.out.printf("The user wins!\n");
			}
		}
		console.close();
	}
}