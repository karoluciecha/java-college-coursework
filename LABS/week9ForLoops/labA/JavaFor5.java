// Karol Uciecha - G00436758

import java.util.Scanner;
public class JavaFor5 {
    public static void main(String[] args) {
        int j = 0;
        Scanner console = new Scanner(System.in);
        System.out.printf("Counter Program\nThis program will count from zero up to whatever number you enter.\n\n\nEnter a number to count up to: ");
        j = console.nextInt();
        for (int i = 0; i <= j; i++) {
            System.out.printf("%d\n", i);
        }
        console.close();
    }
}