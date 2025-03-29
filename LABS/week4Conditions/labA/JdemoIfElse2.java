// Karol G00436758
import java.util.Scanner;
public class JdemoIfElse2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s1, s2;

        System.out.print("Enter s1: ");
        s1 = console.nextLine();
        System.out.print("Enter s2: ");
        s2 = console.nextLine();

        System.out.println("\nString s1 contains: " + s1 + " with length: " + s1.length());
        System.out.println("String s1 Upper Case: " + s1.toUpperCase());

        System.out.println("\nString s2 contains: " + s2 + " with length: " + s2.length());
        System.out.println("String s2 Lower Case: " + s2.toLowerCase());

        if (s1.equals(s2)) {
            System.out.println(s1 + " equals " + s2);
        }
        else {
            System.out.println(s1 + " NOT equals " + s2);
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(s1 + " equals ignore case " + s2);
        }
        else {
            System.out.println(s1 + " NOT equals ignore case " + s2);
        }

        if (s1.compareTo(s2) < 0) {
            System.out.println(s1 + " compareTo (less than) " + s2);
        }
        else if (s1.compareTo(s2) > 0) {
            System.out.println(s1 + " compareTo (greater than) " + s2);
        }
        else {
            System.out.println(s1 + " compareTo (equal) " + s2);
        }
        console.close();
    }
}
