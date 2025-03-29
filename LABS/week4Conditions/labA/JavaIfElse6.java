// Karol G00436758
import java.util.Scanner;
public class JavaIfElse6 {
    public static void main(String[] args) {
        double n1, n2;
        char action;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = console.nextDouble();
        System.out.print("Enter second number: ");
        n2 = console.nextDouble();
        System.out.print("Enter operator (a, s, d, m): ");
        action = console.next().charAt(0);
        action = Character.toLowerCase(action);
        if (action == 'a') {
            System.out.println(n1 + " plus " + n2 + " is: " + (n1 + n2));
        } else if (action == 's') {
            System.out.println(n1 + " minus " + n2 + " is: " + (n1 - n2));
        } else if (action == 'd') {
            System.out.println(n1 + " divided by " + n2 + " is: " + (n1 / n2));
        } else if (action == 'm') {
            System.out.println(n1 + " multiplied by " + n2 + " is: " + (n1 * n2));
        } else {
            System.out.println("That's not a valid option!");
        }
        console.close();
    }
}