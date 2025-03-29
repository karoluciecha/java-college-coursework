// Karol G00436758
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SalaryCheck {
    public static void main(String[] args) {
        List<String> rtg = new ArrayList<>();
        rtg.add("excellent");
        rtg.add("good");
        rtg.add("poor");
        List<Double> prc = new ArrayList<>();
        prc.add(Double.valueOf(0.06));
        prc.add(Double.valueOf(0.04));
        prc.add(Double.valueOf(0.01));
        double salary = 0D, raise = 0D, newSalary = 0D;
        int i = 0;
        String rating;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the current salary: ");
        salary = console.nextFloat();
        console.nextLine();
        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating  = console.nextLine();
        while (i <= 2) {
            if (rating.equalsIgnoreCase(rtg.get(i))) {
                break;
            }
            i++;
        }

        raise = salary * prc.get(i);
        newSalary = salary + raise;

        System.out.println("\nCurrent Salary: " + salary);
        System.out.println("Amount of your raise: " + raise);
        System.out.println("Your new salary: " + newSalary);

        console.close();
    }
}