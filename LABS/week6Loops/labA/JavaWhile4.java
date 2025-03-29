// Karol G00436758
import java.util.Scanner;
public class JavaWhile4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = 0D, result = 0D;

        while (true) {
            System.out.printf("Enter a number: ");
            number = console.nextDouble();
            if (number < 0) {
                break;
            }
            result += number;
        }
        System.out.printf("Sum of all numbers entered is: %.2f.\n\n", result);
        console.close();
    }    
}