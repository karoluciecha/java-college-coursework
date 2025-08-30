package exams;

// Question 6a
public final class PernamentEmployee extends Employee {

	protected double numHolidays;

//	Question 6b
	public PernamentEmployee(int id, String name, double hourlyRate, double actualNumOfHours, double numHolidays) {
		super(id, name, hourlyRate, actualNumOfHours);
		this.numHolidays = numHolidays;
	}

	public PernamentEmployee(int id, String name, double hourlyRate, double numHolidays) {
		super(id, name, hourlyRate);
		this.numHolidays = numHolidays;
	}

//	Question 6c
	@Override
	void display() {
		System.out.println("Pernament Employee [ID: " + id + ", Name: " + name + ", Number of Holidays: " + numHolidays
				+ ", Salary for the week: " + calculateSalary() + "]");
	}

	@Override
	double calculateSalary() {
		if (actualNumOfHours > normalNumOfHours) {
			double overtime = actualNumOfHours - normalNumOfHours;
			return (hourlyRate * normalNumOfHours) + ((hourlyRate * 2) * overtime);
		}
		return hourlyRate * normalNumOfHours;
	}

//	Question 6h
	@Override
	public String toString() {
		if (actualNumOfHours > normalNumOfHours) {
			return "Pernament Employee [ID: " + id + ", Name: " + name + ", Number of Holidays: " + numHolidays
					+ ", Hourly Rate: " + hourlyRate + ", Working hours: " + actualNumOfHours + ", Salary: "
					+ calculateSalary() + "]";
		}

		return "Pernament Employee [ID: " + id + ", Name " + name + ", Number of Holidays: " + numHolidays
				+ ", Hourly Rate: " + hourlyRate + ", Working Hours: " + normalNumOfHours + ", Salary: "
				+ calculateSalary() + "]";
	}
}