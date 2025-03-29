// Karol G00436758
import java.util.Scanner;
public class JavaPrintf5 {
    public static void main(String[] args) {
        final double WAGE = 20076.345D;
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter employee name: ");
        String name = console.nextLine().toUpperCase();
        System.out.printf("Wage is currently: EUR %,.2f\n", WAGE);
        System.out.printf("Enter percentage increase: ");
        double wageIncrease = console.nextDouble();
        System.out.printf("Percentage wage increase is: %.3f\n", wageIncrease);
        double wageAdd = WAGE * (wageIncrease / 100);
        System.out.printf("Wage increase in value is: EUR %,.2f\n", wageAdd);
        System.out.printf("%s's new wage is: EUR %,.2f\n", name, (WAGE + wageAdd));
        
        
        
        console.close();
    }
}