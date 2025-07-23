package loops;

import java.util.Scanner;

public class EverythingTwo {

	private static void exerciseOne() {
        for (int i = 2; i < 21; i++) {
            System.out.printf("%d squared is %.0f\n", i, Math.pow(i, 3));
        }
	}

	private static void exerciseTwo(Scanner console) {
        double number = 1D;
        do {
            System.out.printf("Enter an integer not divisible by 5: ");
            number = console.nextDouble();
        } while (((number % 5) != 0) || number == 0);
        System.out.printf("Good job!\n");
	}

	private static void exerciseThree() {
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseFour() {
        double average = 0;
        for (int i = 1; i < 11; i++) {
            average += i;
        }
        System.out.printf("The product of the numbers from 1 to 10 is: %.2f\n", (average / 10));
	}

	private static void exerciseFive() {
		int test = 5;
		while (test > 0) {
			System.out.print("This is inside the while loop! Test value is " + test + ". ");
			test--;
		}
		System.out.println();
	}

	private static void exerciseSix() {
        char fizzBuzz[] = {'F', 'i', 'z', 'z', 'B', 'u', 'z', 'z'};
        for (int i = 1; i < 21; i++) {
            switch (i) {
                case 3:
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%c", fizzBuzz[j]);
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    for (int j = (i - 1); j < fizzBuzz.length; j++) {
                        System.out.printf("%c", fizzBuzz[j]);
                    }
                    System.out.printf("\n");
                    break;
                case 15:
                    for (int j = 0; j < fizzBuzz.length; j++) {
                        System.out.printf("%c", fizzBuzz[j]);
                    }
                    System.out.printf("\n");
                    break;
                default:
                    System.out.printf("%d\n", i);
                    break;
            }
        }
	}

	private static void exerciseSeven(Scanner console) {
        double sum = 0D, temp = 0D;
        do {
            System.out.printf("Enter a number (or enter 0 to end): ");
            temp = console.nextDouble();
            if (temp > 0) {
                sum += temp;
            }
        } while (temp != 0);
        System.out.printf("Sum is: %.0f.\n", sum);
	}

	private static void exerciseEight(Scanner console) {
        final int correct = 42;
        double number = 0D;
        do {
            System.out.printf("Enter a number: ");
            number = console.nextDouble();
            if (number < correct) {
                System.out.printf("The number is too low.\n");
            } else if (number > correct) {
                System.out.printf("The number is too high.\n");
            } else {
                System.out.printf("Number entered is %.0f!!!\n", number);
            }    
        } while (number != correct);
	}
	
	private static void exerciseNine(Scanner console) {
        int a = 0, b = 0;
        System.out.printf("Enter number 1: ");
        a = console.nextInt();
        do {
            System.out.printf("Enter number 2: ");
            b = console.nextInt();
        } while (a == b);
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        System.out.printf("Even numbers are: ");
        while (a <= b) {
            if ((a % 2) == 0) {
                System.out.printf("%d ", a);
            }
            a++;
        }
        System.out.printf("\n");
	}

	private static void exerciseTen() {
        int product = 1;
        for (int i = 1; i < 11; i++) {
            product *= i;
        }
        System.out.printf("The product of the numbers from 1 to 10 is: %,d\n", product);
	}

	private static void exerciseEleven() {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d squared is %.0f\n", i, Math.pow(i, 2));
        }
	}

	private static void exerciseTwelve(Scanner console) {
		console.nextLine();
        String word;
        do {
            System.out.printf("Enter a word (5 characters check): ");
            word = console.nextLine();
            if (word.length() == 5) {
                System.out.printf("%s has 5 characters!\n", word);
            }
            System.out.printf("\n-------------\n");
        } while (!word.equals(""));
	}

	private static void exerciseThirteen() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.printf("The sum of the numbers from 1 to 100 is: %d\n", sum);
	}
	
	private static void exerciseFourteen(Scanner console) {
        double low = Double.MAX_VALUE, high = Double.MIN_VALUE, average = 0D, temp = 0D;
        int count = 0;
        System.out.printf("How many numbers would you like to input? ");
        count = console.nextInt();
        if (count <= 0) {
            System.out.printf("Negative number was entered. Program is now exiting...\n\n");
            console.close();
            return;
        }
        for(int i = 1; i <= count; i++) {
            System.out.printf("Enter number %d: ", i);
            temp = console.nextDouble();
            average += temp;
            if (temp < low) {
                low = temp;
            }
            if (temp > high) {
                high = temp;
            }
        }
        average /= count;
        System.out.printf("Average of numbers: %.2f\n", average);
        System.out.printf("Highest number: %.2f\n", high);
        System.out.printf("Lowest number: %.2f\n", low);
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
		exerciseFive();

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix();

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven(scanner);

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight(scanner);
		
		System.out.println("\n===== Exercise 9 =====");
		exerciseNine(scanner);

		System.out.println("\n===== Exercise 10 =====");
		exerciseTen();

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven();

		System.out.println("\n===== Exercise 12 =====");
		exerciseTwelve(scanner);

		System.out.println("\n===== Exercise 13 =====");
		exerciseThirteen();
		
		System.out.println("\n===== Exercise 14 =====");
		exerciseFourteen(scanner);

		scanner.close();
	}
}