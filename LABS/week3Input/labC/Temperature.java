// Karol G00436758
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        double temperatureB, temperatureA;
        char unit;
        Scanner console = new Scanner(System.in);
        System.out.println("-- Temperature Converter --");
        System.out.print("Please enter a temperature: ");
        temperatureB = console.nextDouble();
        System.out.print("Is this temperature in Fahrenheit or Celsius? (F/C): ");
        unit = console.next().charAt(0);
        if ((unit == 'c') || (unit == 'C')) {
            temperatureA = (temperatureB * (9.0 / 5.0)) + 32;
            System.out.println("\nThe temperature in Celsius is: " + temperatureA + ".");
        } else if ((unit == 'f') || (unit == 'F')) {
            temperatureA = ((temperatureB - 32) * (5.0 / 9.0));
            System.out.println("\nThe temperature in Fahrenheit is: " + temperatureA + ".");
        }
        console.close();
    }
}