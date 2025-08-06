package classes;

import java.io.IOException;
import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		//Create an instance of the Square object, call it box1.
		Square box1 = new Square();
		Square shape1 = new Square();
		Square alpha = new Square();
		
		//Using the setLength method you created, set the length of the box1 object to 10.
		box1.setLength(10);
		shape1.setLength(55);
		alpha.setLength(512);
		
		System.out.printf("Testing the Length Getter Method\nThe box1 length is: %d\nThe shape1 length is: %d\nThe alpha length is: %d\n\n\nTesting the Area Getter Method\nThe box1 area is: %d\nThe shape1 area is: %d\nThe alpha area is: %d\n", box1.getLength(), shape1.getLength(), alpha.getLength(), box1.getArea(), shape1.getArea(), alpha.getArea());
	}

	public static void exerciseTwo() {
		Toy spinner = new Toy();
		Toy bbYoda = new Toy();
		Toy batmobile = new Toy();
		
		spinner.setName("Spinner");
		spinner.setPrice(10.99);
		
		bbYoda.setName("Baby Yoda");
		bbYoda.setPrice(19.99);
		
		batmobile.setName("Batmobile");
		batmobile.setPrice(35.49);
		
		System.out.printf("Name: %s\nPrice: %.2f\nName: %s\nPrice: %.2f\nName: %s\nPrice: %.2f\n", spinner.getName(), spinner.getPrice(), bbYoda.getName(), bbYoda.getPrice(), batmobile.getName(), batmobile.getPrice());
	}

	private static void exerciseThree() {
		Phone apple = new Phone();
		Phone samsung = new Phone();
		Phone nokia = new Phone();
		
		apple.setName("Apple iPhone 15 Pro Max");
		apple.setPrice(599.99);
		apple.setStock(11);
		
		samsung.setName("Samsung Galaxy S24 Ultra");
		samsung.setPrice(549.99);
		samsung.setStock(4);
		
		nokia.setName("Nokia Lumia 830");
		nokia.setPrice(95.83);
		nokia.setStock(6);
		
		System.out.printf("Name: %s\nPrice: %.2f\nStock: %d\nName: %s\nPrice: %.2f\nStock: %d\nName: %s\nPrice: %.2f\nStock: %d\n", apple.getName(), apple.getPrice(), apple.getStock(), samsung.getName(), samsung.getPrice(), samsung.getStock(), nokia.getName(), nokia.getPrice(), nokia.getStock());
	}

	private static void exerciseFour() {
		ClsEx4 twix = new ClsEx4();
		ClsEx4 powder = new ClsEx4();
		ClsEx4 toothpaste = new ClsEx4();
		ClsEx4 apples = new ClsEx4();
		
		twix.setName("Twix Bar");
		twix.setPriceC(0.40);
		twix.retailPrice();
		
		powder.setName("Daz Washing Powder 10kg");
		powder.setPriceC(6.05);
		powder.retailPrice();
		
		toothpaste.setName("Colgate Toothpaste");
		toothpaste.setPriceC(1.25);
		toothpaste.retailPrice();
		
		apples.setName("Granny Smiths 6-Pack Apples");
		apples.setPriceC(1.10);
		apples.retailPrice();
		
		System.out.printf("Product Details:\nProduct 1 Name: %s\nProduct 1 Cost Price: %.2f\nProduct 1 Retail Price: %.2f\n\nProduct Details:\nProduct 2 Name: %s\nProduct 2 Cost Price: %.2f\nProduct 2 Retail Price: %.2f\n\nProduct Details:\nProduct 3 Name: %s\nProduct 3 Cost Price: %.2f\nProduct 3 Retail Price: %.2f\n\nProduct Details:\nProduct 4 Name: %s\nProduct 4 Cost Price: %.2f\nProduct 4 Retail Price: %.2f\n", twix.getName(), twix.getPriceC(), twix.getPriceR(), powder.getName(), powder.getPriceC(), powder.getPriceR(), toothpaste.getName(), toothpaste.getPriceC(), toothpaste.getPriceR(), apples.getName(), apples.getPriceC(), apples.getPriceR());
	}

	private static void exerciseFive() {
		PersonalInformation p1 = new PersonalInformation();
		PersonalInformation p2 = new PersonalInformation();
		PersonalInformation p3 = new PersonalInformation();
		
		p1.setName("Joe Mahoney");
		p1.setAge(27);
		p1.setAddress("724 22nd Street");
		p1.setPhone("(555)555-1234");

		p2.setName("Geri Rose");
		p2.setAge(24);
		p2.setAddress("149 East Bay Street");
		p2.setPhone("(555)555-5678");
		
		p3.setName("John Carbonni");
		p3.setAge(28);
		p3.setAddress("22 King Street");
		p3.setPhone("(555)555-0123");
		
		System.out.printf("My information:\nName: %s\nAge: %d\nAddress: %s\nPhone: %s\n\nFriend #1's information:\nName: %s\nAge: %d\nAddress: %s\nPhone: %s\n\nFriend #2's information:\nName: %s\nAge: %d\nAddress: %s\nPhone: %s\n", p1.getName(), p1.getAge(), p1.getAddress(), p1.getPhone(), p2.getName(), p2.getAge(), p2.getAddress(), p2.getPhone(), p3.getName(), p3.getAge(), p3.getAddress(), p3.getPhone());
	}

	private static void exerciseSix() {
		Car car1 = new Car();

		car1.setYear(2004);
		car1.setMake("Porsche");
		car1.setSpeed(0);
		
		System.out.printf("Current status of the car:\nYear model: %d\nMake: %s\nSpeed: %.0f\n\n", car1.getYear(), car1.getMake(), car1.getSpeed());
		System.out.printf("Accelerating...\n");
		for (int i = 0; i < 5; i++) car1.accelerate();
		System.out.printf("Now the speed is: %.0f\n", car1.getSpeed());
		System.out.printf("Braking...\n");
		for (int i = 0; i < 5; i++) car1.brake();
		System.out.printf("Now the speed is: %.0f\n", car1.getSpeed());
	}

	public static void main(String[] args) throws IOException {
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

		scanner.close();
	}
}