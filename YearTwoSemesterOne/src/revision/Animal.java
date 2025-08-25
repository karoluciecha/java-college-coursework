package revision;

// One abstract method - class must be abstract
// Can have non abstract methods in this class

public abstract class Animal {
	void roam() {
		
	}
	abstract void eat(); // no -> {} body
	
//	public static abstract void foo(); // method cannot be both static and abstract
	
//	Cannot override a static method
	static void f() {}
}