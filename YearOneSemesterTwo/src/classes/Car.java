package classes;

public class Car {
	private int yearModel;
	private String make;
	private int speed;
	
	public void setYear(int y) {
		yearModel = y;
	}
	public void setMake(String M) {
		make = M;
	}
	public void setSpeed(int y) {
		yearModel = speed;
	}
	
	public int getYear() {
		return yearModel;
	}
	public String getMake() {
		return make;
	}
	public double getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		speed += 5;
	}
	public void brake() {
		if (speed >= 5)speed -= 5;
		else if (speed > 0) speed = 0;
	}
}