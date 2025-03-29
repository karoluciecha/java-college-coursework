// Karol G00436758
import java.util.Scanner;
public class DivBy5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = 1D;
        do {
            System.out.printf("Enter an integer not divisible by 5: ");
            number = console.nextDouble();
        } while (((number % 5) != 0) || number == 0);
        System.out.printf("Good job!\n\n");
        console.close();
    }    
}
