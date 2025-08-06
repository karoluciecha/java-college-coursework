package labA;
import java.util.Scanner;
import java.util.Random;

public class Exercise14 {
	public static void main(String[] args) {
		Fishing game = new Fishing();
		Scanner console = new Scanner(System.in);
		Random random = new Random();
		
		System.out.printf("Let's go fishing!\n");
		
		do {
			System.out.printf("\nYou cast your line into the water...\n");
			game.setDice(random.nextInt(6) + 1);
			game.calculate();
			System.out.printf("You caught [%s].\n", game.getItemName());
			System.out.printf("\nTry fishing again? (Y or N): ");
			game.setCont(console.next().charAt(0));
		} while(game.getCont() == 'y');
		System.out.printf("%s", game.gameEnds());
		console.close();
	}
}