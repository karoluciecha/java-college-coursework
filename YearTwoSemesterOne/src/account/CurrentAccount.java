package account;

public class CurrentAccount extends BankAccount {
protected float overDraftLimit;
	
	public CurrentAccount(int accountNumber, String accountName) {
		super(accountNumber, accountName);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int theNumber, String theName, float theBalance,float theOverDraft) {
		super(theNumber, theName, theBalance);// Java creates this aspect - calls Parent constructor
		overDraftLimit=theOverDraft;
	}

	public CurrentAccount(BankAccount anAccount) {
		super(anAccount);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	//method new functionality for this CHILD class
void setOverDraftLimit(float theOverDraft) {
	overDraftLimit=theOverDraft;
}
@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		super.displayBalance();//calls BankAccount method
		System.out.println("OverDraft is "+overDraftLimit);
	}
}