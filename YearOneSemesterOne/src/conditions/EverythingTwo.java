package conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EverythingTwo {

	private static void exerciseOne(Scanner console) {
		int books = -1, points = 0;
		do {
			System.out.print("How many books have you purchased this month? ");
			books = console.nextInt();
		} while (books < 0);
		if (books >= 4) {
			points = 60;
		} else if (books == 3) {
			points = 30;
		} else if (books == 2) {
			points = 15;
		} else if (books == 1) {
			points = 5;
		}
		System.out.println("You've earned " + points + " points.");
	}

	private static void exerciseTwo(Scanner console) {
		List<Character> pcgl = new ArrayList<>();
		pcgl.add('A');
		pcgl.add('B');
		pcgl.add('C');
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
		switch (pcgl.get(i)) {
		case 'A':
			cost = 9.95D;
			if (hours <= 20) {
				System.out.println("Total cost is: " + cost + ". No extra hours were used.");
			} else {
				cost += (hours - 20) * 2;
				System.out.println("Total cost is: " + cost + ".");
			}
			break;
		case 'B':
			cost = 13.95D;
			if (hours <= 30) {
				System.out.println("Total cost is: " + cost + ". No extra hours were used.");
			} else {
				cost += (hours - 30) * 1;
				System.out.println("Total cost is: " + cost + ".");
			}
			break;
		case 'C':
			cost = 29.95D;
			System.out.println("Total cost is: " + cost + ", all-inclusive.");
			break;
		default:
			break;
		}
	}

	private static void exerciseThree(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String vegetarian, vegan, gluten;
		int v = 1, w = 1, g = 1;
		String[] restaurants = { "Joe's Gourment Burgers", "Main Street Pizza Company", "Corner Café",
				"Mama's Fine Italian", "The Chef's Kitchen" };
		int[][] tof = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 0 } };
		System.out.println("This program will help you select a restaurant.");
		do {
			System.out.print("Is anyone in your party a vegetarian? (yes or no): ");
			vegetarian = console.nextLine();
			vegetarian = vegetarian.toLowerCase();
		} while (!(vegetarian.equals("yes")) && !(vegetarian.equals("y")) && !(vegetarian.equals("no"))
				&& !(vegetarian.equals("n")));
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

		if ((vegetarian.equals("yes")) || (vegetarian.equals("y"))) {
			v = 0;
		}
		if ((vegan.equals("yes")) || (vegan.equals("y"))) {
			w = 0;
		}
		if ((gluten.equals("yes")) || (gluten.equals("y"))) {
			g = 0;
		}
		for (int i = 0; i < 5; i++) {
			if ((tof[i][0] <= v) && (tof[i][1] <= w) && (tof[i][2] <= g)) {
				System.out.println(restaurants[i]);
			}
		}
	}

	private static void exerciseFour(Scanner console) {
		String ans;
		String q[] = { "Reboot the computer and try to connect.", "Reboot the router and try to connect.",
				"Make sure the cables between the router & modem are pluged in firmly.",
				"Move the router to a new location and try to connect.", "Get a new router." };
		int i = 0;
		System.out.println("This program will help you diagnose a bad Wi-Fi connection\n");
		do {
			do {
				System.out.println("Perform this action:  " + q[i]);
				if (!(i < 4)) {
					return;
				}
				System.out.print("Did that fix the problem? (yes / no) ");
				ans = console.nextLine();
				ans = ans.toLowerCase();
			} while (!(ans.equals("yes")) && !(ans.equals("y")) && !(ans.equals("no")) && !(ans.equals("n")));
			i++;
		} while ((ans.equals("no")) || (ans.equals("n")));
	}

	private static void exerciseFive(Scanner console) {
		final double speed[] = { 1100, 4900, 16400 };
		final String mediums[] = { "air", "water", "steel" };
		String medium;
		double distance = -1D;
		int i = -1;

		while (true) {
			System.out.print("Enter one of the following: air, water, or steel: ");
			medium = console.nextLine();
			medium = medium.toLowerCase();
			if (medium.equals(mediums[0])) {
				i = 0;
				break;
			} else if (medium.equals(mediums[1])) {
				i = 1;
				break;
			} else if (medium.equals(mediums[2])) {
				i = 2;
				break;
			}
		}
		do {
			System.out.print("Enter othe distance the sound wave will travel: ");
			distance = console.nextDouble();
		} while (distance < 0);

		System.out.println("It will take " + (distance / speed[i]) + " seconds.");
	}

	private static void exerciseSix(Scanner console) {
		float n1;
		System.out.print("Input value: ");
		n1 = console.nextFloat();

		if (n1 == 0) {
			System.out.println("Zero");
		} else if (n1 > 0) {
			if ((n1 > 0) && (n1 < 1)) {
				System.out.println("Positive small number");
			} else if (n1 >= 1000000) {
				System.out.println("Positive large number");
			} else {
				System.out.println("Positive");
			}
		} else if (n1 < 0) {
			if ((n1 < 0) && (n1 > -1)) {
				System.out.println("Negative small number");
			} else if (n1 <= -1000000) {
				System.out.println("Negative large number");
			} else {
				System.out.println("Negative");
			}
		}
	}

	private static void exerciseSeven(Scanner console) {
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

		System.out.println("HOTEL ROOM BOOKING");
		System.out.println("-------------------\n\n\n");

		do {
			System.out.print("Enter stay durration (1 to 7 nights): ");
			nights = console.nextInt();
		} while ((nights < 1) || (nights > 7));

		do {
			System.out.print("Valid coupon? (y or n): ");
			coupon = console.next().charAt(0);
			coupon = Character.toLowerCase(coupon);
		} while ((coupon != 'y') && (coupon != 'n'));

		if (coupon == 'y') {
			do {
				System.out.print("Enter discount rate: ");
				rateCoupon = console.nextDouble();
			} while ((nights < 0) || (nights > 100));
			if (rateCoupon == 0) {
				price = nights * RATE;

				System.out.println("Cost for " + ngt.get(nights - 1) + " nights @ " + RATE + euroSymbol
						+ " per night is " + price + euroSymbol + ".");
				return;
			}
			rateCoupon = RATE * (rateCoupon / 100);
			price = nights * rateCoupon;

			System.out.println("Cost for " + ngt.get(nights - 1) + " nights @ " + rateCoupon + euroSymbol
					+ " per night is " + price + euroSymbol + ".");
		} else {
			price = nights * RATE;

			System.out.println("Cost for " + ngt.get(nights - 1) + " nights @ " + RATE + euroSymbol + " per night is "
					+ price + euroSymbol + ".");
		}
	}

	private static void exerciseEight(Scanner console) {
		System.out.print("Enter temperature: ");
		int temperature = console.nextInt();
		System.out.println("Current temperature is " + temperature);
		if ((temperature > -10) && (temperature < 30)) {
			System.out.println("Current temperature is within the normal range.");
		} else {
			System.out.println("Current temperature is outside the normal range.");
		}
	}

	private static void exerciseNine(Scanner console) {
		int amount1, amount2;
		System.out.print("Amount 1: ");
		amount1 = console.nextInt();
		System.out.print("Amount 2: ");
		amount2 = console.nextInt();
		if ((amount1 > 10) && (amount2 < 100)) {
			System.out.println("Amount 1 is greater than 10!");
			System.out.println("Amount 2 is less than 100!");
		} else {
			System.out.println("The numbers are not in the specified range!");
		}
	}

	private static void exerciseTen(Scanner console) {
		int year;
		System.out.print("Year: ");
		year = console.nextInt();
		System.out.println("Checking if year " + year + " is outside range for 20th century:");
		if ((year < 1901) || (year > 2000)) {
			System.out.println("This year was not in the 20th century.");
		} else {
			System.out.println("This year was in the 20th century.");
		}
	}

	private static void exerciseEleven(Scanner console) {
		if (console.hasNextLine())
			console.nextLine();
		String fname, sname;
		System.out.print("Enter first name: ");
		fname = console.nextLine();
		System.out.print("Enter second name: ");
		sname = console.nextLine();
		if (fname.equalsIgnoreCase(sname)) {
			System.out.println("The names " + fname + " and " + sname + " match!");
		} else {
			System.out.println(fname + " and " + sname + " are different!");
		}
	}

	private static void exerciseTwelve(Scanner console) {
		String username, password;
		System.out.print("Enter username: ");
		username = console.nextLine();
		System.out.print("Enter password: ");
		password = console.nextLine();
		if (username.equalsIgnoreCase("Bob") && (password.equalsIgnoreCase("pass"))) {
			System.out.println("----------------------------------------------------------\n");
			System.out.println("\tS Y S T E M   A C C E S S   G R A N T E D\n");
			System.out.println("----------------------------------------------------------");
		} else {
			System.out.println("----------------------------------------------------------");
			System.out.println("Username or password incorrect.\n");
			System.out.println("\t\tA C C E S S   D E N I E D\n");
			System.out.println("----------------------------------------------------------");
		}
	}

	private static void exerciseThirteen(Scanner scanner) {
		String[] runners = new String[3];
		int[] times = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter runner " + (i + 1) + " name: ");
			runners[i] = scanner.nextLine();
			System.out.print("Enter runner " + (i + 1) + " time (in minutes): ");
			times[i] = scanner.nextInt();
			scanner.nextLine();
		}

		// Sort the runners and times in ascending order of time
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2 - i; j++) {
				if (times[j] > times[j + 1]) {
					int tempTime = times[j];
					times[j] = times[j + 1];
					times[j + 1] = tempTime;
					String tempName = runners[j];
					runners[j] = runners[j + 1];
					runners[j + 1] = tempName;
				}
			}
		}

		System.out.println("\n\n----------------------------------\n\n");
		System.out.println(runners[0] + " was the winner!");
		System.out.println(runners[1] + " was second!");
		System.out.println(runners[2] + " was third!");
	}

	private static void exerciseFourteen(Scanner console) {
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
			} else if (cityl.get(i + 1).equals(city)) {
				break;
			}
		}

		if ((temperature > 30) || (temperature < 5)) {
			System.out.println("Visit our gift shop!");
		} else if (temperature >= 20) {
			switch (cityl.get(i)) {
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
			switch (cityl.get(i)) {
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
	}

	private static void exerciseFifteen(Scanner console) {
		List<String> rtg = new ArrayList<>();
		rtg.add("excellent");
		rtg.add("good");
		rtg.add("poor");
		List<Double> prc = new ArrayList<>();
		prc.add(Double.valueOf(0.06));
		prc.add(Double.valueOf(0.04));
		prc.add(Double.valueOf(0.01));
		double salary = 0D, raise = 0D, newSalary = 0D;
		int i = 0;
		String rating;

		System.out.print("Enter the current salary: ");
		salary = console.nextFloat();
		console.nextLine();
		System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
		rating = console.nextLine();
		while (i <= 2) {
			if (rating.equalsIgnoreCase(rtg.get(i))) {
				break;
			}
			i++;
		}

		raise = salary * prc.get(i);
		newSalary = salary + raise;

		System.out.println("\nCurrent Salary: " + salary);
		System.out.println("Amount of your raise: " + raise);
		System.out.println("Your new salary: " + newSalary);
	}

	private static void exerciseSixteen(Scanner console) {
		int n1, n2;
		System.out.print("Input the 1st number: ");
		n1 = console.nextInt();
		System.out.print("Input the 2nd number: ");
		n2 = console.nextInt();
		if (n1 >= n2) {
			System.out.print("Input the 3rd number: ");
			n2 = console.nextInt();
		} else {
			System.out.print("Input the 3rd number: ");
			n1 = console.nextInt();
		}
		if (n1 >= n2) {
			System.out.println("Biggest number is: " + n1);
		} else {
			System.out.println("Biggest number is: " + n2);
		}
	}

	private static void exerciseSeventeen(Scanner console) {
		int n1, n2, n3;
		System.out.print("Input number 1: ");
		n1 = console.nextInt();
		System.out.print("Input number 2: ");
		n2 = console.nextInt();
		System.out.print("Input number 3: ");
		n3 = console.nextInt();
		if ((n1 >= n2) && (n1 >= n3) && (n2 >= n3)) {
			System.out.println("Numbers are decreasing in size!");
		} else if ((n3 >= n2) && (n3 >= n1) && (n2 >= n1)) {
			System.out.println("Numbers are increasing in size!");
		} else {
			System.out.println("Numbers are neither increasing or decreasing!");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo(scanner);

		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour(scanner);

		System.out.println("\n===== Exercise 5 =====");
		exerciseFive(scanner);

		System.out.println("\n===== Exercise 6 =====");
		exerciseSix(scanner);

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

		System.out.println("\n===== Exercise 13 =====");
		exerciseThirteen(scanner);

		System.out.println("\n===== Exercise 14 =====");
		exerciseFourteen(scanner);

		System.out.println("\n===== Exercise 15 =====");
		exerciseFifteen(scanner);

		System.out.println("\n===== Exercise 16 =====");
		exerciseSixteen(scanner);

		System.out.println("\n===== Exercise 17 =====");
		exerciseSeventeen(scanner);

		scanner.close();
	}
}