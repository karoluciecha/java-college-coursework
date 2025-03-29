// Karol G00436758
import java.util.Scanner;
public class JavaSwitch4 {
    public static void main(String[] args) {
        char charac = 0;
        Scanner console = new Scanner(System.in);
            System.out.print("Enter letter: ");
            charac = console.next().charAt(0);
            charac = Character.toLowerCase(charac);
        switch (charac) {
            case 'a':
                System.out.println("apple!");
                break;
            case 'b':
                System.out.println("banana!");
                break;
            case 'c':
                System.out.println("coconut!");
                break;
            default:
                System.out.println("Invalid value entered!");
                break;
        }
        console.close();
    }
}