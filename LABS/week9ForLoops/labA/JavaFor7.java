// Karol Uciecha - G00436758

import java.util.Scanner;
public class JavaFor7 {
    public static void main(String[] args) {
        int j = 0;
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        j = console.nextInt();
        for (int i = 0; i <= 100; i += j) {
            System.out.printf("%d\n", i);
        }
        console.close();
    }
}