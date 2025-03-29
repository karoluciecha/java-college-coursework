// Karol Uciecha - G00436758

import java.util.Scanner;
public class JavaFor9 {
    public static void main(String[] args) {
        int startt = 0, stopp = 0;
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter a number to start: ");
        startt = console.nextInt();
        System.out.printf("Enter a number to finish: ");
        stopp = console.nextInt();
        for (int i = startt; i <= stopp; i++) {
            System.out.printf("%d\n", i);
        }
        console.close();
    }
}