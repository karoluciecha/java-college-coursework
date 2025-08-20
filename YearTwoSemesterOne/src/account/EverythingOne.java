package account;

import java.util.Scanner;

public class EverythingOne extends BankAccount implements StudentStateSubsidy {

	private static void exerciseOne() {
		BankAccount karolAccount = new BankAccount(688, "karol");
		karolAccount.display();
		BankAccount dawidAccount = new BankAccount(886, "dawid", 10524.99f);
		dawidAccount.displayBalance();
		BankAccount dawidCopyAccount = new BankAccount(dawidAccount);
		dawidCopyAccount.displayBalance(); // once off in memory
		dawidAccount.makeLodgement(333.99f);
		dawidAccount.displayBalance();
		dawidCopyAccount.displayBalance();
		BankAccount starterAccount = new BankAccount(); // explicit constructor
		starterAccount.displayBalance();
		BankAccount adaAccount = new BankAccount(555, "ada");
		adaAccount.display();
		System.out.println("Aliasing at work");
		adaAccount = karolAccount;
		adaAccount.display();
		BankAccount dariuszAccount = new BankAccount(454, "joint", 100f);
		BankAccount justynaAccount = new BankAccount(454, "joint", 100f);
		System.out.println("Relational operators at work");
		System.out.println(dariuszAccount == justynaAccount);
		System.out.println("equals() method at work");
		System.out.println(dariuszAccount.equals(justynaAccount));
		BankAccount.setEuroConversionRate(5f); // Use class name
		dariuszAccount.displayBalance();
		setEuroConversionRate(8f);
		justynaAccount.displayBalance();
		dariuszAccount.makeWithDrawal(1, 60f);
		justynaAccount.makeWithDrawal(5, 50f);
		dariuszAccount.displayBalance();
		justynaAccount.displayBalance();
		System.out.println("Interface at work");
		karolAccount.addStateSubsidy(STATE_SUBSIDY);
		karolAccount.displayTaxedSubsidy(); // Default (new) method
		BankAccount.displaySubsidy(); // Class static method
		StateSubsidy.displaySubsidy(); // Interface static method
		StateSubsidy test = new BankAccount();
	}

	private static void exerciseTwo() {
		CurrentAccount currAcc = new CurrentAccount(888, "currAcc", 100f, 200f);
		BankAccount bankAcc = new BankAccount(444, "bankacc", 90f);
		bankAcc.displayBalance();
		currAcc.displayBalance();
		bankAcc = currAcc;// currAcc more functionality than bankAcc so can overwrite
		// currAcc=bankAcc; cannot overwrite currAcc with bankAcc
		// polymorphically
		BankAccount x = new CurrentAccount();
		CurrentAccount y = new CurrentAccount();
		BankAccount polyacc = new CurrentAccount(7, "polyacc", 90f, 89f);
		polyacc.displayBalance();
		y.displayBalance();
	}

	private static void exerciseThree() {
		OffShoreAccount anonacc = new OffShoreAccount(989, "anon", 9000000, "spain");
		anonacc.displayBalance();
	}

	private static void exerciseFour() {
		StudentCurrentAccount studAcc = new StudentCurrentAccount(767, "studAcc", 90f, 90f, 2027);
		CurrentAccount curac = new CurrentAccount(88, "currAcc", 89f, 100f);
		curac = studAcc;
		// studAcc=curac;//not allowed - curac is not a studAcc
		studAcc.setStudentYear(2026);
		studAcc.displayBalance();
		studAcc.addStudentStateSubsidy(STUDENT_STATE_SUBSIDY);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== BankAccount =====");
		exerciseOne();

		System.out.println("\n===== CurrentAccount =====");
		exerciseTwo();

		System.out.println("\n===== OffShoreAccount =====");
		exerciseThree();

		System.out.println("\n===== StudentCurrentAccount =====");
		exerciseFour();

		scanner.close();
	}

	@Override
	public void addStudentStateSubsidy(float studentSubsidy) {
		accountBalance = accountBalance + STUDENT_STATE_SUBSIDY;
	}
}