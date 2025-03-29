// Karol - G00436758 - 12/11/2023

import java.util.Scanner;

public class KarolUciechaQuestion2 {
    public static void main(String[] args) {
		final double INCREMENT_VALUE = 0.05D;
		double startNum = 0D, endNum = 0D;
		int forCounter = 0;
		boolean checker = false;
		Scanner console = new Scanner(System.in);

		do {
			checker = false;
			System.out.printf("Enter starting number: ");
			try {
				startNum = console.nextDouble();
			}
			catch (Exception e) {
				System.out.printf("Please enter a real number!\n");
				console.nextLine();
				checker = true;
			}
		} while (checker);
		do {
			checker = false;
			System.out.printf("Enter finishing number: ");
			try {
				endNum = console.nextDouble();
			}
			catch (Exception e) {
				System.out.printf("Please enter a real number!\n");
				console.nextLine();
				checker = true;
			}
			if (startNum >= endNum) {
				System.out.printf("Finishing number must be greater than starting number!\n");
				checker = true;
			}
		} while (checker);
		for (; startNum <= endNum; startNum += INCREMENT_VALUE) {
			System.out.printf("%.2f, ", startNum);
			forCounter++;
			if (forCounter % 10 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n");
        console.close();
    }
}