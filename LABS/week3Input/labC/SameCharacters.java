// Karol G00436758
import java.util.Scanner;
public class SameCharacters {
    public static void main(String[] args) {
        char c1, c2;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first character: ");
        c1 = console.next().charAt(0);
        System.out.print("Enter second character: ");
        c2 = console.next().charAt(0);
        if (c1 == c2) {
            System.out.println("The first character: " + c1 + " is the same as the second character: " + c2 + ".");
        } else {
            System.out.println("The first character: " + c1 + " is not the same as the second character: " + c2 + ".");
        }
        console.close();
    }
}