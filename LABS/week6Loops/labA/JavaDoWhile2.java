// Karol G00436758
import java.util.Scanner;
public class JavaDoWhile2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = 0D;
        char answer;

        do
        {
            System.out.printf("Enter a number: ");
            number = console.nextDouble();
            if ((number % 2) == 0)
            {
                System.out.printf("Number is even.\n");
            }
            else
            {
                System.out.printf("Number is odd.\n");
            }
            System.out.printf("Enter Y to continue: ");
            answer = console.next().charAt(0);
            answer = Character.toLowerCase(answer);
        } while (answer == 'y');
        console.close();
    }    
}