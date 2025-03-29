// Karol G00436758
import java.util.Scanner;
public class JavaIfElse5 {
    public static void main(String[] args) {
        int firstNum, secondNum;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNum = console.nextInt();
        System.out.print("Enter second number: ");
        secondNum = console.nextInt();
        if (firstNum < secondNum) {
            System.out.println("The second number is greater than the first number");
        } else if (firstNum > secondNum) {
            System.out.println("The first number is greater than the second number");
        } else if (firstNum == secondNum) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("NaN?");
        }
        console.close();
    }
}
