// Karol G00436758
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        float n1;
        Scanner console = new Scanner(System.in);
        System.out.print("Input value: ");
        n1 = console.nextFloat();

        if (n1 == 0) {
            System.out.println("Zero");
        } else if (n1 > 0) {
            if ((n1 > 0) && (n1 < 1)) {
                System.out.println("Positive small number");
            } else if (n1 >= 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive");
            }
        } else if (n1 < 0) {
            if((n1 < 0) && (n1 > -1)) {
                 System.out.println("Negative small number");
            } else if (n1 <= -1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative");
            }
        }
        console.close();
    }
}