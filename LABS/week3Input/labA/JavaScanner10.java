// Karol G00436758
import java.util.Scanner;
import java.util.Calendar;

public class JavaScanner10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int yearBorn, age;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.print("Please enter your age: ");
        yearBorn = keyboard.nextInt();
        age = Calendar.getInstance().get(Calendar.YEAR) - yearBorn;
        // age = Year.now().getValue() - yearBorn;
        System.out.println("Greetings, " + name + "!\nYou were born in " + yearBorn + " and therefore you are " + age + " years old this year.");
        keyboard.close();
    }
}