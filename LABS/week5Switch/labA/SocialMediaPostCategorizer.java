// Karol G00436758
import java.util.Scanner;
public class SocialMediaPostCategorizer {
    public static void main (String[] args) {
        final String POST_TYPE[] = {"Text", "Image", "Video", "Poll"};
        final String POST_AUDIENCE[] = {"Public", "Friends", "Private"};
        Scanner console = new Scanner(System.in);
        int choice1 = 0, choice2 = 0;

        do {
            System.out.print("Select post type:\n1: Text post\n2: Image post\n3: Video post\n4: Poll\n5: Exit program\nEnter your choice: ");
            choice1 = console.nextInt();
        } while ((choice1 < 1) || (choice1 > 5));
        switch(choice1) {
            case 1:
            case 2:
            case 3:
            case 4:
                do {
                System.out.print("Select audience type:\n1: Public\n2: Friends\n3: Private\nEnter your choice: ");
                choice2 = console.nextInt();
                } while ((choice2 < 1) || (choice2 > 3));
                break;
            case 5:
                console.close();
                return;
        }
        System.out.println("You have selected: " + POST_TYPE[choice1 - 1] + " post.");
        System.out.println("Your audience is set to: " + POST_AUDIENCE[choice2 - 1] + ".");
      console.close();
    }
}