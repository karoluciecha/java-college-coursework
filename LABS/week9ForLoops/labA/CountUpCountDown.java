// Karol Uciecha - G00436758

import java.util.Scanner;
public class CountUpCountDown {
    public static void main(String[] args) {
        int startt = -1, stopp = -1, i = 0;
        Scanner console = new Scanner(System.in);
        do {
            try {
                System.out.printf("Enter starting number: ");
                startt = console.nextInt();
            }
            catch (Exception e) {
                console.nextLine();
            }
        } while (startt < 0);
        do {
            try {
                System.out.printf("Enter ending number: ");
                stopp = console.nextInt();
            }
            catch (Exception e) {
                console.nextLine();
            }
        } while (stopp <= startt);

        System.out.printf("Counting up:\n");
        for (i = startt; i < stopp; i++) {
            System.out.printf("%d\n", i);
        }
        System.out.printf("Turning number: %d\n", stopp);
        System.out.printf("Counting back down:\n");
        for (; i >= startt; i--) {
            System.out.printf("%d\n", i);
        }
        console.close();
    }
}
