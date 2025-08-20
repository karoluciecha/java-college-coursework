package equivalence;

class Letter {
	char c;
}

public class PassObject {
// Method takes in an object
	static void f(Letter y) {
		y.c = 'z';
	}

}