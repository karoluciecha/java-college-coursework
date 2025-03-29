// Karol G00436758
import java.util.Scanner;
public class JavaConvertKms {
    public static void main(String[] args) {
        final double MTK = 1.609D;
        Scanner console = new Scanner(System.in);
        double miles = -1D, kilometers = 0D;
        int precision = 0;
        do {
            System.out.printf("Enter miles: ");
            miles = console.nextDouble();
        } while (miles < 0);
        do {
            System.out.printf("Enter how many decimal points required in answer (0/1/2/3): ");
            precision = console.nextInt();
        } while (miles < 0);
        kilometers = miles * MTK;

        String formattedResult = String.format("%." + precision + "f", kilometers);
        System.out.printf("%f miles is %s kilometers.", miles, formattedResult);




        console.close();
    }
}
