package exams;

// Question 9a
public interface UnionMember {

	public static final double UNION_FEE = 400;
	public static final double DISCOUNT_FACTOR = .5;
	public static double shareValue = 500;

	void calculateFee();

	static void setShareValue(double shareValue) {
	}
}