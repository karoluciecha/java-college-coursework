// Karol G00436758
import java.util.Scanner;
public class UpDown {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner console = new Scanner(System.in);
        System.out.print("Input number 1: ");
        n1 = console.nextInt();
        System.out.print("Input number 2: ");
        n2  = console.nextInt();
        System.out.print("Input number 3: ");
        n3  = console.nextInt();
        if ((n1 >= n2) && (n1 >= n3) && (n2 >= n3)) {
            System.out.println("Numbers are decreasing in size!");
        } else if ((n3 >= n2) && (n3 >= n1) && (n2 >= n1)) {
            System.out.println("Numbers are increasing in size!");
        } else {
            System.out.println("Numbers are neither increasing or decreasing!");
        }
        console.close();
    }
}