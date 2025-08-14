package statics;

public class Person {
	private String firstName;
	private String lastName;
	private static int instanceCount = 0;
	
	public Person(String fName, String lName) {
		setFirstName(fName);
		setLastName(lName);
		instanceCount++;
	}
	public int getInstanceCount() {
		return instanceCount;
	}
	public static int count() {
		return instanceCount;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
