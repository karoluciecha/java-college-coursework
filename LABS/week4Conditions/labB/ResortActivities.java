// Karol G00436758
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ResortActivities {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double temperature = 0D;
        String city;
        int i = 0;
        List<String> cityl = new ArrayList<>();
        cityl.add("galway");
        cityl.add("athlone");




        System.out.println("- - - W E L C O M E   T O - - -");
        System.out.println("        LAZY DAYS RESORT       ");
        System.out.println("- - -    I r e l a n d    - - -\n");
        
        do {
        System.out.print("Enter current temperature: ");
        temperature = console.nextDouble();            
        } while (temperature < 5);
        
        console.nextLine();
         while (true) {
            System.out.print("Enter location: ");
            city = console.nextLine();
            city = city.toLowerCase();
            if (cityl.get(i).equals(city)) {
                break;
            } else if(cityl.get(i + 1).equals(city)) {
                break;
            }
        }

        if ((temperature > 30) || (temperature < 5)) {
            System.out.println("Visit our gift shop!");
        } else if (temperature >= 20) {
             switch(cityl.get(i)) {
                case "galway":
                    System.out.println("Activity: swimming");
                    break;
                case "athlone":
                    System.out.println("Activity: sailing");
                    break;
             }
        } else if (temperature >= 15) {
            System.out.println("Activity: tennis");
        } else if (temperature >= 10) {
             switch(cityl.get(i)) {
                case "galway":
                    System.out.println("Activity: golf");
                    break;
                case "athlone":
                    System.out.println("Activity: angling");
                    break;
             }
        } else if (temperature >= 5) {
            System.out.println("Activity: hiking");
        }
        console.close();
    }
}
