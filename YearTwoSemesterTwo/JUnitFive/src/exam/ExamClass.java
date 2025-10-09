package exam;

public class ExamClass {

	private String firstName;
	private String surName;
	private String ppsNumber;
	private int age;
	private float height;
	private float weight;
	private float diastolic;
	private float systolic;

	public ExamClass(String firstName, String surName, String ppsNumber, int age, float height, float weight,
			float diastolicBloodPressure, float systolicBloodPressure) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.ppsNumber = ppsNumber;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.diastolic = diastolicBloodPressure;
		this.systolic = systolicBloodPressure;
	}

	public float calculateBMI() {
		float result = weight / (height * height);

		return result;
	}

	public float weightLossRequired() {
		float requiredWeight = height * height * 25.0f;

		if (weight - requiredWeight > 0)
			return (weight - requiredWeight);
		else
			return 0;
	}

	public void updateWeightHeight(float newHeight, float newWeight) {
		weight = newWeight;
		height = newHeight;
	}

	public String bloodPressureReview() {
		if (systolic < 90 && diastolic < 60) {
			return "Low Blood Pressure";
		} else if (systolic >= 90 && systolic <= 120 && diastolic >= 60 && diastolic <= 80) {
			return "Normal Blood Pressure";
		} else {
			return "Go to the Doctor";
		}
	}

	// Returns height
	public float getHeight() {
		return height;
	}

	// Returns weight
	public float getWeight() {
		return weight;
	}

}