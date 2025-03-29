// Karol G00436758
import java.util.Scanner;
public class JavaStringCompare1 {
    public static void main(String[] args) {
        String fname, sname;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first name: ");
        fname = console.nextLine();
        System.out.print("Enter second name: ");
        sname = console.nextLine();
        if (fname.equalsIgnoreCase(sname)) {
            System.out.println("The names " + fname + " and " + sname + " match!");
        } else {
            System.out.println(fname + " and " + sname + " are different!");
        }
        console.close();
    }
}