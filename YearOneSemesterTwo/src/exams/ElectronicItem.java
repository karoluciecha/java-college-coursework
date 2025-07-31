package exams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElectronicItem {
	private String name;
	private String category;
	private double price;
	private int quantity;
	private String manufacturer;
	private String id;
	private static List<String> generatedIds = new ArrayList<>();


	public ElectronicItem() {
		name = "defaultName";
		category = "defaultCategory";
		price = 0.00D;
		quantity = 0;
		manufacturer = "defaultManufacturer";
		generateUniqueId();
	}
	public ElectronicItem(String name, String category, double price, int quantity, String manufacturer) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
		generateUniqueId();
	}
	public ElectronicItem(String name, double price) {
		this.name = name;
		this.price = price;
		generateUniqueId();
	}
	public ElectronicItem(String fileName) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			Scanner inputFile = new Scanner(reader);
			name = inputFile.nextLine();
			category = inputFile.next();
			price = inputFile.nextDouble();
			quantity = inputFile.nextInt();
			manufacturer = inputFile.next();
			generateUniqueId();
		    reader.close();
		    inputFile.close();
		} catch (IOException e) {
			name = "defaultName";
			category = "defaultCategory";
			price = 0.00D;
			quantity = 0;
			manufacturer = "defaultManufacturer";
			generateUniqueId();
        }
	}
	private void generateUniqueId() {
		Random rnd = new Random();
		boolean isUnique = false;
        while (!isUnique) {
            String newId = String.format("%c%d", (char) (rnd.nextInt(26) + 'A'), rnd.nextInt(900000) + 100000);
            if (!generatedIds.contains(newId)) {
                id = newId;
                generatedIds.add(newId);
                isUnique = true;
            }
		}
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(double price) {
		if (price < 0) System.out.printf("Price cannot be negative. Please set a valid price.\n");
		else {
			this.price = price;
			System.out.printf("New price set successfully.\n");
		}
	}
	public void setQuantity(int quantity) {
		if (quantity < 0) System.out.printf("Quantity cannot be negative. Please set a valid quantity.\n");
		else this.quantity = quantity;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void quantityToAdd(int quantity) {
		if (quantity < 0) System.out.printf("Cannot restock a negative quantity. Please enter a valid quantity.\n");
		else {
			this.quantity += quantity;
			System.out.printf("Restocked successfully. New quantity: %d\n", this.quantity);
		}
	}
	public void quantityToSell(int quantity) {
		if (this.quantity < quantity) System.out.printf("Insufficient stock to sell %d units.\n", quantity);
		else {
			this.quantity -= quantity;
			System.out.printf("Sold %d units. Total sale: $%.2f.\n", quantity, quantity * price);
		}
	}
	public void displayDetails() {
		System.out.printf("ID: %s, Name: %s, Category: %s, Price: $%.2f, Quantity: %d, Manufacturer: %s\n", id, name, category, price, quantity, manufacturer);
	}
	public void applyDiscount(double percentage) {
        double discountedPrice = price * (1 - percentage / 100);
        if (discountedPrice < 0.25 * price)
            System.out.printf("Cannot apply discount. Discounted price cannot be lower than 25% of the initial price.\n");
        else {
            this.price = discountedPrice;
            System.out.printf("Discount applied successfully.\n");
        }
	}

}