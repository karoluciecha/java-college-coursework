// Karol G00436758
import java.util.Scanner;
public class JavaIf11 {
    public static void main(String[] args) {
        int day;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a day number (1 - 7): ");
        day = console.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not a valid day number!");
        }
        console.close();
    }
}