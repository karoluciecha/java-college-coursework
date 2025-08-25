package thisKeyword;

public class Leaf {
	int i;

// this method returns an Object reference using this
	Leaf increment() {
		// put in this line to see reference
		System.out.println(this);
		return this;
	}

	// method prints i
	void print() {
		System.out.println("i = " + i);
	}
}