package thisKeyword;

public class Person {
	String firstName, lastName;

	@Override // to - cntrl space
	public String toString() {
		// TODO Auto-generated method stub
		return (firstName + " " + lastName);
	}

	// so we can use cascaded method call- returns a Person object
	public Person setFirstName(String first) {
		firstName = first;
		return this;
	}

	public Person setLastName(String last) {
		lastName = last;
		return this;
	}
}