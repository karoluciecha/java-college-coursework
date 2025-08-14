package constructors;

public class Die {
	private char cont;
	private int points;
	
	public Die(char cont) {
		this.cont = Character.toLowerCase(cont);
		this.points = 0;
	}
	public Die() {
		this.points = 0;
	}
	public void setCont(char cont) {
		this.cont = Character.toLowerCase(cont);
	}
	public void addPoints(int points) {
		this.points += points;
	}
	public char getCont() {
		return this.cont;
	}
	public int getPoints() {
		return points;
	}
}