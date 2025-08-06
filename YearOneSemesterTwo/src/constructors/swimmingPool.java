package labA;

public class swimmingPool {
	private double length;
	private double width;
	private double depth;
	
	public swimmingPool(double length, double width, double depth) {
		this.length = length;
		this.width = width;
		this.depth = depth;
	}
	public swimmingPool() {
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