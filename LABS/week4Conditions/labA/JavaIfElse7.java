// Karol G00436758
import java.util.Scanner;
public class JavaIfElse7 {
    public static void main(String[] args) {
        int score;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter score number: ");
        score = console.nextInt();
        if (score > 100) {
            System.out.println("An incorrect score was entered");
        } else if (score >= 70 ) {
            System.out.println("Score of " + score + ". Grade is A");
        } else if (score >= 60) {
            System.out.println("Score of " + score + ". Grade is B");
        } else if (score >= 50) {
            System.out.println("Score of " + score + ". Grade is C");
        } else if (score >= 40) {
            System.out.println("Score of " + score + ". Grade is D");
        } else if (score >= 0) {
            System.out.println("Score of " + score + "is less than 40. Grade is E");
        } else {
            System.out.println("An incorrect score was entered");
        }
        console.close();
    }
}