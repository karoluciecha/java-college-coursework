package labA;
import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		swimmingPool p1 = new swimmingPool(10, 5, 3);
		swimmingPool p2 = new swimmingPool();
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Pool data:\n  Length: ");
		p2.setLength(console.nextDouble());
		System.out.printf("  Width: ");
		p2.setWidth(console.nextDouble());
		System.out.printf("  Depth: ");
		p2.setDepth(console.nextDouble());
		console.close();
		System.out.printf("  Total pool capacity (constructor): %.2f\n  Total pool capacity (user input): %.2f\n", p1.calculate(), p2.calculate());
	}
}