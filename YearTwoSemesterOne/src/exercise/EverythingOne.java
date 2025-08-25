package exercise;

import java.util.Scanner;

public class EverythingOne {

	private static void exerciseOne() {
		Student mary = new Student("mary", "smith");
		Student beth = new Student("mary", "smith");
		Student joe = new Student();
		ExamStudent kelly = new ExamStudent();
		System.out.println(mary); // toString() method
		System.out.println(mary.equals(beth)); // equals compare objects
		Student.setRegistrationFee(3000); // class name to call static method
		System.out.println(kelly.calculateAverageGrade(4f));
		System.out.println(kelly.calculateAverageGrade(4f, 4f));
		System.out.println(kelly);
		joe.setFirstName("joe").setMiddleName("sam").setLastName("jones"); // cascading methods
		System.out.println(joe);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Student =====");
		exerciseOne();

		scanner.close();
	}
}