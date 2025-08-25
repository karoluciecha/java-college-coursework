package thisKeyword;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();//cascaded method calls
	//	objectref.objectref.objectref.objectref.method()
	}

	private static void exerciseTwo() {
		Person student = new Person();
		// cascaded method calls by using this keyword- objref.objref.objref
		student.setFirstName("Shelley").setLastName("Smith");
		System.out.println("Student name is "+student);// toString method at work
	}

	private static void exerciseThree() {
		Point p = new Point(5);
		Point r = new Point(5, 5);
		Point q = new Point(5, 5, 5);
		p.setPoint(3, 3, 3);
		p.display();
		r.display();
		q.display();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Leaf =====");
		exerciseOne();

		System.out.println("\n===== Person =====");
		exerciseTwo();

		System.out.println("\n===== Point =====");
		exerciseThree();

		scanner.close();
	}
}