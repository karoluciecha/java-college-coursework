// Karol Uciecha - G00436758

import java.util.Scanner;
public class JavaFor6 {
    public static void main(String[] args) {
        int j = 0;
        Scanner console = new Scanner(System.in);
        System.out.printf("Multiplication Table\n\n\nEnter a number to generate multiplication tables for: ");
        j = console.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d times %d is %d\n", j, i, (j * i));
        }
        console.close();
    }
}