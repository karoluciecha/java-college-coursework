package exams;

// Question 4a
public final class TigerKeeper extends FelineKeeper {

//	Question 4b
	public TigerKeeper(int id, String name, double hourlyRate, int numHolidays) {
		super(id, name, hourlyRate, numHolidays);
	}
	
	@Override
	void display() {
		System.out.println("Tiger Keeper Details:");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Hourly Rate: " + getHourlyRate());
		System.out.println("Holidays: " + getNumHolidays());
	}
}
