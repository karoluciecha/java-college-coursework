// Karol G00436758
import java.util.Scanner;
public class StringLengthCalc {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word;
        do {
            System.out.printf("Enter a word: ");
            word = console.nextLine();
            if (word.length() == 5) {
                System.out.printf("%s has 5 characters!\n", word);
            }
            System.out.printf("-------------\n");
        } while (!word.equals(""));
        console.close();
    }    
}