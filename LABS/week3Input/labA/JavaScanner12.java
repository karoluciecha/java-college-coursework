// Karol G00436758
import java.util.Scanner;

public class JavaScanner12 {
    public static void main(String[] args) {
        String country;
        double population, area;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pupulation density calculator");
        System.out.println("-----------------------------");
        System.out.print("Enter country name: ");
        country = keyboard.nextLine();
        System.out.print("Enter country population: ");
        population = keyboard.nextDouble();
        System.out.print("Enter country area in square KM: ");
        area = keyboard.nextDouble();
        System.out.println("-----------------------------");
        System.out.println(country + " has " + (population/area) + " people per square kilometer.\n");
        keyboard.close();
    }
}