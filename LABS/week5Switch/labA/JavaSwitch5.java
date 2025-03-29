// Karol G00436758
import java.util.Scanner;

public class JavaSwitch5 {
    public static void main(String[] args) {
        int number = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = console.nextInt();
        switch (number) {
            case 1:
                System.out.println("You selected 1.");
                break;
            case 2:
            case 3:
                System.out.println("You selected 2 or 3.");
                break;
            case 4:
                System.out.println("You selected 4.");
                break;
            default:
                System.out.println("Select again please.!");
                break;
        }
        console.close();
    }
}