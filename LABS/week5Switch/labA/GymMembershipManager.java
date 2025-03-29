// Karol G00436758
import java.util.Scanner;
public class GymMembershipManager {
    public static void main (String[] args) {
        final double MEMBERSHIP_PRICE[] = {20D, 40D, 60D};
        final String MEMBERSHIP_NAME[] = {"Basic", "Premium", "VIP"};
        Scanner console = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.print("Gym Membership Manager:\n1: Basic Membership ($20/month)\n2: Premium Membership ($40/month)\n3: VIP Membership ($60/month)\n4: Exit program\nPlease enter your choice: ");
            choice = console.nextInt();
        } while ((choice < 1) || (choice > 4));
        switch(choice) {
            case 1:
            case 2:
            case 3:
                System.out.println("You have selected " + MEMBERSHIP_NAME[choice - 1] + " Membership. The annual cost is $" + String.format("%.2f", (MEMBERSHIP_PRICE[choice - 1] * 12)) + ".");
                break;
            case 4:
                break;
        }
      console.close();
    }
}
