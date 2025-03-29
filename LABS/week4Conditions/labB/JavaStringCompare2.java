// Karol G00436758
import java.util.Scanner;

public class JavaStringCompare2 {
    public static void main(String[] args) {
        String username, password;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter username:");
        username = console.nextLine();
        System.out.println("Enter password:");
        password = console.nextLine();
        if (username.equalsIgnoreCase("Bob") && (password.equalsIgnoreCase("pass"))) {
            System.out.println("----------------------------------------------------------\n");
            System.out.println("\tS Y S T E M   A C C E S S   G R A N T E D\n");
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.println("----------------------------------------------------------");
            System.out.println("Username or password incorrect.\n");
            System.out.println("\t\tA C C E S S   D E N I E D\n");
            System.out.println("----------------------------------------------------------");
        }
        console.close();
    }
}