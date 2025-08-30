package exams;

public interface ZoologyDegree {
	public static final int REGISTRATION_FEE = 3000;
	public static final float DISCOUNT_FACTOR = .2f;
	public static final float EXAM_FEE = 100f;
	
	
	void payRegistrationFee();
	
	default void displayRegistrationFee() {
		System.out.println("The registration fee is calculated with a discount factor.");
	}
	
//	Question 6d
	static void displayExamFee() {
		System.out.println("EXAM_FEE = " + EXAM_FEE);
	}

}
