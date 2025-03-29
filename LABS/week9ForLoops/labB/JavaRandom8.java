// Karol Uciecha - G00436758
import java.util.Random;
public class JavaRandom8 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        System.out.printf("Random double between 1.0 and 10.0: %f.\n", (1 + (10 - 1) * randomNumber.nextDouble()));
    }
}