// Karol G00436758
import java.util.Scanner;
public class JavaLogicalOperators3 {
    public static void main(String[] args) {
        int year;
        Scanner console = new Scanner(System.in);
        System.out.print("Year: ");
        year = console.nextInt();
        System.out.println("Checking if year " + year + " is outside range for 20th century:");
        if ((year < 1901) || (year > 2000)) {
            System.out.println("This year was not in the 20th century.");
        } else {
            System.out.println("This year was in the 20th century.");
        }
        console.close();
    }
}