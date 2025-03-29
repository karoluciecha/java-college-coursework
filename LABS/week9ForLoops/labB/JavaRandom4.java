// Karol Uciecha - G00436758
import java.util.Random;
public class JavaRandom4 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        System.out.printf("Random number: %d\n", (randomNumber.nextInt(31)));
        System.out.printf("Random number: %d\n", (randomNumber.nextInt(31)));
    }
}