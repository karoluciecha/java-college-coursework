package finalKeyword;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		FinalData fd1 = new FinalData();
		// fd1.i1++; cant change a final value - i1 is a constant
		fd1.v2.i++;// Object can be changed - not constant
		fd1.v1 = new Value();// OK not final
		// fd1.v2= new Value();cant change a final reference
		// fd1.v3cant change a final reference
		fd1.print("fd1");
		System.out.println("Creating new final data");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");// value for i5 will never change - static only loaded once
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== FinalData =====");
		exerciseOne();

		scanner.close();
	}
}