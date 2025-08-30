package exams;

// Question 3a, 3b
public abstract class FelineKeeper extends AnimalKeeper {
	private int numHolidays;
	
	public FelineKeeper(int id, String name, double hourlyRate, int numHolidays) {
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

}
