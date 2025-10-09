package exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class ExamTestParameterized {
	private String firstName;
	private String surName;
	private String ppsNumber;
	private int age;
	private float height;
	private float weight;
	private float diastolic;
	private float systolic;
	private float expectedBMI;
	private float expectedWLR;
	private float newHeight;
	private float expectedUpdatedHeight;
	private float newWeight;
	private float expectedUpdatedWeight;
	private String expectedBPR;
	private ExamClass patient;

	private static Stream<Object[]> data() {
		return Stream.of(
				new Object[] { "Joe", "Smith", "1234567A", 40, 1.8f, 75f, 70f, 100f, 23.14f, 0f, 1.5f, 1.5f, 65f, 65f,
						"Normal Blood Pressure" },
				new Object[] { "Mary", "Byrne", "7654321A", 30, 1.5f, 60f, 50f, 80f, 26.6f, 3.7f, 1.65f, 1.65f, 85f,
						85f, "Low Blood Pressure" },
				new Object[] { "Liam", "Shea", "1111111A", 20, 2.0f, 100f, 90f, 130f, 25f, 0f, 2.2f, 2.2f, 100f, 100f,
						"Go to the Doctor" });
	}

	@BeforeEach
	public void setUp() throws Exception {
		patient = new ExamClass(firstName, surName, ppsNumber, age, height, weight, diastolic, systolic);
	}

	@ParameterizedTest
	@MethodSource("data")
	public void testCalculateBMI(String firstName, String surName, String ppsNumber, int age, float height,
			float weight, float diastolic, float systolic, float expectedBMI, float expectedWLR, float newHeight,
			float expectedUpdatedHeight, float newWeight, float expectedUpdatedWeight, String expectedBPR) {
		patient = new ExamClass(firstName, surName, ppsNumber, age, height, weight, diastolic, systolic);
		float actual = patient.calculateBMI();
		assertEquals(expectedBMI, actual, 0.5);
	}

	@ParameterizedTest
	@MethodSource("data")
	public void testWeightLossRequired(String firstName, String surName, String ppsNumber, int age, float height,
			float weight, float diastolic, float systolic, float expectedBMI, float expectedWLR, float newHeight,
			float expectedUpdatedHeight, float newWeight, float expectedUpdatedWeight, String expectedBPR) {
		patient = new ExamClass(firstName, surName, ppsNumber, age, height, weight, diastolic, systolic);
		float actual = patient.weightLossRequired();
		assertEquals(expectedWLR, actual, 0.5);
	}

	@ParameterizedTest
	@MethodSource("data")
	public void testUpdateWeightHeight(String firstName, String surName, String ppsNumber, int age, float height,
			float weight, float diastolic, float systolic, float expectedBMI, float expectedWLR, float newHeight,
			float expectedUpdatedHeight, float newWeight, float expectedUpdatedWeight, String expectedBPR) {
		patient = new ExamClass(firstName, surName, ppsNumber, age, height, weight, diastolic, systolic);
		patient.updateWeightHeight(newHeight, newWeight);
		assertEquals(expectedUpdatedWeight, patient.getWeight(), 0.0);
		assertEquals(expectedUpdatedHeight, patient.getHeight(), 0.0);
	}

	@ParameterizedTest
	@MethodSource("data")
	public void testBloodPressureReview(String firstName, String surName, String ppsNumber, int age, float height,
			float weight, float diastolic, float systolic, float expectedBMI, float expectedWLR, float newHeight,
			float expectedUpdatedHeight, float newWeight, float expectedUpdatedWeight, String expectedBPR) {
		patient = new ExamClass(firstName, surName, ppsNumber, age, height, weight, diastolic, systolic);
		String actual = patient.bloodPressureReview();
		assertEquals(expectedBPR, actual);
	}
}