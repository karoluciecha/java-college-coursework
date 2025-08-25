package exercise;

public class ExamStudent {
	private float gpaYear3, gpaYear4;
	
	// 12. 13. Overloading method
    public float calculateAverageGrade(float gpaYear3) {
        return gpaYear3 * 0.3f;
    }
    
    public float calculateAverageGrade(float gpaYear3, float gpaYear4) {
    	return gpaYear4 *0.7f + calculateAverageGrade(gpaYear3);
    }
    
    // 14. toString() returning gpaYear4
    @Override
    public String toString() {
    	return String.valueOf(gpaYear4);
    }
}
