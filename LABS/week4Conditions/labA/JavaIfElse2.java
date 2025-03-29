// Karol G00436758
import java.util.Scanner;
public class JavaIfElse2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter current temperature: ");
        double temperature = console.nextDouble();
        if (temperature > 25) {
            System.out.println("It's hot outside!");
        } else if (temperature < 5) {
            System.out.println("It's cold outside!");
        } else {
            System.out.println("It's okay outside!");
        }
        console.close();
    }
}
