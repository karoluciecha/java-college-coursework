// Karol G00436758
import java.util.Scanner;
public class JavaSwitch8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstNum = 0D, secondNum = 0D;
        char action;
        System.out.print("Enter first number: ");
        firstNum = console.nextDouble();
        System.out.print("Enter second number: ");
        secondNum = console.nextDouble();

        do {
            System.out.print("Enter operator (A/S/M/D): ");
            action = console.next().charAt(0);
            action = Character.toLowerCase(action);
        } while ((action != 'a') && (action != 's') && (action != 'm') && (action != 'd'));
        console.close();

        switch (action) {
            case 'a':
                System.out.println(firstNum + " plus " + secondNum + " is: " + (firstNum + secondNum));
                break;
            case 's':
                System.out.println(firstNum + " minus " + secondNum + " is: " + (firstNum - secondNum));
                break;
            case 'm':
                System.out.println(firstNum + " multiplied by " + secondNum + " is: " + (firstNum * secondNum));
                break;
            case 'd':
                System.out.println(firstNum + " divided by " + secondNum + " is: " + (firstNum / secondNum));
                break;
            default:
                break;
        }
    }
}
