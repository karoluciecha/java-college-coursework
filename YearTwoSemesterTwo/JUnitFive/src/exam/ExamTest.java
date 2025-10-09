package exam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExamTest {

    // Test the calculateBMI() method of ExamClass
    @Test
    public void testCalculateBMI() {
        ExamClass testBMI = new ExamClass("Joe", "Smith", "1234567A", 40, 1.8f, 75f, 70f, 100f);
        float expected = 75f / (1.8f * 1.8f);
        float actual = testBMI.calculateBMI();
        assertEquals(expected, actual, 0.0);
    }

    // Test the weightLossRequired() method when no weight loss needed
    @Test
    public void testWeightLossRequired() {
        ExamClass testWLR = new ExamClass("Joe", "Smith", "1234567A", 40, 1.8f, 75f, 70f, 100f);
        float expected = 0;
        float actual = testWLR.weightLossRequired();
        assertEquals(expected, actual, 0.0);
    }

    // Test the updateWeightHeight() method to update patient's weight and height
    @Test
    public void testUpdateWeightHeight() {
        ExamClass testUWH = new ExamClass("Joe", "Smith", "1234567A", 40, 1.8f, 75f, 70f, 100f);
        float weight = 70f;
        float height = 1.85f;
        testUWH.updateWeightHeight(height, weight);
        assertEquals(weight, testUWH.getWeight(), 0.0);
        assertEquals(height, testUWH.getHeight(), 0.0);
    }

    // Test the bloodPressureReview() method for normal blood pressure
    @Test
    public void testBloodPressureReview() {
        ExamClass testBPR = new ExamClass("Joe", "Smith", "1234567A", 40, 1.8f, 75f, 70f, 100f);
        String expected = "Normal Blood Pressure";
        String actual = testBPR.bloodPressureReview();
        assertEquals(expected, actual);
    }
}
