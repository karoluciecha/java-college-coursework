package main;
public class ClassThree {

	public float a;
	public float b;

	public ClassThree(float num1, float num2) {
		a = num1;
		b = num2;
	}

	public float divide() {
		if (b == 0) {
			throw new IllegalArgumentException("Divide by Zero error");
		} else {
			return a / b;
		}
	}

	public float square_root() {
		if (a < 0) {
			throw new IllegalArgumentException("Square Root of negative num not possible");
		} else {
			return (float) Math.sqrt(a);
		}
	}
}