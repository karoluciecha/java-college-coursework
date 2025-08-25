package polymorphism;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		Animal[] animals = new Animal[5];
//		compile time = run time
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Wolf();
		animals[3] = new Lion();
		animals[4] = new Hippo();
		// Polymorphic method calls
		for (int i = 0; i < animals.length; i++) {
			animals[i].eat();
		}
		
		Animal w = new Wolf();
		w.eat();
	}

	private static void exerciseTwo() {
		Shape c = new Circle(); // polymorphism at work
		c.draw(); // polymorphic method call
		Circle n = new Circle();
		n.drawBiggerCircle(); // cannot do this polymorphically - method not in base class
		Shape[] s = new Shape[9];
		// fill up array with shapes
		for (int i = 0; i < s.length; i++) s[i] = ShapeTest.randShape();
		// make polymorphic method calls
		for (int i = 0; i < s.length; i++) s[i].draw();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Animal =====");
		exerciseOne();
		
		System.out.println("\n===== ShapeTest =====");
		exerciseTwo();

		scanner.close();
	}
}