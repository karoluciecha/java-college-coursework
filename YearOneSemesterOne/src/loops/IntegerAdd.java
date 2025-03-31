// Karol G00436758
import java.util.Scanner;
public class IntegerAdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0D, temp = 0D;
        do {
            System.out.printf("Enter a number (or enter 0 to end): ");
            temp = console.nextDouble();
            if (temp > 0) {
                sum += temp;
            }
        } while (temp != 0);
        System.out.printf("Sum is: %.0f.\n\n", sum);
        console.close();
    }    
}