// Karol G00436758
import java.util.Scanner;
public class PrintOddRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.printf("Enter number 1: ");
        a = console.nextInt();
        do {
            System.out.printf("Enter number 2: ");
            b = console.nextInt();
        } while (a == b);
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        while (a <= b) {
            if ((a % 2) == 0) {
                System.out.printf("%d ", a);
            }
            a++;
        }
        System.out.printf("\n");
        console.close();
    }
}