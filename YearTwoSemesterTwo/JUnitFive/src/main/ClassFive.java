package main;

public class ClassFive {
	// Class Attribute to hold a/c balance and number
	private double balance;
	private int accNumber;
	private int interest;

	// Constructor to create an account and initialize attributes of a new object
	public ClassFive(double intialbalance, int intialAccNumber, int interest) {
		balance = intialbalance;
		accNumber = intialAccNumber;
		this.interest = interest;
	}

	// Public method which adds the amount passed to the balance
	// Returns new balance
	public double makeLodgement(float amount) {
		balance = balance + amount;
		return balance;
	}

	// Public method which adds the amount passed to the balance
	// Returns new balance
	public double makeWithdrawal(float amount) {
		balance = balance - amount;
		return balance;

	}

	// Public method which returns the balance
	// Returns new balance
	public double getBalance() {
		return balance;
	}

	public void addInterest() {
		balance = balance + balance * (interest / 100.0);
	}
}