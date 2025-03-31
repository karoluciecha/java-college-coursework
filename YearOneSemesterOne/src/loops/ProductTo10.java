// Karol G00436758
public class ProductTo10 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i < 11; i++) {
            product *= i;
        }
        System.out.printf("The product of the numbers from 1 to 10 is: %,d\n\n", product);
    } 
}