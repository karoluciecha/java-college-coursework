package exams;

//Question 3a, 3b
public abstract class CanineKeeper extends AnimalKeeper {
	private int numHolidays;

	public CanineKeeper(int id, String name, double hourlyRate, int numHolidays) {
		super(id, name, hourlyRate);
		this.setNumHolidays(numHolidays);
	}

	@Override
	void display() {
		// TODO Auto-generated method stub

	}

	public int getNumHolidays() {
		return numHolidays;
	}

	public void setNumHolidays(int numHolidays) {
		this.numHolidays = numHolidays;
	}

	@Override
	public String toString() {
		return "Canine Keeper " + "ID: " + getId() + "Name: " + getName() + "Hourly Rate: " + getHourlyRate()
				+ "Holidays: " + getNumHolidays();
	}
}