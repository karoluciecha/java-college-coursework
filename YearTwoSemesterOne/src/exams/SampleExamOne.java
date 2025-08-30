package exams;

import java.util.Scanner;

import exercise.ExamStudent;

public class SampleExamOne {

	private static void exerciseOne() {        
		ElephantKeeper shalonKramer = new ElephantKeeper(2, "Shalon Kramer", 35.5, 18);
		
//		Question 2e
		shalonKramer.display();
        }
	
	private static void exerciseTwo() {
//		Question 5e
		WolfKeeper nolaGaus = new WolfKeeper(5, "Nola Gaus", 43.5, 15);
		System.out.println(nolaGaus);
		WolfKeeper.displayBonus();
		
//		Question 6b
		WolfKeeper freddaSchall = new WolfKeeper(6, "Fredda Schall", 40, 20);
		freddaSchall.payRegistrationFee();
		
//		Question 9b
		Halter halter = new Halter();
		System.out.println(halter.getHalter());
	}

	private static void exerciseThree() {
//		Question 7
		AnimalKeeper[] keepers = new AnimalKeeper[3];
		keepers[0] = new TigerKeeper(11, "Tiger", 11.1, 11);
		keepers[1] = new WolfKeeper(22, "Wolf", 22.2, 22);
		keepers[2] = new ElephantKeeper(33, "Elephant", 33.3, 33);
		
		for (int i = 0; i < keepers.length; i++) {
			keepers[i].display();
		}
	}

	private static void exerciseFour() {
		// Use implicit default constructor
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
	}
	
	private static void exerciseFive() {
		OffShoreAccount anonacc = new OffShoreAccount(989, "anon", 9000000, "spain");
		anonacc.displayBalance();
	}
	
	private static void exerciseSix() {
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

		System.out.println("===== ElephantKeeper =====");
		exerciseOne();

		System.out.println("\n===== WolfKeeper =====");
		exerciseTwo();

		System.out.println("\n===== AnimalKeeper =====");
		exerciseThree();
		
		System.out.println("\n===== EqualsMethod =====");
		exerciseFour();
		
		System.out.println("\n===== OffShoreAccount =====");
		exerciseFive();
		
		System.out.println("\n===== Student =====");
		exerciseSix();
		
		scanner.close();
	}
}