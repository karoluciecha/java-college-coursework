// Karol Uciecha - G00436758
import java.util.Random;
import java.util.Scanner;
public class JavaRandom2 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner console = new Scanner(System.in);
        int num1, num2;
        num1 = randomNumber.nextInt(10) + 1;
        System.out.printf("GUESSING GAME\nGuess the random number generated between 1  and 10: ");
        num2 = console.nextInt();
        if (num1 == num2) {
            System.out.printf("You guessed correctly!\n");
        } else {
            System.out.printf("Sorry, that's not the number I was thinking of!\nIt was %d. Better luck next time!\n", num1);
        }
        console.close();
    }
}