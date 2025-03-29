// Karol G00436758
import java.util.Scanner;
public class JavaIf9 {
    public static void main(String[] args) {
        double n1;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number: ");
        n1 = console.nextDouble();
        if ((n1 % 2) == 0) {
            System.out.println("The number entered is even.");
        } else {
            System.out.println("The number entered is odd.");
        }
        console.close();
    }
}