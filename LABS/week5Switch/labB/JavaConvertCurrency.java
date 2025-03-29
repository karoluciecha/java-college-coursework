// Karol G00436758
import java.util.Scanner;
public class JavaConvertCurrency {
    public static void main(String[] args) {
        final double DTE = 0.86143522D, ETD = 1.1609D;
        char choice;
        Scanner console = new Scanner(System.in);
        double amount = -1D, result = 0D;

        do {
            System.out.printf("Enter A to convert dollars to euros or B to convert euros to dollars: ");
            choice = console.next().charAt(0);
            choice = Character.toUpperCase(choice);
        } while ((choice != 'A') && (choice != 'B'));

        do {
            System.out.printf("Enter amount: ");
            amount = console.nextDouble();
        } while (amount < 0);

        switch (choice) {
            case 'A':
                result = amount * DTE;
                System.out.printf("%.2f dollars is %.2f euros.\n", amount, result);
                break;
            case 'B':
                result = amount * ETD;
                System.out.printf("%.2f euros is %.2f dollars.\n", amount, result);
                break;
        }


        console.close();
    }
}
