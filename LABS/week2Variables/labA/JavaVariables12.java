// Karol G00436758
import java.time.Year;
import java.util.Scanner;
public class JavaVariables12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("- - - - Age Calculator - - - -");
        System.out.print("Enter your birth year: ");
        int yearBorn = myObj.nextInt();
        System.out.println("Year entered: " + yearBorn);
        int yearCurrent = (Year.now().getValue()) - yearBorn;
        System.out.println("You are " + yearCurrent + " this year!");
        System.out.println("- - - - - - - - - - - - - - -");



        myObj.close();
    }
}
