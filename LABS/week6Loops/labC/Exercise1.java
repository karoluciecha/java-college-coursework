// Karol G00436758
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double low = Double.MAX_VALUE, high = Double.MIN_VALUE, average = 0D, temp = 0D;
        int count = 0;
        System.out.printf("How many numbers would you like to input? ");
        count = console.nextInt();
        if (count <= 0) {
            System.out.printf("Negative number was entered. Program is now exiting...\n\n");
            console.close();
            return;
        }
        for(int i = 1; i <= count; i++) {
            System.out.printf("Enter number %d: ", i);
            temp = console.nextDouble();
            average += temp;
            if (temp < low) {
                low = temp;
            }
            if (temp > high) {
                high = temp;
            }
        }
        average /= count;
        System.out.printf("Average of numbers: %.2f\n", average);
        System.out.printf("Highest number: %.2f\n", high);
        System.out.printf("Lowest number: %.2f\n\n", low);
        console.close();
    }
}