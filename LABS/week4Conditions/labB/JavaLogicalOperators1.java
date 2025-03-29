// Karol G00436758
import java.util.Scanner;
public class JavaLogicalOperators1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temperature = console.nextInt();
        System.out.println("Current temperature is " + temperature);
        if ((temperature > -10) && (temperature < 30)) {
            System.out.println("Current temperature is within the normal range.");
        } else {
            System.out.println("Current temperature is outside the normal range.");
        }
        console.close();
    }
}
