package classes;

public class Square {
	private int length;
	
	public void setLength(int len) {
		length = len;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getArea() {
		return length * length;
	}
}