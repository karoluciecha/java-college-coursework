// Karol G00436758
import java.util.Scanner;
public class JavaDoWhilePass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String pass;

        do {
            System.out.printf("Enter password: ");
            pass = console.nextLine();
        } while (!pass.equals("mypass"));
        System.out.printf("Access granted!\n");
        console.close();
    }
}
