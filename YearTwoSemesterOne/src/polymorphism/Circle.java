package polymorphism;

public class Circle extends Shape {
	
	@Override
	void draw() {
		System.out.println("Circle.draw()");
	}
	
	// This method is not in the base class
	void drawBiggerCircle() {
		System.out.println("A bigger circle");
	}
}
