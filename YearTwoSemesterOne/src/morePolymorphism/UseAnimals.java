package morePolymorphism;

class Animal {
	void eat() {
		System.out.println("Generic Animal eating");
	}
}

class Horse extends Animal {
	@Override
	void eat() {
		System.out.println("Horse eating hay");
	}

	void eat(String s) {
		System.out.println("Horse eating " + s);
	} // overloaded method
}

public class UseAnimals {
// 2 overloaded methods

	void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}

	void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}
}