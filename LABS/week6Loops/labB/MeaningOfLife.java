// Karol G00436758
import java.util.Scanner;
public class MeaningOfLife {
    public static void main(String[] args) {
        final int correct = 42;
        Scanner console = new Scanner(System.in);
        double number = 0D;
        do {
            System.out.printf("Enter a number: ");
            number = console.nextDouble();
            if (number < correct) {
                System.out.printf("The number is too low.\n");
            } else if (number > correct) {
                System.out.printf("The number is too high.\n");
            } else {
                System.out.printf("Number entered is %.0f!!!\n\n", number);
            }    
        } while (number != correct);
        console.close();
    }    
}