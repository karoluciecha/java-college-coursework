// Karol G00436758
import java.util.Scanner;
public class Exercise15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String ans;
        String q[] = {"Reboot the computer and try to connect.", "Reboot the router and try to connect.", "Make sure the cables between the router & modem are pluged in firmly.", "Move the router to a new location and try to connect.", "Get a new router."};
        int i = 0;
        System.out.println("This program will help you diagnose a bad Wi-Fi connection\n");
        do {
            do {
                System.out.println("Perform this action:  " + q[i]);
                if (!(i < 4)) {
                    console.close();
                    return;
                }
                System.out.print("Did that fix the problem? (yes / no) ");
                ans = console.nextLine();
                ans = ans.toLowerCase();
            } while (!(ans.equals("yes")) && !(ans.equals("y")) && !(ans.equals("no")) && !(ans.equals("n")));
            i++;
        } while ((ans.equals("no")) || (ans.equals("n")));

        console.close();
    }
}
