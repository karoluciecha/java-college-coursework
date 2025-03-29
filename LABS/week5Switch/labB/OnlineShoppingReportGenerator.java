// Karol G00436758
import java.util.Scanner;
public class OnlineShoppingReportGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.printf("Please enter the type of product you have purchased:\n1: Electronic\n2: Books\n3: Clothing\n4: Home Appliances\nEnter your choice: ");
            choice = console.nextInt();
        } while ((choice < 1) || (choice > 4));
        System.out.printf("\n---- Order Report ----\n");
        switch (choice) {
            case 1:
                System.out.printf("Product type: Electrnics\n");
                break;
            case 2:
                System.out.printf("Product type: Books\n");
                break;
            case 3:
                System.out.printf("Product type: Clothing\n");
                break;
            case 4:
                System.out.printf("Product type: Home Appliances\n");
                break;
        }
        System.out.printf("Total Price: $150.00");
        console.close();
    }
}