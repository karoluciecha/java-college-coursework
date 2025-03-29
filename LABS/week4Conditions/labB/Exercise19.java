// Karol G00436758
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        final double speed[] = {1100, 4900, 16400};
        final String mediums[] = {"air", "water", "steel"};
        Scanner console = new Scanner(System.in);
        String medium;
        double distance = -1D;
        int i = -1;

        while (true) {
            System.out.print("Enter one of the following: air, water, or steel: ");
            medium = console.nextLine();
            medium = medium.toLowerCase();
            if (medium.equals(mediums[0])) {
                i = 0;
                break;
            } else if (medium.equals(mediums[1])) {
                i = 1;
                break;
            } else if (medium.equals(mediums[2])) {
                i = 2;
                break;
            }
        }
        do {
            System.out.print("Enter othe distance the sound wave will travel: ");
            distance = console.nextDouble();
        } while (distance < 0);
        console.close();

        System.out.println("It will take " + (distance / speed[i]) + " seconds.");
    }
}
