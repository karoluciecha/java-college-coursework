package exams;

import exercise.ExamStudent;
import exercise.Person;

public class Student extends Person {
	protected String middleName;

	public static int registrationFee = 2000;

	// 4. Constructors using this keyword
	public Student() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
	}

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student(String firstName, String lastName, String middleName) {
		this(firstName, lastName);
		this.middleName = middleName;
	}

	// 5. Cascading methods
	public Student setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Student setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	public Student setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// 6. Overriding equals() method to compare students (eq ctrl+space)
	@Override
	public boolean equals(Object obj) {
		Student otherStudent = (Student) obj;
		return this.firstName.equals(otherStudent.firstName) && this.lastName.equals(otherStudent.lastName);
	}

	// 7. Method to update the fee
	public static void setRegistrationFee(int updatedFee) {
		registrationFee = updatedFee;
	}

	// 8. Overriding toString() method to output values in the form firstName
	@Override
	public String toString() {
		return firstName + ", " + (middleName != null && !middleName.isEmpty() ? middleName + ", " : "") + lastName
				+ " and " + registrationFee;
	}
}