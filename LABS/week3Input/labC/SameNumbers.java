// Karol G00436758
import java.util.Scanner;
public class SameNumbers {
    public static void main(String[] args) {
        double n1, n2;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = console.nextDouble();
        System.out.print("Enter second number: ");
        n2 = console.nextDouble();
        if (n1 == n2) {
            System.out.println("The first number: " + n1 + " is the same as the second number: " + n2 + ".");
        } else {
            System.out.println("The first number: " + n1 + " is not the same as the second number: " + n2 + ".");
        }
        console.close();
    }
}