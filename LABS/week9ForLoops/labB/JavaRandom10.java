// Karol Uciecha - G00436758
import java.util.Random;
import java.util.Scanner;
public class JavaRandom10 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner console = new Scanner(System.in);
        String[] greetings = {"Hi there!", "Hello to you too!", "Hey!", "Greetings!"};
        System.out.printf("Enter a greeting: ");
        console.nextLine();
        System.out.printf("%s\n", greetings[randomNumber.nextInt(5)]);
        console.close();
    }
}