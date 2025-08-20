package account;

// Extending an Interface
public interface StudentStateSubsidy extends StateSubsidy {
//	All variables are public, static, and final, so redundant to add these in
	float STUDENT_STATE_SUBSIDY = 1000;
//	Method abstract and public
	void addStudentStateSubsidy(float studentSubsidy);
}