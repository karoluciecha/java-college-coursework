// Karol G00436758
import java.util.Scanner;
public class JavaIf10 {
    public static void main(String[] args) {
        final int COST = 99;
        final double DISCOUNT = 9.9D;
        int n1;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter quantity being purchased: ");
        n1 = console.nextInt();
        if (n1 <= 10) {
            System.out.println("Cost is: " + (COST * n1) + ".");
            System.out.println("There is no discount on this order.");
        } else {
            System.out.println("Cost is: " + (n1 * (COST - DISCOUNT)) + ".");
            System.out.println("You recieved a discount of: " + (DISCOUNT * n1) + ".");
            System.out.println("Cost without discount would normally be: " + (n1 * COST) + ".");;
        }
        console.close();
    }
}