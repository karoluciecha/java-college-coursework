// Karol G00436758
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        double n1, d3, d5;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n1 = console.nextDouble();
        d3 = n1 % 3;
        d5 = n1 % 5;
        if ((d3 == 0) && (d5 == 0)) {
            System.out.println("Fizz Buzz");
        } else if (d3 == 0) {
            System.out.println("Fizz");
        } else if (d5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Number is not divisible by 3 nor 5.");
        }
        console.close();
    }
}