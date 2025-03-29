// Karol G00436758
import java.util.Scanner;

public class JavaScanner3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter second number: ");
        num2 = keyboard.nextInt();
        int sum = num1 + num2;
        double avg = (num1 + num2) / 2;
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("First number entered was: " + num1);
        System.out.println("Second number entered was: " + num2);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("Sum of numbers entered is: " + sum);
        System.out.println("Average of numbers entered is: " + avg);
        keyboard.close();
    }
}
