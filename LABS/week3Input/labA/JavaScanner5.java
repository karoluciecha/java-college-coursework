// Karol G00436758
import java.util.Scanner;

public class JavaScanner5 {
    public static void main(String[] args) {
        int num1;
        double num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter decimal point number: ");
        num2 = keyboard.nextDouble();
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        double sum = num1 + num2;
        double avg = (num1 + num2) / 2;
        System.out.println("First number entered was: " + num1);
        System.out.println("Second number entered was: " + num2);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + avg);
        keyboard.close();
    }
}