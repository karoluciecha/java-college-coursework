package methods;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EverythingOne {

	private static void exerciseOne() {
		// Call the displayMessage method to output the welcome message
		displayMessage();
	}

	// Void method to display a welcome message
	public static void displayMessage() {
		System.out.println("Hello from a method!");
	}

	public static void exerciseTwo() {
		// Call the welcome method to output the welcome message
		welcome();
	}

	// Void method to display a welcome message with two lines
	public static void welcome() {
		System.out.println("Hello from a method!");
		System.out.println("Both of these lines are from the method!");
	}

	private static void exerciseThree(Scanner keyboard) {
		double mins;
		char choice;
		int accnr;
		System.out.printf("WELCOME TO THE JAVA PHONE COMPANY\n");
		while (true) {
			mins = 0;
			choice = 'a';
			accnr = 0;
			System.out.printf("---------------------------------\nENTER ACCOUNT NUMBER: ");
			accnr = keyboard.nextInt();
			System.out.printf("ENTER SERVICE TYPE: ");
			choice = keyboard.next().charAt(0);
			System.out.printf("ENTER MINUTES USED: ");
			mins = keyboard.nextDouble();
			switch (choice) {
			case 'b':
			case 'B':
				System.out.printf("\nMONTHLY BILL FOR ACCOUNT: %d\nBASIC PLAN\nTOTAL COST %.2f\n", accnr, cBasic(mins));
				break;
			case 's':
			case 'S':
				System.out.printf("\nMONTHLY BILL FOR ACCOUNT: %d\nSTANDARD PLAN\nTOTAL COST %.2f\n", accnr,
						cStandard(mins));
				break;
			case 'p':
			case 'P':
				System.out.printf("\nMONTHLY BILL FOR ACCOUNT: %d\nPREMIUM PLAN\nTOTAL COST %.2f\n", accnr,
						cPremium(mins));
				break;
			default:
				System.out.printf("Wrong service type indicator.\n\n");
				break;
			}
			System.out.printf("---------------------------------\nCalculate another bill? (y/n): ");
			if (Character.toLowerCase(keyboard.next().charAt(0)) != 'y')
				break;
		}
	}

	public static double cBasic(double mins) {
		final double RATE_PM = 7.99;
		final double RATE_C = 0.21;
		mins *= RATE_C;
		mins += RATE_PM;
		return mins;
	}

	public static double cStandard(double mins) {
		final double RATE_PM = 10;
		final double RATE_C = 0.05;
		final int BONUS = 100;
		mins -= BONUS;
		if (mins < 0)
			mins = 0;
		else
			mins *= RATE_C;
		mins += RATE_PM;
		return mins;
	}

	public static double cPremium(double mins) {
		final double RATE_PM = 25;
		final double RATE_C = 0.01;
		final int BONUS = 200;
		mins -= BONUS;
		if (mins < 0)
			mins = 0;
		else
			mins *= RATE_C;
		mins += RATE_PM;
		return mins;
	}

	private static void exerciseFour() {
    	Random rand = new Random();
    	int rpsPC = rand.nextInt(3);
    	Object[] rpsOpt = { "Rock", "Paper",
        "Scissors" };
    	JOptionPane.showOptionDialog(null, "Human", "RPS Game",
    			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, rpsOpt, null);
    }

	private static void exerciseFive() {
        oscar();
        coco();
        john();
        francis();
    }
    public static void oscar() {
        System.out.println("Experience is the name everyone gives to their mistakes. - Oscar Wilde");
    }
    public static void coco() {
        System.out.println("In order to be irreplaceable, one must always be different. - Coco Chanel");
    }
    public static void john() {
        System.out.println("First, solve the problem. Then, write the code. - John Johnson");
    }
    public static void francis() {
        System.out.println("Knowledge is power. - Francis Bacon");
    }

	private static void exerciseSix(Scanner keyboard) {
        // Variables declaration
        int number;

        // Prompting user input
        System.out.printf("Enter a number: ");
        number = keyboard.nextInt();

        // Running custom method
        makeDecision(number);
    }

    public static void makeDecision(int number) {
        // Calculating the parity and displaying results
        if((number % 2) == 0) {
            System.out.printf("Go for a walk!\n");
        } else {
            System.out.printf("Watch a movie!\n");
        }
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour();

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive();

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix(scanner);

		scanner.close();
	}
}