// Karol Uciecha - G00436758 - 18/12/2023

import java.util.Random;
import java.util.Scanner;

public class KarolUciechaQuestion3 {
    public static void main(String[] args) {
		int[] dice = {0, 0, 0, 0, 0, 0};
		Random rnd = new Random();
		boolean checker;
		int rollNumber = 0, highestOccurrence = 0, highestNumber = 0;
		Scanner console = new Scanner(System.in);

		do {
			checker = false;
			System.out.printf("How many times would you like to roll the dice? (Range 1 to 100): ");
			try {
				rollNumber = console.nextInt();
				if ((rollNumber < 1) || (rollNumber > 100)) {
					System.out.printf("Please enter a number between 1 and 100.\n");
					checker = true;
				}
			}
			catch (Exception e) {
				System.out.printf("Please enter a real number!\n");
				console.nextLine();
				checker = true;
			}
		} while (checker);
		for (int i = 1; i <= rollNumber; i++) dice[rnd.nextInt(6)]++;

		System.out.printf("\nResults:\n1: %d times\n2: %d times\n3: %d times\n4: %d times\n5: %d times\n6: %d times\n", dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]);
		highestOccurrence = dice[0];
		highestNumber = 1;
		if (highestOccurrence < dice[1]) {
			highestOccurrence = dice[1];
			highestNumber = 2;
		}
		if (highestOccurrence < dice[2]) {
			highestOccurrence = dice[2];
			highestNumber = 3;
		}
		if (highestOccurrence < dice[3]) {
			highestOccurrence = dice[3];
			highestNumber = 4;
		}
		if (highestOccurrence < dice[4]) {
			highestOccurrence = dice[4];
			highestNumber = 5;
		}
		if (highestOccurrence < dice[5]) {
			highestOccurrence = dice[5];
			highestNumber = 6;
		}
		System.out.printf("The number that came up most frequently was %d, occurring %d times.\n", highestNumber, highestOccurrence);




	}
}