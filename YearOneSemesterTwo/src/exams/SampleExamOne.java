package exams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Define the superclass CafeItem
class CafeItem {
 private String name;
 private String description;
 private double price;
 private static double totalMoneyReceived = 0;

 public CafeItem(String name, String description, double price) {
     this.name = name;
     this.description = description;
     this.price = price;
     totalMoneyReceived += price;
 }

 public String getName() {
     return name;
 }

 public String getDescription() {
     return description;
 }

 public double getPrice() {
     return price;
 }

 public static double getTotalMoneyReceived() {
     return totalMoneyReceived;
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Description: " + description + ", Price: $" + price;
 }
}

//Define the subclass Coffee
class Coffee extends CafeItem {
 private String origin;
 private String roastLevel;
 private static int quantity = 0;

 public Coffee(String name, String description, double price, String origin, String roastLevel) {
     super(name, description, price);
     this.origin = origin;
     this.roastLevel = roastLevel;
     quantity++;
 }

 public String getOrigin() {
     return origin;
 }

 public String getRoastLevel() {
     return roastLevel;
 }

 public static int getQuantity() {
     return quantity;
 }

 @Override
 public String toString() {
     return super.toString() + ", Origin: " + origin + ", Roast Level: " + roastLevel;
 }
}

//Define the subclass Snack
class Snack extends CafeItem {
 private boolean isVegetarian;
 private static int quantity = 0;

 public Snack(String name, String description, double price, boolean isVegetarian) {
     super(name, description, price);
     this.isVegetarian = isVegetarian;
     quantity++;
 }

 public boolean isVegetarian() {
     return isVegetarian;
 }

 public static int getQuantity() {
     return quantity;
 }

 @Override
 public String toString() {
     return super.toString() + ", Vegetarian: " + isVegetarian;
 }
}

public class SampleExamOne {

	private static void exerciseOne(Scanner console) {
        List<String> fruits = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/exams/fruits.txt"))) {
            String fruit;
            while ((fruit = reader.readLine()) != null) {
                fruits.add(fruit.trim().toLowerCase()); // Normalize to lower case for case-insensitive search
            }
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
            return;
        }

        System.out.print("Enter fruit to search for: ");
        String searchFruit = console.nextLine().toLowerCase(); // Normalize input for case-insensitivity

        long count = fruits.stream()
                           .filter(f -> f.equals(searchFruit))
                           .count();

        System.out.println("The number of times " + searchFruit + " appears in the array is: " + count);
	}

	private static void exerciseTwo(Scanner console) {        
        // Getting user input for the dimensions and initial values
        System.out.print("Enter the number of rows: ");
        int rows = console.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = console.nextInt();
        System.out.print("Enter the starting value: ");
        int start = console.nextInt();
        System.out.print("Enter the increment value: ");
        int increment = console.nextInt();
        
        while (true) {
            // Generate and display the 2D array
            int[][] array = generateArray(rows, columns, start, increment);
            displayArray(array);

            // Prompt to change the increment value
            System.out.print("Would you like to change the increment value? (yes/no): ");
            String response = console.next();
            if (!(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"))) {
                break; // Exit if the user doesn't want to change the increment
            }

            System.out.print("Enter the new increment value: ");
            increment = console.nextInt(); // Update increment value
        }
        }

    private static int[][] generateArray(int rows, int cols, int start, int increment) {
        int[][] array = new int[rows][cols];
        int value = start;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value += increment; // Increment the value for the next element
            }
        }
        return array;
    }

    private static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

	private static void exerciseThree(Scanner console) {
        // Create initial Coffee and Snack objects
        Coffee coffee1 = new Coffee("Espresso", "Intense and rich espresso", 2.99, "Italy", "Dark");
        Snack snack1 = new Snack("Chocolate Chip Cookie", "A classic chocolate chip cookie", 1.99, true);

        // Print the details of each object
        System.out.println("Print out the details of the coffee object:");
        System.out.println(coffee1);
        System.out.println("Print out the details of the snack object:");
        System.out.println(snack1);

        // Display counts and total money after initial objects creation
        System.out.println("Number of Coffee Objects: " + Coffee.getQuantity());
        System.out.println("Number of Snack Objects: " + Snack.getQuantity());
        System.out.println("Total money in: " + CafeItem.getTotalMoneyReceived());

        // Create additional Coffee and Snack objects
        Coffee coffee2 = new Coffee("Latte", "Smooth and delicious", 3.15, "France", "Medium");
        Snack snack2 = new Snack("Blueberry Muffin", "Freshly baked today", 2.10, true);

        // Displaying additional details after creating new objects
        System.out.println("\nCreating additional Snack and Coffee items");
        System.out.println("Print out the details of all coffee objects:");
        System.out.println(coffee1);
        System.out.println(coffee2);
        System.out.println("Print out the details of all snack objects:");
        System.out.println(snack1);
        System.out.println(snack2);

        // Display counts and total money after all objects creation
        System.out.println("Number of Coffee Objects: " + Coffee.getQuantity());
        System.out.println("Number of Snack Objects: " + Snack.getQuantity());
        System.out.println("Total money in: " + CafeItem.getTotalMoneyReceived());
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