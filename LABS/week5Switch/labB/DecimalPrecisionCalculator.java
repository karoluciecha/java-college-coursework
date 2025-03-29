// Karol G00436758
import java.util.Scanner;
public class DecimalPrecisionCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1 = 0D, num2 = 0D, result = 0D;
        int choice = 0, precision = 0;
        String formattedResult;

        System.out.printf("Enter first number: ");
        num1 = console.nextDouble();
        System.out.printf("Enter second number: ");
        num2 = console.nextDouble();

        do {
            System.out.printf("Select an operation:\n1: Addition\n2: Substraction\n3: Multiplication\n4: Division\nEnter your choice: ");
            choice = console.nextInt();
        } while ((choice < 1) || (choice > 4));

        do {
            System.out.printf("Enter the number of decimal places for the answer (1 to 5): ");
            precision = console.nextInt();
        } while ((precision < 1) || (precision > 5));

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
        }
        formattedResult = String.format("%." + precision + "f", result);
        System.out.printf("The result is: %s\n\n", formattedResult);
        console.close();
    }
}