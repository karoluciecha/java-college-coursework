// Karol G00436758
import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        int id;
        String fname, sname;
        double maths, chem, hist, avg;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        id = console.nextInt();
        console.nextLine();
        System.out.print("Enter student first name: ");
        fname = console.nextLine();
        System.out.print("Enter student surname: ");
        sname = console.nextLine();
        System.out.print("Enter result for Maths: ");
        maths = console.nextDouble();
        System.out.print("Enter result for Chemistry: ");
        chem = console.nextDouble();
        System.out.print("Enter result for History: ");
        hist = console.nextDouble();

        avg = (maths + hist + chem) / 3;
        
        System.out.println("\nStudent ID: " + id + "\nStudent name: " + fname + " " + sname + "\nAverage score: " + avg);
        console.close();
    }
}