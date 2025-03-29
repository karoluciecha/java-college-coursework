// Karol G00436758
import java.util.Scanner;
public class JavaLogicalOperators2 {
    public static void main(String[] args) {
        int amount1, amount2;
        Scanner console = new Scanner(System.in);
        System.out.print("Amount 1: ");
        amount1 = console.nextInt();
        System.out.print("Amount 2: ");
        amount2  = console.nextInt();
        if ((amount1 > 10) && (amount2 < 100)) {
            System.out.println("Amount 1 is greater than 10!");
            System.out.println("Amount 2 is less than 100!");
        } else {
            System.out.println("The numbers are not in the specified range!");
        }
        console.close();
    }
}