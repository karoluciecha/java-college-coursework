package thisKeyword;

public class Point {
	int x, y, z;

	// 1. Local variable is the same as class variable
	Point(int x) {
		this.x = x; // Current memory location
	}

	// Call one constructor from another using this keyword
	// Always first line of code - only use once - cannot use in method

	public Point(int x, int y) {
		this(x); // Calls the previous constructor
		this.y = y;
	}

	public Point(int x, int y, int z) {
		this(x, y);
		this.z = z;
	}

	void setPoint(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	void display() {
		System.out.println("x is: " + x + " y is: " + y + " z is: " + z);
	}
}