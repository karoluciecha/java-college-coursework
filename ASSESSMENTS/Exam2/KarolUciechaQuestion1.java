// Karol Uciecha - G00436758 - 18/12/2023

import java.util.Scanner;
public class KarolUciechaQuestion1 {
    public static void main(String[] args) {
        float j = 0F, f = 0F;
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter the starting number: ");
        j = console.nextFloat();
        System.out.printf("Enter the gap number (can be decimal): ");
        f = console.nextFloat();
        for (int i = 1; i <= 10; i++) {
			j += f;
            System.out.printf("%d : %.2f\n", i, j);
        }
        console.close();
    }
}