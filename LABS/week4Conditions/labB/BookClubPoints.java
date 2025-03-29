// Karol G00436758
import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int books = -1, points = 0;
        do {
            System.out.print("How many books have you purchased this month? ");
            books = console.nextInt();
        } while (books < 0);
        if (books >= 4) {
            points = 60;
        } else if (books == 3) {
            points = 30;
        } else if (books == 2) {
            points = 15;
        } else if (books == 1) {
            points = 5;
        }
        System.out.println("You've earned " + points + " points.");

        console.close();
    }
}
