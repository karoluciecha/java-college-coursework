// Karol G00436758
import java.util.Scanner;
public class XCheck {
    public static void main(String[] args) {
        double y;
        int x = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        y = console.nextDouble();
        if (y > 0) {
            x = 1;
        }
        System.out.println("X: " + x + ".");
        console.close();
    }
}