package test;

import main.ClassFour;
import org.junit.jupiter.api.*;

import java.util.Scanner;

class TestFourManual {

    static ClassFour matrix1;
    static ClassFour matrix2;

    @BeforeAll
    static void setupAll() {
        try (Scanner input = new Scanner(System.in)) {
			System.out.printf("Enter value to fill matrix1: ");
			int val1 = input.nextInt();
			matrix1 = new ClassFour(val1);

			System.out.printf("Enter value to fill matrix2: ");
			int val2 = input.nextInt();
			matrix2 = new ClassFour(val2);
		}
    }

    @Test
    void testManualAdd() {
        ClassFour result = matrix1.Add(matrix2);
        System.out.println("Addition result:");
        printMatrix(result.getMatrix());
    }

    @Test
    void testManualSubtract() {
        ClassFour result = matrix1.Subtract(matrix2);
        System.out.println("Subtraction result:");
        printMatrix(result.getMatrix());
    }

    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
