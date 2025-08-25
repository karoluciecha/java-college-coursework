package finalKeyword;

class Value {
	int i = 1;
}

public class FinalData {
	final int i1 = 9;// has to be constant
	static final int VAL_TWO = 99; // static and final syntax - caps lock and underscores
	static final int VAL_THREE = 39;// need to set a constant
	final int i4 = (int) (Math.random() * 20);
	static final int i5 = (int) (Math.random() * 20);
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();// italic - static

	void print(String id) {
		System.out.println(id + "i4 is " + i4 + " i5 is " + i5);
	}
}