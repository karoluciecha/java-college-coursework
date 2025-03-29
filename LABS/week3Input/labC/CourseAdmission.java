// Karol G00436758
import java.util.Scanner;
public class CourseAdmission {
    public static void main(String[] args) {
        double maths, phy, chem, sum;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your score in Mathematics (%): ");
        maths = console.nextDouble();
        System.out.print("Enter your score in Physics (%): ");
        phy = console.nextDouble();
        System.out.print("Enter your score in Chemistry (%): ");
        chem = console.nextDouble();
        sum = maths + phy + chem;
        if ((maths >= 65) && (phy >= 55) && (chem >= 50) && (sum >= 190)) {
            System.out.println("The candidate is eligible for admission.");
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }
        console.close();
    }
}