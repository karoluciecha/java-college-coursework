// Karol G00436758
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String vegetarian, vegan, gluten;
        int v = 1, w = 1, g = 1;
        String[] restaurants = {"Joe's Gourment Burgers", "Main Street Pizza Company", "Corner Café", "Mama's Fine Italian", "The Chef's Kitchen"};
        int[][] tof = {
            {1, 1, 1},
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 1},
            {0, 0, 0}
        };
        System.out.println("This program will help you select a restaurant.");
        do {
            System.out.print("Is anyone in your party a vegetarian? (yes or no): ");
            vegetarian = console.nextLine();
            vegetarian = vegetarian.toLowerCase();
        } while (!(vegetarian.equals("yes")) && !(vegetarian.equals("y")) && !(vegetarian.equals("no")) && !(vegetarian.equals("n")));
        do {
            System.out.print("Is anyone in your party a vegan? (yes or no): ");
            vegan = console.nextLine();
            vegan = vegan.toLowerCase();
        } while (!(vegan.equals("yes")) && !(vegan.equals("y")) && !(vegan.equals("no")) && !(vegan.equals("n")));
        do {
            System.out.print("Is anyone in your party lactose intolerant? (yes or no): ");
            gluten = console.nextLine();
            gluten = gluten.toLowerCase();
        } while (!(gluten.equals("yes")) && !(gluten.equals("y")) && !(gluten.equals("no")) && !(gluten.equals("n")));
        System.out.println("Here are your restaurant choices:");

        if ((vegetarian.equals("yes")) || (vegetarian.equals("y")))
        {
            v = 0;
        }
        if ((vegan.equals("yes")) || (vegan.equals("y")))
        {
            w = 0;
        }
        if ((gluten.equals("yes")) || (gluten.equals("y")))
        {
            g = 0;
        }
        for (int i = 0; i < 5; i++) {
            if ((tof[i][0] <= v) && (tof[i][1] <= w) && (tof[i][2] <= g)) {
                System.out.println(restaurants[i]);
            }
        }

        console.close();
        };

}