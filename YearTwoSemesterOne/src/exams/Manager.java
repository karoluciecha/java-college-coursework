package exams;

// Question 8a
public class Manager extends Employee implements UnionMember { // Question 9b

	protected double numHolidays;
	protected double bonus;
	protected double discountedUnionFee;

//	Question 8b
	void setBonus(double bonus) {
		this.bonus = bonus;
	}

	void setBonus(double bonus, String message) {
		setBonus(bonus);
		System.out.println("Setting the bonus... " + message);
	}

//	Question 8c
	public Manager(int id, String name, double hourlyRate, double actualNumOfHours, double numHolidays) {
		super(id, name, hourlyRate, actualNumOfHours);
		this.numHolidays = numHolidays;
		bonus = 200;
	}

	public Manager(int id, String name, double hourlyRate, double numHolidays) {
		super(id, name, hourlyRate);
		this.numHolidays = numHolidays;
		bonus = 200;
	}

	@Override
	void display() {
		System.out.println("Manager: [ID: " + id + ", Name: " + name + ", Number of Holidays: " + numHolidays
				+ ", Hourly Rate: " + hourlyRate + ", Weekly Salary: " + calculateSalary() + "]");

	}

	@Override
	double calculateSalary() {
		if (actualNumOfHours > normalNumOfHours) {
			double overtime = actualNumOfHours - normalNumOfHours;
			return (hourlyRate * normalNumOfHours) + ((hourlyRate * 1.5) * overtime);
		}
		return hourlyRate * normalNumOfHours;
	}

//	Question 9c, 9d
	@Override
	public void calculateFee() {
		discountedUnionFee = UnionMember.DISCOUNT_FACTOR * UnionMember.UNION_FEE;
	}

//	Question 12b
	@Override
	public boolean equals(Object obj) {
		Manager other = (Manager) obj;
		return this.name.equals(other.name) && other.id == id && other.hourlyRate == hourlyRate
				&& other.actualNumOfHours == actualNumOfHours && other.numHolidays == numHolidays;
	}
}