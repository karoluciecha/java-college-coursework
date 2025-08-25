package polymorphism;

public class ShapeTest {

	static Shape randShape() {
		switch ((int) (Math.random() * 3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}
}