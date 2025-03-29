// Karol G00436758
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HotelBooking {
    public static void main(String[] args) {
        final double RATE = 50.0D;
        final String euroSymbol = "\u20ac";
        List<String> ngt = new ArrayList<>();
        ngt.add("one");
        ngt.add("two");
        ngt.add("three");
        ngt.add("four");
        ngt.add("five");
        ngt.add("six");
        ngt.add("seven");
        int nights = 0;
        double price = 0D, rateCoupon = 0D;
        char coupon;
        Scanner console = new Scanner(System.in);

        System.out.println("HOTEL ROOM BOOKING");
        System.out.println("-------------------\n\n\n");

        do {
            System.out.print("Enter stay durration (1 to 7 nights): ");
            nights = console.nextInt();
        } while ((nights < 1) || (nights > 7));
        
        do {
            System.out.print("Valid coupon? (y or n): ");
            coupon  = console.next().charAt(0);
            coupon = Character.toLowerCase(coupon);
        } while ((coupon != 'y') && (coupon != 'n'));

        if (coupon == 'y') {
            do {
                System.out.print("Enter discount rate: ");
                rateCoupon = console.nextDouble();
            } while ((nights < 0) || (nights > 100));
            if (rateCoupon == 0) {
                price = nights * RATE;

                System.out.println("Cost for " + ngt.get(nights - 1) + " nights @ " + RATE + euroSymbol + " per night is " + price + euroSymbol + ".");    
                console.close();
                return;
            }
            rateCoupon = RATE * (rateCoupon / 100);
            price = nights * rateCoupon;

            System.out.println("Cost for " + ngt.get(nights - 1) + " nights @ " + rateCoupon + euroSymbol + " per night is " + price + euroSymbol + ".");
        } else {
            price = nights * RATE;

            System.out.println("Cost for " + ngt.get(nights - 1) + " nights @ " + RATE + euroSymbol + " per night is " + price + euroSymbol + ".");
        }

        console.close();
    }
}