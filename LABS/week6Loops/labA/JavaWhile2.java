// Karol G00436758
import java.util.Scanner;
public class JavaWhile2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String words;
        int count = -1;
        do {
            System.out.printf("What word(s) will be output: ");
            words = console.nextLine();
        } while (words.equals(""));
        do {
            System.out.printf("Enter number of times word should be printed: ");
            count = console.nextInt();
        } while (count < 0);
        while (count > 0) {
            System.out.println(words);
            count--;
        }
        console.close();
    }    
}
