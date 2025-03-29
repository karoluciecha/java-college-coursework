// Karol G00436758
import java.util.Scanner;
public class JavaIf6 {
    public static void main(String[] args) {
        double n1;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number: ");
        n1 = console.nextDouble();
        if (n1 < 100) {
            System.out.println("Number you entered is less than 100");
        } else {
            System.out.println("Number you entered is 100 or greater!");
        }
        console.close();
    }
}