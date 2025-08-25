package moreCertification;

import java.util.Scanner;

import certification.Parent; // or import certification.*;

public class EverythingOne extends Parent {

	public static void exerciseOne() {
		Parent p = new Parent();
		EverythingOne c = new EverythingOne();
		// System.out.println("Cannot access protected variable Parent class " + p.x);
		System.out.println("Child subclass can access Parent variable in another package " + c.i);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Child =====");
		exerciseOne();

		scanner.close();
	}
}
