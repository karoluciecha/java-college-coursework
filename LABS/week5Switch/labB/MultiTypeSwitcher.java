// Karol G00436758
import java.util.Scanner;
public class MultiTypeSwitcher {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice, ni1 = 0, ni2 = 0;
        double nd1 = 0D;
        float nf1 = 0F, nf2 = 0F;
        String s1, s2;
        char c;
        boolean b1, b2;
        do {
            System.out.printf("Choose a data type to perform an operation:\n1: int\n2: double\n3: float\n4: string\n5: char\n6: boolean\nEnter your choice: ");
            choice = console.nextInt();
        } while ((choice < 1) || (choice > 6));

        switch (choice) {
            case 1:
                System.out.printf("Enter two integers separated by a space: ");
                ni1 = console.nextInt();
                ni2 = console.nextInt();
                System.out.printf("The sum of %d and %d is %d.\n\n", ni1, ni2, (ni1 + ni2));
                break;
            case 2:
                System.out.printf("Enter a double: ");
                nd1 = console.nextDouble();
                System.out.printf("The square root of %.2f is %.2f.\n\n", nd1, Math.sqrt(nd1));
                break;
            case 3:
                System.out.printf("Enter two floats separated by a space: ");
                nf1 = console.nextFloat();
                nf2 = console.nextFloat();
                System.out.printf("The reminder of %.2f divided by %.2f is %.2f.\n\n", nf1, nf2, (nf1 % nf2));
                break;
            case 4:
                System.out.printf("Enter two strings separated by a space: ");
                s1 = console.nextLine();
                s2 = console.nextLine();
                System.out.printf("The concatenated string is %s.\n\n", (s1 + s2));
                break;
            case 5:
                System.out.printf("Enter a lowercase character: ");
                c = console.next().charAt(0);
                System.out.printf("The uppercase of '%c' is '%c'.\n\n", c, Character.toUpperCase(c));
                break;
            case 6:
                System.out.printf("Enter two boolean values separated by a space (true/false): ");
                b1 = console.nextBoolean();
                b2 = console.nextBoolean();
                System.out.printf("The logical AND of %b and %b is %b.\n\n", b1, b2, (b1 && b2));
                break;
        }
        console.close();
    }
}
