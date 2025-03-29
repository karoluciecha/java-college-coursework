// Karol G00436758
import java.util.Scanner;
public class JavaIfElse4 {
    public static void main(String[] args) {
        int userNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userNumber = console.nextInt();
        if (userNumber < 0) {
            System.out.println("The number you entered is negative");
        } else if (userNumber > 0) {
            System.out.println("The number you entered is positive");
        } else if (userNumber == 0) {
            System.out.println("The number you entered equals 0");
        } else {
            System.out.println("NaN?");
        }
        console.close();
    }
}
