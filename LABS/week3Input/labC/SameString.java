// Karol G00436758
import java.util.Scanner;
public class SameString {
    public static void main(String[] args) {
        String s1, s2;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first string: ");
        s1 = console.nextLine();
        System.out.print("Enter second string: ");
        s2 = console.nextLine();
        if (s1.equals(s2)) {
            System.out.println("The first string: " + s1 + " is the same as the second string: " + s2 + ".");
        } else {
            System.out.println("The first string: " + s1 + " is not the same as the second string: " + s2 + ".");
        }
        console.close();
    }
}