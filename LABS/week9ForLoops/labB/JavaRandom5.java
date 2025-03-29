// Karol Uciecha - G00436758
import java.util.Random;
import java.util.Scanner;
public class JavaRandom5 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner console = new Scanner(System.in);
        int num1, num2, sum1, ans1;
        System.out.printf("WELCOME TO THE MATHS ADDITION GAME\n\n");
        for (int i = 0; i < 5; i++) {
            num1 = (randomNumber.nextInt(26) + 5);
            num2 = (randomNumber.nextInt(26) + 5);
            sum1 = num1 + num2;
            System.out.printf("What is %d plus %d?: ", num1, num2);
            ans1 = console.nextInt();
            if (ans1 == sum1) {
                System.out.printf("Correct!\n\n");
            } else {
                System.out.printf("Hmmm... that's not correct. The answer is %d.\n\n", sum1);
            }
        }
        console.close();
    }
}