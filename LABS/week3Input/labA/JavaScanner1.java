// Karol G00436758
import java.util.Scanner;

public class JavaScanner1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number1 = keyboard.nextInt();
        System.out.println("Number input was: " + number1);
        keyboard.close();

    }
}