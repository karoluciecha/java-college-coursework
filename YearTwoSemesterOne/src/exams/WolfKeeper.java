package exams;

// Question 5a
public final class WolfKeeper extends CanineKeeper implements ZoologyDegree {

	public WolfKeeper(int id, String name, double hourlyRate, int numHolidays) {
		super(id, name, hourlyRate, numHolidays);
	}

//	Question 5b
	@Override
	public String toString() {
		return "Wolf Keeper " + "\nID: " + getId() + "\nName: " + getName() + "\nHourly Rate: " + getHourlyRate()
				+ "\nHolidays: " + getNumHolidays();
	}

//	Question 5c
	public void displayManual() {
		System.out.println("Wolf Keeper Display Manual");
	}

	public void displayManual(int id) {
		displayManual();
		System.out.println("\nID: " + id);
	}

	public void displayManual(String name) {
		displayManual();
		System.out.println("\nName: " + name);
	}

	public void displayManual(int id, String name) {
		displayManual(id);
		System.out.println("\nName: " + name);
	}

	public void displayManual(int id, String name, double hourlyRate) {
		displayManual(id, name);
		System.out.println("\nHourly Rate: " + hourlyRate);
	}

	public void displayManual(int id, String name, double hourlyRate, int numHolidays) {
		displayManual(id, name, hourlyRate);
		System.out.println("\nHolidays: " + numHolidays);
	}

	@Override
	void display() {
		System.out.println("Wolf Keeper Details:");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Hourly Rate: " + getHourlyRate());
		System.out.println("Holidays: " + getNumHolidays());
	}

//	Question 5d
	private static int bonus = 500;

	public static void displayBonus() {
		System.out.println("The bonus is: " + bonus);
	}

//	Question 6a
	@Override
	public void payRegistrationFee() {
		System.out.println("(pay) Registration fee for " + getName() + " is: "
				+ (ZoologyDegree.DISCOUNT_FACTOR * ZoologyDegree.EXAM_FEE));
	}

//	Question 6c
	@Override
	public void displayRegistrationFee() {
		System.out.println("(display) Registration fee for " + getName() + " is: "
				+ (ZoologyDegree.DISCOUNT_FACTOR * ZoologyDegree.EXAM_FEE));
	}
}