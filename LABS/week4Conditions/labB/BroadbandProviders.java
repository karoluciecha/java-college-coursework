// Karol G00436758
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BroadbandProviders {
    public static void main(String[] args) {
        List<Character> pcgl = new ArrayList<>();
        pcgl.add('A');
        pcgl.add('B');
        pcgl.add('C');
        Scanner console = new Scanner(System.in);
        String name;
        char pcg;
        double hours, cost;
        int i = 0;
        System.out.print("Enter customer name: ");
        name = console.nextLine();
        while (true) {
            System.out.print("Enter broadband package (A/B/C): ");
            pcg = console.next().charAt(0);
            pcg = Character.toUpperCase(pcg);
            if (pcg == pcgl.get(i)) {
                break;
            } else if (pcg == pcgl.get(i + 1)) {
                i++;
                break;
            } else if (pcg == pcgl.get(i + 2)) {
                i += 2;
                break;
            }
        }

        do {
            System.out.print("Enter hours used this month: ");
            hours = console.nextDouble();
        } while (hours < 0);

        System.out.println("\n-------------------------------------");
        System.out.print("Monthly bill for " + name);
        System.out.println("\n-------------------------------------");
        System.out.println("Total hours used: " + hours);
        switch(pcgl.get(i)) {
            case 'A':
                cost = 9.95D;
                if (hours <= 20) {
                    System.out.println("Total cost is: " + cost + ". No extra hours were used." );
                } else {
                    cost += (hours - 20) * 2;
                    System.out.println("Total cost is: " + cost + ".");
                }
                break;
            case 'B':
                cost = 13.95D;
                if (hours <= 30) {
                    System.out.println("Total cost is: " + cost + ". No extra hours were used." );
                } else {
                    cost += (hours - 30) * 1;
                    System.out.println("Total cost is: " + cost + ".");
                }
                break;
            case 'C':
                cost = 29.95D;
                System.out.println("Total cost is: " + cost + ", all-inclusive." );
                break;
            default:
                break;
          }
        console.close();
    }
}
