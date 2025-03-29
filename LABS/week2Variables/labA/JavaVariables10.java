// Karol G00436758
import java.util.Scanner;
public class JavaVariables10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        char answer = 'y';
        do {
            int length, width;
            System.out.print("Enter length: ");
            length = myObj.nextInt();
            System.out.print("Enter width: ");
            width = myObj.nextInt();
            double area = length * width;
            System.out.println("The area of the rectangle is: " + area + "\n\n");
            System.out.print("\t ");
            for(int i = 0; i < (length / 2) - 1; i++) {
                System.out.print(" ");
            }
            System.out.println(length);
            System.out.print("\t ");
            for(int i = 0; i < length; i++) {
                System.out.print("-");
            }
            System.out.println();
            for(int i = 0; i < width; i++) {
                System.out.print("\t|");
                for(int j = 0; j < (length); j++) {
                    System.out.print(" ");
                }
                if ((width % 2 == 0) && ((i+1) == (width / 2))) {
                    System.out.print("| " + width + "\n");
                }
                else if( width % 2 == 1 && ((i + 1) == ((width + 1) / 2))) {
                    System.out.print("| " + width + "\n");
                }
                else {
                    System.out.print("|\n");
                }
            }
            System.out.print("\t ");
            for(int i = 0; i < length; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.print("Do you want to start over? (Y/N): ");
            answer = myObj.next().charAt(0);
        } while((answer == 'y') || (answer == 'Y'));
        myObj.close();
    }
}
