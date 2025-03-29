// Karol G00436758
import java.util.Scanner;

public class JavaScanner9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.print("Please enter your age: ");
        age = keyboard.nextInt();

        System.out.println("Greetings, " + name + "!\nYou are " + age + " years old.");
        keyboard.close();
    }
}