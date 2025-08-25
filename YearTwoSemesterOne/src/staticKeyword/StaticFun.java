package staticKeyword;

class StaticTest {
	static int i = 47; // italic for static
}

public class StaticFun {
	// static method uses static variable - not tied to any object
	static int incr() {
		return ++StaticTest.i;
	}
}