package forLoops;

import java.util.Random;
import java.util.Scanner;

public class EverythingTwo {

	private static void exerciseOne() {
        Random randomNumber = new Random();
        int num1;
        num1 = randomNumber.nextInt(10);
        System.out.printf("%d\n", num1);
	}

	private static void exerciseTwo(Scanner console) {
        Random randomNumber = new Random();
        int num1, num2;
        num1 = randomNumber.nextInt(10) + 1;
        System.out.printf("GUESSING GAME\nGuess the random number generated between 1  and 10: ");
        num2 = console.nextInt();
        if (num1 == num2) {
            System.out.printf("You guessed correctly!\n");
        } else {
            System.out.printf("Sorry, that's not the number I was thinking of!\nIt was %d. Better luck next time!\n", num1);
        }
	}

	private static void exerciseThree() {
        Random randomNumber = new Random();
        System.out.printf("Random number: %d\n", (randomNumber.nextInt(20) + 1));
	}

	private static void exerciseFour() {
        Random randomNumber = new Random();
        System.out.printf("Random number: %d\n", (randomNumber.nextInt(31)));
        System.out.printf("Random number: %d\n", (randomNumber.nextInt(31)));
    }

	private static void exerciseFive(Scanner console) {
        Random randomNumber = new Random();
        int num1, num2, sum1, ans1;
        System.out.printf("WELCOME TO THE MATHS ADDITION GAME\n\n");
        for (int i = 0; i < 5; i++) {
            num1 = (randomNumber.nextInt(26) + 5);
            num2 = (randomNumber.nextInt(26) + 5);
            sum1 = num1 + num2;
            System.out.printf("What is %d plus %d?: ", num1, num2);
            ans1 = console.nextInt();
            if (ans1 == sum1) {
                System.out.printf("Correct!\n\n");
            } else {
                System.out.printf("Hmmm... that's not correct. The answer is %d.\n\n", sum1);
            }
        }
	}

	private static void exerciseSix() {
        Random randomNumber = new Random();
        System.out.printf("%f\n", randomNumber.nextDouble());
	}

	private static void exerciseSeven() {
        Random randomNumber = new Random();
        System.out.printf("Random double between 1.0 and 10.0: %f.\n", (1 + (10 - 1) * randomNumber.nextDouble()));
    }

	private static void exerciseEight(Scanner console) {
        Random randomNumber = new Random();
        int side, guess;
        System.out.printf("LUCKY DICE GAME!\n\n");
            side = (randomNumber.nextInt(6) + 1);
            System.out.printf("Place your bets!!\nWhat side will the dice land on?: ");
            guess = console.nextInt();
            if (guess == side) {
                System.out.printf("You won!\n");
            } else {
                System.out.printf("Aw. You lost. Better luck next time.\n");
            }
	}

	private static void exerciseNine(Scanner console) {
        console.nextLine();
        Random randomNumber = new Random();
        String[] greetings = {"Hi there!", "Hello to you too!", "Hey!", "Greetings!"};
        System.out.printf("Enter a greeting: ");
        console.nextLine();
        System.out.printf("%s\n", greetings[randomNumber.nextInt(5)]);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo(scanner);

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree();

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour();

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive(scanner);

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix();

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven();

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight(scanner);
		
		System.out.println("\n===== Exercise 9 =====");
		exerciseNine(scanner);

		scanner.close();
	}
}