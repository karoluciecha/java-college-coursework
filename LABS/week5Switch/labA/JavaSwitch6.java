// Karol G00436758
import java.util.Scanner;
public class JavaSwitch6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name;
        System.out.print("Enter username: ");
        name = console.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        switch (name) {
            case "Grace":
                System.out.println("Welcome " + name + " - Admin level access granted!");
                break;
            case "Larry": 
                System.out.println("Welcome " + name + " - User level access granted!");
                break;
            default: 
                System.out.println("Access is denied!");
                break;
        }

        console.close();
    }
}
