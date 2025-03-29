// Karol G00436758
import java.util.Scanner;
public class MonetarySummation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String comas;
        double mv1 = -1D, mv2 = -1D, mv3 = -1D;
        do {
            System.out.printf("Enter the first monetary value: ");
            mv1 = console.nextDouble();
        } while (mv1 < 0);
        do {
            System.out.printf("Enter the second monetary value: ");
            mv2 = console.nextDouble();
        } while (mv2 < 0);
        do {
            System.out.printf("Enter the third monetary value: ");
            mv3 = console.nextDouble();
        } while (mv3 < 0);
        console.nextLine();
        do {
            System.out.printf("Would you lke to use comas? (yes/no): ");
            comas = console.nextLine();
            comas = comas.toLowerCase();
        } while (!(comas.equals("y")) && !(comas.equals("n")) && !(comas.equals("yes")) && !(comas.equals("no")));

        System.out.printf("Your monetary values and their sums:\n");

        if (comas.equals("yes") || comas.equals("y")) {
            System.out.printf("The 1st monetary value is: %,20.2f\n", mv1);
            System.out.printf("The 2nd monetary value is: %,20.2f\n", mv2);
            System.out.printf("The 3rd monetary value is: %,20.2f\n", mv3);
        } else {
            System.out.printf("The 1st monetary value is: %20.2f\n", mv1);
            System.out.printf("The 2nd monetary value is: %20.2f\n", mv2);
            System.out.printf("The 3rd monetary value is: %20.2f\n", mv3);
        }
        System.out.printf("%47s\n", "---------------");
        System.out.printf("The sum monetary value is: %20.2f\n", (mv1 + mv2 + mv2));
        console.close();
    }
}
