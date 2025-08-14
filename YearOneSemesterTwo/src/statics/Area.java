package statics;

public class Area {
	final static double PI = 3.14159265;
	public static double circle (double r) {
		return PI * Math.pow(r, 2);
	}
	public static double rectangle (double w, double l) {
		return w * l;
	}
	public static double cylinder (double r, double h) {
		return PI * Math.pow(r, 2) * h;
	}
}
