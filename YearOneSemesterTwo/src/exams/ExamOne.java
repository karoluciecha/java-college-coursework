package exams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExamOne {

	private static void exerciseOne(Scanner console) {
		
		int number = 0;
		while (true) {
			System.out.printf("Enter a number (or enter -1 to exit): ");
			number = console.nextInt();
			if (number == -1) {
				return;
			}
			if (isEven(number)) System.out.printf("%d is an even number.\n", number);
			else System.out.printf("%d is an odd number.\n", number);

			if (isDivisibleByThree(number)) System.out.printf("%d is divisible by 3.\n", number);
			else System.out.printf("%d is not divisible by 3.\n", number);

			if (isDivisibleByFive(number)) System.out.printf("%d is divisible by 5.\n", number);
			else System.out.printf("%d is not divisible by 5.\n", number);
		}
	}
	
    public static boolean isEven(int number) {
		if ((number % 2) == 0) return true;
		else return false;
	}
    public static boolean isDivisibleByThree(int number) {
		while (number > 0) number -= 3;
		if (number == 0) return true;
		else return false;
	}
    public static boolean isDivisibleByFive(int number) {
		while (number > 0) number -= 5;
		if (number == 0) return true;
		else return false;
	}

	private static void exerciseTwo(Scanner console) {
		System.out.println(minMax("src/exams/WeatherData.txt"));
		search("src/exams/WeatherData.txt", console);
	}
	
	public static String minMax(String fileName) {
		int min = 0, max = 0, minN, maxN;
		String result;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			Scanner inputFile = new Scanner(reader);
			inputFile.nextInt();
			inputFile.next();
			min = inputFile.nextInt();
			max = inputFile.nextInt();
			while (inputFile.hasNext()) {
				inputFile.nextInt();
				inputFile.next();
				minN = inputFile.nextInt();
				if (minN < min) min = minN;
				maxN = inputFile.nextInt();
				if (maxN > max) max = maxN;
			}
		    reader.close();
		    inputFile.close();
		    } catch (IOException e) {
		            e.printStackTrace();
        }
        result = String.format("Lowest temperature of the year: %d\nHighest temperature of the year: %d\n", min, max);
        return result;
    }
    public static void search(String fileName, Scanner console) {
		int day = 0, dayN = 0, minTemperature = 0, maxTemperature = 0;
		boolean found = false;
		String month = "", monthN = "";
		char cont = 'Y';

		while (true) {
			found = false;
			System.out.printf("Enter the day and month you want to search for (e.g., 15 January): ");
			day = console.nextInt();
			month = console.next();
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				Scanner inputFile = new Scanner(reader);
				while (inputFile.hasNext()) {
					dayN = inputFile.nextInt();
					monthN = inputFile.next();
					minTemperature = inputFile.nextInt();
					maxTemperature = inputFile.nextInt();
					if (day == dayN) if (month.equalsIgnoreCase(monthN)) {
						System.out.printf("Day: %d, Month: %s, Min Temp: %d, Max Temp: %d\n\n", day, month, minTemperature, maxTemperature);
						found = true;
						break;
					}
				}
				if(!found) System.out.printf("No data found for %d %s\n\n", day, month);
		    	reader.close();
		    	inputFile.close();
		    } catch (IOException e) {
				e.printStackTrace();
				}
			System.out.printf("Would you like to search again? (Y/N): ");
			cont = Character.toUpperCase(console.next().charAt(0));
			if (cont == 'N') {
				return;
			}
		}
	}
	
	private static void exerciseThree(Scanner console) {
		int choice = 0;
		ElectronicItem i1 = new ElectronicItem("src/exams/DellComputer.txt");
		System.out.printf("Inventory Management System\n");
		while (true) {
		choice = 0;
		System.out.printf("1. Set Item Details\n2. Display Item Details\n3. Restock Item\n4. Sell Item\n5. Apply Discount to Price\n6. Set Selling Price\n7. Set All Fields\n0. Exit\nEnter your choice: ");
		choice = console.nextInt();
		if (choice == 0) break;
		if (choice == 1) {
			System.out.printf("Enter name: ");
			console.nextLine();
			i1.setName(console.nextLine());
			System.out.printf("Enter price: ");
			i1.setPrice(console.nextDouble());
		}
		else if (choice == 2) {
			i1.displayDetails();
		}
		else if (choice == 3) {
			System.out.printf("Enter quantity to add: ");
			i1.quantityToAdd(console.nextInt());
		}
		else if (choice == 4) {
			System.out.printf("Enter quantity to sell: ");
			i1.quantityToSell(console.nextInt());
		}
		else if (choice == 5) {
			System.out.printf("Enter discount percentage: ");
			i1.applyDiscount(console.nextDouble());
		}
		else if (choice == 6) {
			System.out.printf("Enter new selling price: ");
			i1.setPrice(console.nextDouble());
		}
		else if (choice == 7) {
		}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo(scanner);
		
		System.out.println("\n===== Exercise 3 =====");
		exerciseThree(scanner);

		scanner.close();
	}
}
