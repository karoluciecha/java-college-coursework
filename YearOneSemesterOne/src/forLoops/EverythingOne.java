package forLoops;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello!");
        }
	}

	private static void exerciseTwo() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Java Loop %d\n", i);
        }
	}

	private static void exerciseThree() {
        for (int i = 20; i >= 1; i--) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseFour() {
        for (int i = 0; i <= 30; i += 3) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseFive(Scanner console) {
        int j = 0;
        System.out.printf("Counter Program\nThis program will count from zero up to whatever number you enter.\n\nEnter a number to count up to: ");
        j = console.nextInt();
        for (int i = 0; i <= j; i++) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseSix(Scanner console) {
        int j = 0;
        System.out.printf("Multiplication Table\n\nEnter a number to generate multiplication tables for: ");
        j = console.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d times %d is %d\n", j, i, (j * i));
        }
	}

	private static void exerciseSeven(Scanner console) {
        int j = 0;
        System.out.printf("Enter a number: ");
        j = console.nextInt();
        for (int i = 0; i <= 100; i += j) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseEight(Scanner console) {
        for (int i = 50; i <= 65; i++) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseNine(Scanner console) {
        int startt = 0, stopp = 0;
        System.out.printf("Enter a number to start: ");
        startt = console.nextInt();
        System.out.printf("Enter a number to finish: ");
        stopp = console.nextInt();
        for (int i = startt; i <= stopp; i++) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseTen(Scanner console) {
        int startt = 0;
        System.out.printf("Enter a number to start: ");
        startt = console.nextInt();
        for (int i = startt; i <= (startt + 25); i++) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseEleven(Scanner console) {
        int startt = -1, stopp = -1, i = 0;
        do {
            try {
                System.out.printf("Enter starting number: ");
                startt = console.nextInt();
            }
            catch (Exception e) {
                console.nextLine();
            }
        } while (startt < 0);
        do {
            try {
                System.out.printf("Enter ending number: ");
                stopp = console.nextInt();
            }
            catch (Exception e) {
                console.nextLine();
            }
        } while (stopp <= startt);

        System.out.printf("Counting up:\n");
        for (i = startt; i < stopp; i++) {
            System.out.printf("%d\n", i);
        }
        System.out.printf("Turning number: %d\n", stopp);
        System.out.printf("Counting back down:\n");
        for (; i >= startt; i--) {
            System.out.printf("%d\n", i);
        }
	}

	private static void exerciseTwelve(Scanner console) {
        int startt = -1, stopp = -1, i = 0;
        do {
            try {
                System.out.printf("Enter starting number: ");
                startt = console.nextInt();
            }
            catch (Exception e) {
                console.nextLine();
            }
        } while (startt < 0);
        do {
            try {
                System.out.printf("Enter ending number: ");
                stopp = console.nextInt();
            }
            catch (Exception e) {
                console.nextLine();
            }
        } while (stopp <= startt);
        System.out.printf("Even numbers:\n");
        for (i = startt; i <= stopp; i++) {
            if ((i == stopp) && ((i % 2) == 0)) {
                System.out.printf("%d.", i);
                break;
            } else if ((i == stopp) && ((i % 2) != 0)) {
                System.out.printf(".");
                break;
            } else if (((i % 2) == 0) && (i < (stopp - 2))) {
                System.out.printf("%d, ", i);
            } else if (((i % 2) == 0) && (i == (stopp - 1))) {
                System.out.printf("%d.", i);
                break;
            }
        }
        System.out.printf("\n\nOdd numbers:\n");
        for (i = startt; i <= stopp; i++) {
            if ((i == stopp) && ((i % 2) != 0)) {
                System.out.printf("%d.", i);
                break;
            } else if ((i == stopp) && ((i % 2) == 0)) {
                System.out.printf(".");
                break;
            } else if (((i % 2) != 0) && (i < (stopp - 1))) {
                System.out.printf("%d, ", i);
            } else if (((i % 2) != 0) && (i == (stopp - 1))) {
                System.out.printf("%d.", i);
                break;
            }
        }
        System.out.printf("\n");
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
		exerciseFive(scanner);

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix(scanner);

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven(scanner);

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight(scanner);
		
		System.out.println("\n===== Exercise 9 =====");
		exerciseNine(scanner);

		System.out.println("\n===== Exercise 10 =====");
		exerciseTen(scanner);

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven(scanner);

		System.out.println("\n===== Exercise 12 =====");
		exerciseTwelve(scanner);

		scanner.close();
	}
}