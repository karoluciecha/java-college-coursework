// Karol G00436758
import java.util.Scanner;
public class JavaDoWhile1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = 0D;

        do {
            System.out.printf("Enter a number: ");
            number = console.nextDouble();
        } while ((number >= 0) && (number <= 50));
        console.close();
    }    
}