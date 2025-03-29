// Karol G00436758
import java.util.Scanner;
public class JavaSwitch3 {
    public static void main(String[] args) {
        int day = 0;
        Scanner console = new Scanner(System.in);
        do {
            System.out.print("Enter a day number: ");
            day = console.nextInt();
        } while ((day < 1) || (day > 7));
        switch (day) {
            case 1:
                System.out.println("Today is Monday!");
                break;
            case 2:
                System.out.println("Today is Tuesday!");
                break;
            case 3:
                System.out.println("Today is Wednesday!");
                break;
            case 4:
                System.out.println("Today is Thursday!");
                break;
            case 5:
                System.out.println("Today is Friday!");
                break;
            case 6:
                System.out.println("Today is Saturday!");
                break;
            case 7:
                System.out.println("Today is Sunday!");
                break;
            default:
                System.out.println("Value entered is not valid!");
                break;
        }
        console.close();
    }
}