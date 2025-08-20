package account;

public interface StateSubsidy {
//	All variables are public static (italic) and final (caps lock & underscore)
//	Don't need to use these keywords
	float STATE_SUBSIDY = 100;
	float TAX_RATE = .1f;
	float TAXED_SUBSIDY_DEDUCTION = STATE_SUBSIDY - (TAX_RATE * STATE_SUBSIDY);
//	Method public and abstract - no need to add these keywords
	void addStateSubsidy (float subsidy);
	
//	Java 8 added default / defender methods so that you don't have to change legacy code that implements an interface you want to update.
//	You can override this method in class implementing the interface
	default void displayTaxedSubsidy() {
		System.out.println("Taxed subsidy is: " + TAXED_SUBSIDY_DEDUCTION);
	}
	
//  Java 8 - can now add in a static method(s) that are only specific to Interface
//  You can redefine this method in a class implementing Interface
	static void displaySubsidy() {
		System.out.println("The Government State subsidy is " + STATE_SUBSIDY);
	}
}