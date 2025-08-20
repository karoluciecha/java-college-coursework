package account;

public class StudentCurrentAccount extends CurrentAccount implements StudentStateSubsidy {

	int studentYear;
	public StudentCurrentAccount(int accountNumber, String accountName) {
		super(accountNumber, accountName);
		// TODO Auto-generated constructor stub
	}

	public StudentCurrentAccount(int theNumber, String theName, float theBalance, 
			float theOverDraft,int theYear) {
		super(theNumber, theName, theBalance, theOverDraft);// calls CurrentAccount constructor
		studentYear=theYear;
	}

	public StudentCurrentAccount(BankAccount anAccount) {
		super(anAccount);
		// TODO Auto-generated constructor stub
	}

	public StudentCurrentAccount() {
		// TODO Auto-generated constructor stub
	}
void setStudentYear(int theYear) {
	studentYear=theYear;
}
@Override
public void displayBalance() {
		super.displayBalance();
		System.out.println("Student Year is "+studentYear);
}

@Override // Interface method
public void addStudentStateSubsidy(float studentSubsidy) {
	accountBalance = accountBalance + STUDENT_STATE_SUBSIDY;
}
}