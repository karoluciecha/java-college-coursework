package revision;

public class TestConstructor {
	
int x, y, z, k;

public TestConstructor(int x) {
	this.x = x;
}

TestConstructor (int x, int y) {
	this(x); // calls previous constructor. always 1st line of code. not to be repeated
	this.y = y;
}

// Overloading constructor
TestConstructor(int x, int y, int z) {
	this(x, y);
	this.z = z;
}

//	External default constructor
public TestConstructor() {
	x = 99;
}

	public static void main(String[] args) {
		
//		Must create external default constructor
		TestConstructor test = new TestConstructor(); // implicit default constructor
	}

}
