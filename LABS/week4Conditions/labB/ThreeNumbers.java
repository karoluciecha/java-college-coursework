// Karol G00436758
import java.util.Scanner;
public class ThreeNumbers {
    public static void main(String[] args) {
        int n1, n2;
        Scanner console = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        n1 = console.nextInt();
        System.out.print("Input the 2nd number: ");
        n2  = console.nextInt();
        if (n1 >= n2) {
            System.out.print("Input the 3rd number: ");
            n2  = console.nextInt();
        } else {
            System.out.print("Input the 3rd number: ");
            n1  = console.nextInt();
        }
        if (n1 >= n2) {
            System.out.println("Biggest number is: " + n1);
        } else {
            System.out.println("Biggest number is: " + n2);
        }
        console.close();
    }
}