package constructors;

public class SwimmingPool {
	private double length;
	private double width;
	private double depth;
	
	public SwimmingPool(double length, double width, double depth) {
		this.length = length;
		this.width = width;
		this.depth = depth;
	}
	public SwimmingPool() {
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth (double width) {
		this.width = width;
	}
	public void setDepth (double depth) {
		this.depth = depth;
	}
	public double calculate() {
		return length * width * depth;
	}
}