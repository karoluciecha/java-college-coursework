package exams;

import java.io.IOException;
import java.util.Scanner;

public class ExamOne {

	private static void exerciseOne() {
//		Question 6d
		PernamentEmployee.setShareValue(500);
		
//		Question 6e
		PernamentEmployee elysiaDelgado = new PernamentEmployee(11, "Elysia Delgado", 50, 35, 25);
		
//		Question 6f
		System.out.println("The salary for " + elysiaDelgado.name + " is: " + elysiaDelgado.calculateSalary() + ".");
		
//		Question 6g
		elysiaDelgado.display();
		
//		Question 6h
		System.out.println(elysiaDelgado.toString());
	}
	private static void exerciseTwo() {
//		Question 7d
		HourlyWorker tiagoHood = new HourlyWorker(12, "Tiago Hood", 30, 52.5, 0);
		
//		Question 7e
		System.out.println("The salary for " + tiagoHood.name + " is: " + tiagoHood.calculateSalary() + ".");
		tiagoHood.display();
		
//		Question 10a
		Employee aizaLam = new HourlyWorker(14, "Aiza Lam", 40, 37.5, 20);
		aizaLam.display();
        }
	
	private static void exerciseThree() {

		
//		Question 7d
		Manager niaMcCarthy = new Manager(13, "Nia McCarthy", 140, 47.5, 0);
		niaMcCarthy.display();
		
//		Question 11a
		System.out.println("Interface share value: " + UnionMember.shareValue);
		
//		Question 11b
		System.out.println("Class share value: " + Employee.shareValue);
		
//		Question 12a
		Manager myHusband = new Manager(69, "Mariage", 100, 50, 25);
		Manager myWife = new Manager(69, "Mariage", 100, 50, 25);
		
//		Question 12b
		System.out.println(myHusband.equals(myWife));
		
//		Question 13b
		Masters master = new Masters();
		System.out.println(master.getMasters());
	}


	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== PernamentEmployee =====");
		exerciseOne();

		System.out.println("\n===== HourlyWorker =====");
		exerciseTwo();
		
		System.out.println("\n===== Manager =====");
		exerciseThree();

		scanner.close();
	}
}