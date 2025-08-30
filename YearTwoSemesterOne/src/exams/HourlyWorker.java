package exams;

// Question 7a
public class HourlyWorker extends Employee {

	protected double numHolidays;

//	Question 7b
	public HourlyWorker(int id, String name, double hourlyRate, double actualNumOfHours, double numHolidays) {
		this(id, hourlyRate, actualNumOfHours, name);

//		Question 7c
		this.numHolidays = numHolidays;
	}

//	Question 7b
	public HourlyWorker(int id, double hourlyRate, double actualNumOfHours, String name) {
		super(id, name, hourlyRate, actualNumOfHours);
	}

//	Question 7e
	@Override
	void display() {
		System.out.println("Hourly Worker [ID: " + id + ", Name: " + name + ", Number of Holidays: " + numHolidays
				+ ", Weekly Salary: " + calculateSalary() + ", Current Share Value: " + shareValue + "]");
	}

	@Override
	double calculateSalary() {
		if (actualNumOfHours > normalNumOfHours) {
			double overtime = actualNumOfHours - normalNumOfHours;
			return (hourlyRate * normalNumOfHours) + ((hourlyRate * 2) * overtime);
		}
		return hourlyRate * normalNumOfHours;

	}
}