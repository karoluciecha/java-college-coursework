// Karol G00436758
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        int number;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = console.nextInt();
        boolean positive = (number > 0);
        boolean divisibleBy2 = ((number % 2) == 0);
        if (positive && divisibleBy2) {
            System.out.println("Number " + number + " is positive and divisible by 2.");
        } else {
            System.out.println("Number " + number + " is negative and/or non-divisible by 2.");
        }
        console.close();
    }
}