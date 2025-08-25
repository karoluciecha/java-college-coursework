package staticKeyword;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		// users+=1; make users static or create an object
		DataClient client = new DataClient();
		client.users+=1;
	}

	private static void exerciseTwo() {
		// create objects
		StaticTest st1 = new StaticTest();
		StaticFun sf = new StaticFun();
		StaticTest.i++;
		System.out.println("value accessing through object " + st1.i); // Warning - not accessed in a static way
		System.out.println("Access statically " + StaticTest.i); // best method to access static by class
		System.out.println("Access method using object sf "+sf.incr()); // Warning
		System.out.println("Use class name to access method statically "+ StaticFun.incr()); // Access method static way
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== DataClient =====");
		exerciseOne();
		
		System.out.println("\n===== StaticFun =====");
		exerciseTwo();

		scanner.close();
	}
}