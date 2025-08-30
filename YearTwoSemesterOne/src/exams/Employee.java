package exams;

// Question 5a
public abstract class Employee {
	protected int id;
	protected String name;
	protected double hourlyRate;
	protected double actualNumOfHours;
	protected double normalNumOfHours = 37.5;
	protected static double shareValue = 300;
	
	public Employee(int id, String name, double hourlyRate, double actualNumOfHours) {
		this(id, name, hourlyRate);
		this.actualNumOfHours = actualNumOfHours;
	}
	
	public Employee(int id, String name, double hourlyRate) {
		this.id = id;
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
//	Question 5b
	abstract void display();
	
	abstract double calculateSalary();
	
//	Question 5c
	public static void setShareValue(double shareValue) {
		Employee.shareValue = shareValue;
	}
}
