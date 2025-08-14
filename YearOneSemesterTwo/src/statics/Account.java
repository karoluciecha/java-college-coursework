package statics;

public class Account {
	private String firstName;
	private String lastName;
	private double deposit;
	private static double vault;
	
	public Account(String fName, String lName, double deposit) {
		setFirstName(fName);
		setLastName(lName);
		this.setDeposit(deposit);
		vault += deposit;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public static double getVault() {
		return vault;
	}
}