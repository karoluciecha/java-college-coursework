// Karol G00436758
import java.util.Scanner;

public class JavaScanner4 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = keyboard.nextDouble();
        System.out.print("Enter second number: ");
        num2 = keyboard.nextDouble();
        double sum = num1 + num2;
        double avg = (num1 + num2) / 2;
        System.out.println("First number entered was: " + num1);
        System.out.println("Second number entered was: " + num2);
        System.out.println("\n\n\nSum of the two numbers entered is: " + sum);
        System.out.println("Average of the two numbers entered is: " + avg);
        keyboard.close();
    }
}