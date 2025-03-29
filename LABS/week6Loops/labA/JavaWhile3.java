// Karol G00436758
import java.util.Scanner;
public class JavaWhile3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char answer;
        int count = 0;

        do {
            System.out.printf("Value of number variable is %d\n", count);
            System.out.printf("Enter Y to continue: ");
            answer = console.next().charAt(0);
            answer = Character.toLowerCase(answer);
            count++;
        } while (answer == 'y');
        console.close();
    }    
}