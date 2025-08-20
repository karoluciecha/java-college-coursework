package account;
//composition at work - specialized class for Loans
public class Loan {
	int newLoan;
//methods
	void setLoanAmount(int theLoan) {
		newLoan=theLoan;
	}
	int getLoan() {
		return newLoan;
	}
	void displayLoan() {
		System.out.println("Loan on account is "+ newLoan);
	}
}// end class
