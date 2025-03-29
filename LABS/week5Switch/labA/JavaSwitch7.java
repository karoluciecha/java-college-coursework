// Karol G00436758
import java.util.Scanner;

public class JavaSwitch7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double wage = 0D, bonus = 0D;
        char grade;

        do {
            System.out.print("Enter employee current weekly wage: ");
            wage = console.nextDouble();
        } while (wage < 0);
        while (true) {
            System.out.print("Enter employee grade (A/B/C/F): ");
            grade = console.next().charAt(0);
            grade = Character.toUpperCase(grade);
            if (grade == 'A') {
                bonus = 100D;
                break;
            }
            if (grade == 'B') {
                bonus = 50D;
                break;
            }
            if (grade == 'C') {
                bonus = 15D;
                break;
            }
            if (grade == 'F') {
                System.out.println("This weeks wage is " + wage + ", there is no bonus.");
                console.close();
                return;
            }
        }
        System.out.println("Grade " + grade + ". This weeks wage plus bonus is " + (wage + bonus) + ".");
        console.close();
    }
}
