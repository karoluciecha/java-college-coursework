// Karol G00436758
import java.util.Scanner;
public class DivisibleBy3 {
    public static void main(String[] args) {
        double n1;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n1 = console.nextDouble();
        if ((n1 % 3) == 0) {
            System.out.println("Divisible by 3.");
        } else {
            System.out.println("Not divisible by 3.");
        }
        console.close();
    }
}
