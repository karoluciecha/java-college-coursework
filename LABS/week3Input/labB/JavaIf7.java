// Karol G00436758
import java.util.Scanner;
public class JavaIf7 {
    public static void main(String[] args) {
        double n1, n2;
        char action;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = console.nextDouble();
        System.out.print("Enter second number: ");
        n2 = console.nextDouble();
        System.out.print("Would you like to add (+), substract (-), divide (/), multiply (*) or modulo (%)?: ");
        action = console.next().charAt(0);
        if (action == '+') {
            System.out.println("Answer is: " + (n1 + n2));
        } else if (action == '-') {
            System.out.println("Answer is: " + (n1 - n2));
        } else if (action == '/') {
            System.out.println("Answer is: " + (n1 / n2));
        } else if (action == '*') {
            System.out.println("Answer is: " + (n1 * n2));
        } else if (action == '%') {
            System.out.println("Answer is: " + (n1 % n2));
        } else {
            System.out.println("No such option!");
        }
        console.close();
    }
}