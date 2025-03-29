// Karol G00436758
import java.util.Scanner;

public class JavaScanner6 {
    public static void main(String[] args) {
        final double VAT = 0.23;
        double price, finalPrice;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter price of the product: ");
        price = keyboard.nextDouble();
        System.out.println("____________________________");
        System.out.println("Price of the product is: " + price);
        System.out.println("VAT at " + (100 * VAT) + "% is: " + (price * VAT) + "\n\n\n");
        finalPrice = price + (price * VAT);
        System.out.println("TOTAL COST: " + finalPrice);
        keyboard.close();
    }
}