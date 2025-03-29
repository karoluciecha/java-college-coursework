// Karol G00436758
public class JavaVariables11 {
    public static void main(String[] args) {
        int quantityItem1 = 6, quantityItem2 = 2;
        double priceItem1 = 5.00D, priceItem2 = 4.00D, totalCost = (priceItem1 * quantityItem1) + (priceItem2 * quantityItem2);
        System.out.println("---- Receipt ----");
        System.out.println("  Item 1\n  Price: " + priceItem1 + "\n  Quantity: " + quantityItem1 + "\n-----------------\n  Item 2\n  Price: " + priceItem2 + "\n  Quantity: " + quantityItem2 + "\n-----------------\nTOTAL COST: " + totalCost + "\n\n\n");
    }
}