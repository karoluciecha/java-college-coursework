// Karol G00436758
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        int customerID, units;
        String name;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        customerID = console.nextInt();
        System.out.print("Enter customer name: ");
        console.nextLine();
        name = console.nextLine();
        System.out.print("Enter number of units consumed: ");
        units = console.nextInt();
        System.out.println("- - - - - CUSTOMER BILL - - - - -");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer name: " + name);
        System.out.println("Units consumed: " + units);
        if (units <= 199) {
            System.out.println("Total amount to pay: " + (units * 1.20));
        } else if ((units > 200) && (units <= 400)) {
            System.out.println("Total amount to pay: " + (units * 1.50));
        } else {
            System.out.println("Total amount to pay: too much units!");
        }
        console.close();
    }
}