// Karol G00436758
import java.util.Scanner;
public class JavaIfElse3 {
    public static void main(String[] args) {
        int day;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter day number (1 - 7): ");
        day = console.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 2) {
            System.out.println("Thursday");
        } else if (day == 2) {
            System.out.println("Friday");
        } else if (day == 2) {
            System.out.println("Saturday");
        } else if (day == 2) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not a valid day number!");
        }
        console.close();
    }
}
