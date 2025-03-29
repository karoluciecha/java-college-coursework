// Karol - G00436758 - 12/11/2023

import java.util.Random;

public class KarolUciechaQuestion3 {
    public static void main(String[] args) {
		String[] nameList = {"Gary", "Helen", "Ian", "Jane", "Kevin", "Dave", "Mary", "Noel", "Bob", "Alice"};
		Random rnd = new Random();
		int num1 = rnd.nextInt(11), num2 = 0, num3 = 0;
		do {
			num2 = rnd.nextInt(11);
		} while (num1 == num2);
		do {
			num3 = rnd.nextInt(11);
		} while ((num1 == num3) || (num2 == num3));
		System.out.printf("This program will select 3 random names from the following:\n");
		for (int i = 0; i < (nameList.length - 1); ++i) {
			System.out.printf("%s, ", nameList[i]);
		}
		System.out.printf("%s\n\nFirst random name is: %s\nSecond random name is: %s\nThird random name is: %s\n", nameList[nameList.length - 1], nameList[num1], nameList[num2], nameList[num3]);
    }
}