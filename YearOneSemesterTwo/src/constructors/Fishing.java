package constructors;

public class Fishing {
	private char cont;
	private int dice;
	private String itemName;
	private int points;
	
	public void setCont(char cont) {
		this.cont = Character.toLowerCase(cont);
	}
	public void setDice(int dice) {
		this.dice = dice;
	}
	public char getCont() {
		return this.cont;
	}
	public String getItemName() {
		return itemName;
	}
	public void calculate() {
		switch(this.dice) {
			case 1:
				itemName = "an old boot";
				points += 0;
				break;
			case 2:
				itemName = "a huge fish";
				points += 100;
				break;
			case 3:
				itemName = "a leaf";
				points += 1;
				break;
			case 4:
				itemName = "a little fish";
				points += 10;
				break;
			case 5:
				itemName = "a rock";
				points += 2;
				break;
			case 6:
				itemName = "weeds";
				points += 0;
				break;
		}
	}
	public String gameEnds() {
		String out;
		if (this.points > 99) {
			out = "You got a total of " + this.points + " fishing points.\nGreat job! You are a natural!\n";
		}
		else if (this.points > 49) {
			out = "You got a total of " + this.points + " fishing points.\nThat's some pretty fine fishing.\n";
		}
		else {
			out = "You got a total of " + this.points + " fishing points.\nThe fish just aren't biting today. Maybe next time.\n";
		}
		return out;
	}
}