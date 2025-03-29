// Karol Uciecha - G00436758

import java.util.Scanner;
public class EvenOddSequences {
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
        System.out.printf("Even numbers:\n");
        for (i = startt; i <= stopp; i++) {
            if ((i == stopp) && ((i % 2) == 0)) {
                System.out.printf("%d.", i);
                break;
            } else if ((i == stopp) && ((i % 2) != 0)) {
                System.out.printf(".");
                break;
            } else if (((i % 2) == 0) && (i < (stopp - 2))) {
                System.out.printf("%d, ", i);
            } else if (((i % 2) == 0) && (i == (stopp - 1))) {
                System.out.printf("%d.", i);
                break;
            }
        }
        System.out.printf("\n\nOdd numbers:\n");
        for (i = startt; i <= stopp; i++) {
            if ((i == stopp) && ((i % 2) != 0)) {
                System.out.printf("%d.", i);
                break;
            } else if ((i == stopp) && ((i % 2) == 0)) {
                System.out.printf(".");
                break;
            } else if (((i % 2) != 0) && (i < (stopp - 1))) {
                System.out.printf("%d, ", i);
            } else if (((i % 2) != 0) && (i == (stopp - 1))) {
                System.out.printf("%d.", i);
                break;
            }
        }
        System.out.printf("\n\n");

        console.close();
    }
}
