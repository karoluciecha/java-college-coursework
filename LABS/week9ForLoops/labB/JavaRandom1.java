// Karol Uciecha - G00436758
import java.util.Random;
public class JavaRandom1 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int num1;
        num1 = randomNumber.nextInt(10);
        System.out.printf("%d\n", num1);
    }
}