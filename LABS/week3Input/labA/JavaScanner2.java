// Karol G00436758
import java.util.Scanner;

public class JavaScanner2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter second number: ");
        num2 = keyboard.nextInt();
        System.out.print("Enter third number: ");
        num3 = keyboard.nextInt();
        System.out.println("First number entered was: " + num1);
        System.out.println("Second number entered was: " + num2);
        System.out.println("Third number entered was: " + num3);

        keyboard.close();
    }
}