package exams;

import account.BankAccount;
public final class OffShoreAccount extends BankAccount {
	String country;

	public OffShoreAccount(int theNumber, String theName) {
		super(theNumber, theName);
		// TODO Auto-generated constructor stub
	}

	public OffShoreAccount(int theNumber, String theName, float theBalance, String country) {
		super(theNumber, theName, theBalance);
		this.country = country;
	}

	public OffShoreAccount(BankAccount anAccount) {
		super(anAccount);
		// TODO Auto-generated constructor stub
	}

	@Override // These methods are final as they are in a final class - can't override
//	Can't extend a final class
	public void displayBalance() {
		super.displayBalance();
		System.out.println("Country is " + country);
	}
}