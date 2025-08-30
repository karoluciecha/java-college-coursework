package account;

public class BankAccount extends Account implements StateSubsidy {
	// attributes
	float accountBalance; // class variable
	static float euroConversionRate; // One piece of storage changes for every object
	// overloaded constructors

	protected BankAccount(int theNumber, String theName) {
		// = right to left associativity
		accountNumber = theNumber;
		accountName = theName;
	}

	// local variables - grey
	protected BankAccount(int theNumber, String theName, float theBalance) {
		accountNumber = theNumber;
		accountName = theName;
		accountBalance = theBalance;
	}

	// copy constructor
	public BankAccount(BankAccount anAccount) {
		accountNumber = anAccount.accountNumber;
		accountName = anAccount.accountName;
		accountBalance = anAccount.accountBalance;
	}

	// explicit (default) constructor
	BankAccount() {
		accountNumber = 999;
		accountName = "starter";
		accountBalance = 0;
	}

	// methods
	@Override // Java 5 annotation - di- ctrl + space
	// same signature as abstract method
	public void display() {
		System.out.println("Account number is " + accountNumber);
		System.out.println("Account name is " + accountName);
	}

	public void displayBalance() {
		display(); // calls previous display() method
		System.out.println("Account balance is " + accountBalance);
		System.out.println("Euro conversion rate is " + euroConversionRate);
	}

	static void setEuroConversionRate(float newRate) {
		euroConversionRate = newRate;
	}

	// Overloaded method
	public void makeWithDrawal(float withdrawal) {
		accountBalance = accountBalance - withdrawal;
	}

	// Access modifier and return type don't matter
	void makeWithDrawal(int currencyType, float withdrawal) {
		float convertedWithdrawal;
		switch (currencyType) {
		case 0: // Euros
			convertedWithdrawal = withdrawal;
			break;
		case 1: // Sterling
			convertedWithdrawal = euroConversionRate * withdrawal;
			break;
		default:
			System.out.println("Incorrect currency type - enter 0 or 1");
			return;
		}
		accountBalance = accountBalance - convertedWithdrawal;
	}

	public void makeLodgement(float lodgement) {
		accountBalance = accountBalance + lodgement;
	}

	@Override // Object class method
	public boolean equals(Object obj) {
		// Cast to BankAccount object
		BankAccount other = (BankAccount) obj;
		if ((other.accountBalance == accountBalance) && (other.accountName == accountName)
				&& (other.accountNumber == accountNumber))
			return true;
		else
			return false;
	}

	@Override // Interface method
	public void addStateSubsidy(float subsidy) {
		accountBalance = accountBalance + STATE_SUBSIDY;
	}

//	Can redefine the static Interface method in the class
	static void displaySubsidy() {
		System.out.println("The Government State subsidy for this bank account is " + STATE_SUBSIDY);
	}
}