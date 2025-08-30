package exams;

// Question 2a
public final class ElephantKeeper extends AnimalKeeper {
	private int numHolidays;

//	Question 2b
	public ElephantKeeper(int id, String name, double hourlyRate, int numHolidays) {
		super(id, name, hourlyRate);
		this.setNumHolidays(numHolidays);
	}

//	Question 2c
	@Override
	void display() {
		System.out.println("Elephant Keeper Details:");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Hourly Rate: " + getHourlyRate());
		System.out.println("Holidays: " + getNumHolidays());
	}

	public int getNumHolidays() {
		return numHolidays;
	}

	public void setNumHolidays(int numHolidays) {
		this.numHolidays = numHolidays;
	}
}
