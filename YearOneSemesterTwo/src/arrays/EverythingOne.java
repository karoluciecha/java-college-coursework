package arrays;

import java.util.Random;
import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		//Create an integer array with 4 elements
		int[] myArray = {55, 66, 77, 88};
		for (int i = 0; i < myArray.length; i++) {
			System.out.printf("%d\n", myArray[i]);
		}
		myArray[2] = 99;
		System.out.printf("%d\n", myArray[2]);
	}

	private static void exerciseTwo() {
		//Create an integer array with 5 elements
		Random rand = new Random();
		int[] myArray = new int[5];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rand.nextInt(1000) + 1;
			System.out.printf("%d\n", myArray[i]);
		}
	}

	private static void exerciseThree() {
		//Create an array containing 3 double
		double[] ex3array = {23.45, 45.44, 67.12};
		double sum = 0;
		for (int i = 0; i < ex3array.length; i++) {
			sum += ex3array[i];
		}
		System.out.printf("The sum of all %d values is: %.2f.\n",ex3array.length, sum);
	}

	private static void exerciseFour() {
		int[] ex4array = {34, 27, 45, 68, 98};
		System.out.printf("%d\nArray Values are:\n", ex4array.length);
		for (int i = 0; i < ex4array.length; i++) {
			System.out.printf("%d\n", ex4array[i]);
		}
	}

	private static void exerciseFive() {
		int[] ex5array = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int sumAll = 0, sumF = 0, sumL = 0;
		for (int i = 0; i < ex5array.length; i++) {
			sumAll += ex5array[i];
		}
		for (int i = 0; i < ex5array.length - 5; i++) {
			sumF += ex5array[i];
		}
		for (int i = 5; i < ex5array.length; i++) {
			sumL += ex5array[i];
		}
		System.out.printf("The sum of all %d values is: %d.\n",ex5array.length, sumAll);
		System.out.printf("The sum of the first %d values is: %d.\n",ex5array.length - 5, sumF);
		System.out.printf("The sum of the last %d values is: %d.\n",ex5array.length - 5, sumL);
	}

	private static void exerciseSix() {
		double[] ex6array = {32.55, 45.88, 125.21, 456.5, 1.25, 4.1, 89.6, 78.2, 97.2354, 655.01};
		System.out.printf("The array Values are as follows:\n");
		for (int i = 0; i < ex6array.length; i++) {
			System.out.printf("Index %d value is: %.2f\n", i, ex6array[i]);
		}
	}

	private static void exerciseSeven(Scanner console) {
		int[] ex7array = new int[5];
		for (int i = 0; i < ex7array.length; i++) {
			System.out.printf("Enter value %d: ", i);
			ex7array[i] = console.nextInt();
		}
		System.out.printf("\n\nValues entered are as follows:\n\n");
		for (int i = 0; i < ex7array.length; i++) {
			System.out.printf("Index %d is: %d\n", i, ex7array[i]);
		}
	}

	private static void exerciseEight(Scanner console) {
		console.nextLine();
		String[] names = new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.printf("Enter value %d: ", i);
			names[i] = console.nextLine();
		}
		System.out.printf("\n\nNames entered are as follows:\n\n");
		for (int i = 0; i < names.length; i++) {
			System.out.printf("Index %d is: %s\n", i, names[i]);
		}
	}

	private static void exerciseNine(Scanner console) {
		double[] ex9array = new double[12];
		double sum = 0;
		for (int i = 0; i < ex9array.length; i++) {
			System.out.printf("Enter sales for month %d: ", i + 1);
			ex9array[i] = console.nextDouble();
		}
		System.out.printf("\nSales per month were as follows:\n\n");
		for (int i = 0; i < ex9array.length; i++) {
			System.out.printf("Month %d is: %.2f\n", i + 1, ex9array[i]);
			sum += ex9array[i];
		}
		System.out.printf("Total sales for the year: %.2f\nAverage monthly sales for the year: %.2f\n", sum, sum / 12);
	}

	private static void exerciseTen(Scanner console) {
		int num = 0, ans = -1;
		System.out.printf("How many names do you wish to enter: ");
		num = console.nextInt();
		console.nextLine();
		String[] list = new String[num];
		for (int i = 0; i < list.length; i++) {
			System.out.printf("Enter name for index %d: ", i);
			list[i] = console.nextLine();
		}
		System.out.printf("\nNames entered:\n\n");
		for (int i = 0; i < list.length; i++) {
			System.out.printf("Name index %d: %s\n", i, list[i]);
		}
		while(true) {
			ans = -1;
			System.out.printf("\nAmend name entered? (Enter index to change or enter -1 to end): ");
			ans = console.nextInt();
			if (ans == -1) break;
			System.out.printf("\nCurrent name at index %d is: %s\nEnter new value: ", ans, list[ans]);
			list[ans] = console.nextLine();
		}
		
		System.out.printf("\nChanges complete.\n");
		System.out.printf("Names entered:\n\n");
		for (int i = 0; i < list.length; i++) {
			System.out.printf("Name index %d: %s\n", i, list[i]);
		}
	}

	private static void exerciseEleven(Scanner console) {
		console.nextLine();
		String[] namesG = {"Emily", "Madison", "Emma", "Olivia", "Hannah", "Abigail", "Isabella", "Samantha", "Elizabeth", "Ashley", "Alexis", "Sarah", "Sophia", "Alyssa", "Grace", "Ava", "Taylor", "Brianna", "Lauren", "Chloe", "Natalie", "Kayla", "Jessica", "Anna", "Victoria", "Mia", "Hailey", "Sydney", "Jasmine", "Julia", "Morgan", "Destiny", "Rachel", "Ella", "Kaitlyn", "Megan", "Katherine", "Savannah", "Jennifer", "Alexandra", "Allison", "Haley", "Maria", "Kaylee", "Lily", "Makayla", "Brooke", "Mackenzie", "Nicole", "Addison", "Stephanie", "Lillian", "Andrea", "Zoe", "Faith", "Kimberly", "Madeline", "Alexa", "Katelyn", "Gabriella", "Gabrielle", "Trinity", "Amanda", "Kylie", "Mary", "Paige", "Riley", "Jenna", "Leah", "Sara", "Rebecca", "Michelle", "Sofia", "Vanessa", "Jordan", "Angelina", "Caroline", "Avery", "Audrey", "Evelyn", "Maya", "Claire", "Autumn", "Jocelyn", "Ariana", "Nevaeh", "Arianna", "Jada", "Bailey", "Brooklyn", "Aaliyah", "Amber", "Isabel", "Danielle", "Mariah", "Melanie", "Sierra", "Erin", "Molly", "Amelia", "Isabelle", "Madelyn", "Melissa", "Jacqueline", "Marissa", "Shelby", "Angela", "Leslie", "Katie", "Jade", "Catherine", "Diana", "Aubrey", "Mya", "Amy", "Briana", "Sophie", "Gabriela", "Breanna", "Gianna", "Kennedy", "Gracie", "Peyton", "Adriana", "Christina", "Courtney", "Daniela", "Kathryn", "Lydia", "Valeria", "Layla", "Alexandria", "Natalia", "Angel", "Laura", "Charlotte", "Margaret", "Cheyenne", "Mikayla", "Miranda", "Naomi", "Kelsey", "Payton", "Ana", "Alicia", "Jillian", "Daisy", "Mckenzie", "Ashlyn", "Caitlin", "Sabrina", "Summer", "Ruby", "Rylee", "Valerie", "Skylar", "Lindsey", "Kelly", "Genesis", "Zoey", "Eva", "Sadie", "Alexia", "Cassidy", "Kylee", "Kendall", "Jordyn", "Kate", "Jayla", "Karen", "Tiffany", "Cassandra", "Juliana", "Reagan", "Caitlyn", "Giselle", "Serenity", "Alondra", "Lucy", "Kiara", "Bianca", "Crystal", "Erica", "Angelica", "Hope", "Chelsea", "Alana", "Liliana", "Brittany", "Camila", "Makenzie", "Veronica", "Lilly", "Abby", "Jazmin", "Adrianna", "Karina", "Delaney", "Ellie", "Jasmin"};
		String[] namesB = {"Jacob", "Michael", "Joshua", "Matthew", "Daniel", "Christopher", "Andrew", "Ethan", "Joseph", "William", "Anthony", "David", "Alexander", "Nicholas", "Ryan", "Tyler", "James", "John", "Jonathan", "Noah", "Brandon", "Christian", "Dylan", "Samuel", "Benjamin", "Zachary", "Nathan", "Logan", "Justin", "Gabriel", "Jose", "Austin", "Kevin", "Elijah", "Caleb", "Robert", "Thomas", "Jordan", "Cameron", "Jack", "Hunter", "Jackson", "Angel", "Isaiah", "Evan", "Isaac", "Mason", "Luke", "Jason", "Gavin", "Jayden", "Aaron", "Connor", "Aiden", "Aidan", "Kyle", "Juan", "Charles", "Luis", "Adam", "Lucas", "Brian", "Eric", "Adrian", "Nathaniel", "Sean", "Alex", "Carlos", "Bryan", "Ian", "Owen", "Jesus", "Landon", "Julian", "Chase", "Cole", "Diego", "Jeremiah", "Steven", "Sebastian", "Xavier", "Timothy", "Carter", "Wyatt", "Brayden", "Blake", "Hayden", "Devin", "Cody", "Richard", "Seth", "Dominic", "Jaden", "Antonio", "Miguel", "Liam", "Patrick", "Carson", "Jesse", "Tristan", "Alejandro", "Henry", "Victor", "Trevor", "Bryce", "Jake", "Riley", "Colin", "Jared", "Jeremy", "Mark", "Caden", "Garrett", "Parker", "Marcus", "Vincent", "Kaleb", "Kaden", "Brady", "Colton", "Kenneth", "Joel", "Oscar", "Josiah", "Jorge", "Cooper", "Ashton", "Tanner", "Eduardo", "Paul", "Edward", "Ivan", "Preston", "Maxwell", "Alan", "Levi", "Stephen", "Grant", "Nicolas", "Omar", "Dakota", "Alexis", "George", "Collin", "Eli", "Spencer", "Gage", "Max", "Cristian", "Ricardo", "Derek", "Micah", "Brody", "Francisco", "Nolan", "Ayden", "Dalton", "Shane", "Peter", "Damian", "Jeffrey", "Brendan", "Travis", "Fernando", "Peyton", "Conner", "Andres", "Javier", "Giovanni", "Shawn", "Braden", "Jonah", "Cesar", "Bradley", "Emmanuel", "Manuel", "Edgar", "Erik", "Mario", "Edwin", "Johnathan", "Devon", "Erick", "Wesley", "Oliver", "Trenton", "Hector", "Malachi", "Jalen", "Raymond", "Gregory", "Abraham", "Elias", "Leonardo", "Sergio", "Donovan", "Colby", "Marco", "Bryson", "Martin"};
		System.out.printf("Check if name is on list: ");
	    String name = console.nextLine().trim();

	    boolean found = false;
	    String category = "";

	    for (String gName : namesG) {
	        if (gName.equalsIgnoreCase(name)) {
	            found = true;
	            category = "girl";
	            break;
	        }
	    }

	    if (!found) {
	        for (String bName : namesB) {
	            if (bName.equalsIgnoreCase(name)) {
	                found = true;
	                category = "boy";
	                break;
	            }
	        }
	    }

	    if (found) {
	        System.out.printf("Yes! %s is in the %s names list.\n", name, category);
	    } else {
	        System.out.printf("Sorry, %s is not on either list.\n", name);
	    }
	}

	private static void exerciseTwelve(Scanner console) {
		int len = 0, ans = -1;
		do {
			try {
				System.out.printf("Enter the size of the double array (between 1 and 10): ");
				len = console.nextInt();
			} catch (Exception e) {
				console.nextLine();
			}
		} while (len < 1 || len > 10);
		double[] doubleArray = new double[len];
		for (int i = 0; i < doubleArray.length; i++) {
			try {
				System.out.printf("Enter value for index %d: ", i);
				doubleArray[i] = console.nextDouble();
			} catch (Exception e) {
				console.nextLine();
				i--;
			}
		}
		while(true) {
			try {
				ans = -1;
				System.out.printf("\nEnter the index (0 - %d) to output or -1 to exit: ", doubleArray.length - 1);
				ans = console.nextInt();
				if (ans == -1) {
					break;
				}
				if (ans < 0 || ans > doubleArray.length - 1) {
					System.out.printf("Invalid index. Please try again.\n");
				}
				else {
					System.out.printf("\nValue at index %d: %.2f", ans, doubleArray[ans]);
				}
			} catch (Exception e) {
				console.nextLine();
			}
		}		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne();

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree();

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour();

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive();

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix();

		System.out.println("\n===== Exercise 7 =====");
		exerciseSeven(scanner);

		System.out.println("\n===== Exercise 8 =====");
		exerciseEight(scanner);

		System.out.println("\n===== Exercise 9 =====");
		exerciseNine(scanner);

		System.out.println("\n===== Exercise 10 =====");
		exerciseTen(scanner);

		System.out.println("\n===== Exercise 11 =====");
		exerciseEleven(scanner);

		System.out.println("\n===== Exercise 12 =====");
		exerciseTwelve(scanner);

		scanner.close();
	}
}