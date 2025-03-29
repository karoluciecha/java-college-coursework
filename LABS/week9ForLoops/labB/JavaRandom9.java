// Karol Uciecha - G00436758
import java.util.Random;
import java.util.Scanner;
public class JavaRandom9 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner console = new Scanner(System.in);
        int side, guess;
        System.out.printf("LUCKY DICE GAME!\n\n");
            side = (randomNumber.nextInt(6) + 1);
            System.out.printf("Place your bets!!\nWhat side will the dice land on?: ");
            guess = console.nextInt();
            if (guess == side) {
                System.out.printf("You won!\n");
            } else {
                System.out.printf("Aw. You lost. Better luck next time.\n");
            }
        console.close();
    }
}