package exams;

class Value {
	int i;

	// eq- ctrl + space - equals() Object class
	@Override
	public boolean equals(Object obj) {
		// Cast object to a Value object
		Value other = (Value) obj;
		if (other.i == i)
			return true;
		else
			return false;
	}
}

public class EqualsMethod {
}