package exams;

// Question 1a
public abstract class AnimalKeeper {
	private int id;
	private String name;
	private double hourlyRate;

	public AnimalKeeper(int id, String name, double hourlyRate) {
		this.setId(id);
		this.setName(name);
		this.setHourlyRate(hourlyRate);
	}

	// Question 1b
	abstract void display();

//	Question 1c
	public static final float EXAM_FEE = 50;

	static void displayExamFee() {
		System.out.println(EXAM_FEE);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Animal Keeper " + "ID: " + getId() + "Name: " + getName() + "Hourly Rate: " + getHourlyRate();
	}
}