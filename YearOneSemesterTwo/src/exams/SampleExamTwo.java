package exams;

import java.io.IOException;
import java.util.Scanner;

public class SampleExamTwo {

	private static void exerciseOne(Scanner console) {
        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = console.nextInt();
        int[] array = new int[size];

        // Prompt the user to enter values for each index of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = console.nextInt();
        }

        // Output each array element to the console
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
	}
	
	private static void exerciseTwo() {
        int[][] myCounter = new int[2][5];
        int value = 2000;

        // Populate the 2D array starting from the value 2000
        for (int i = 0; i < myCounter.length; i++) {
            for (int j = 0; j < myCounter[i].length; j++) {
                myCounter[i][j] = value++;
            }
        }

        // Output the array using a nested for loop
        System.out.println("\n------------------------------------");
        for (int i = 0; i < myCounter.length; i++) {
            for (int j = 0; j < myCounter[i].length; j++) {
                System.out.print(myCounter[i][j] + "    ");
            }
            // Check if it's the last row
            if (i == myCounter.length - 1) {
                System.out.println("\n------------------------------------");
            } else {
                System.out.println(); // New line at the end of each non-last row
            }
        }
	}


	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		scanner.close();
	}
}