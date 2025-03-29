// Karol G00436758
import java.util.Scanner;

public class JavaScanner7 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = keyboard.nextDouble();
        System.out.print("Enter second number: ");
        num2 = keyboard.nextDouble();
        System.out.println("______________________________");
        System.out.println("Number 1 + number 2 is: " + (num1 + num2));
        System.out.println("Number 1 - number 2 is: " + (num1 - num2));
        System.out.println("Number 1 / number 2 is: " + (num1 / num2));
        System.out.println("Number 1 * number 2 is: " + (num1 * num2));
        System.out.println("______________________________");
        keyboard.close();
    }
}