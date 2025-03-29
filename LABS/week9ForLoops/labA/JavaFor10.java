// Karol Uciecha - G00436758

import java.util.Scanner;
public class JavaFor10 {
    public static void main(String[] args) {
        int startt = 0;
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter a number to start: ");
        startt = console.nextInt();
        for (int i = startt; i <= (startt + 25); i++) {
            System.out.printf("%d\n", i);
        }
        console.close();
    }
}