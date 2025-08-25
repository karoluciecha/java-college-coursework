package morePolymorphism;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		UseAnimals us = new UseAnimals();
		Animal animalObj = new Animal();
		Animal animalRefToHorse = new Horse(); // Polymorphic declaration
		Horse horseObj = new Horse();
		us.doStuff(animalObj); // In the Animal version
		us.doStuff(horseObj); // In the Horse version
		us.doStuff(animalRefToHorse); // In the Animal version
//		Method overloading happens at compile time - LHS of object creation
//		Method overriding happens at run time
//		At compile time - Animal animalRefToHorse = new Horse();
//		doStuff() method sees an Animal type ref - doesn't care it turns into Horse
//		Object at run time
		animalObj.eat(); // Generic Animal eating
		horseObj.eat(); // Horse eating hay
		animalRefToHorse.eat(); // Horse eating hay
		horseObj.eat("apples"); // Horse eating apples
//		animalObj.eat("treats"); // Animal does not have this method
//		animalRefToHorse.eat("carrots"); // Animal does not have this method
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== UseAnimals =====");
		exerciseOne();

		scanner.close();
	}
}