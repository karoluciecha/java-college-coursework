// Karol Uciecha - G00436758 - 18/12/2023

import javax.swing.JOptionPane;
import java.util.Random;

public class KarolUciechaQuestion2 {
    public static void main(String[] args) {
		Random rnd = new Random();
		int qA = rnd.nextInt(5), qB;
		do {
			qB = qA;
			String[] quotes = {"Be yourself; everyone else is already taken.", "I have not failed. I've just found 10,000 ways that won't work.", "Know thyself.", "Dare to be different.", "Jump at the sun."};
			qA = rnd.nextInt(5);

			// Making sure quotes are different
			do {
				if (qA == qB) qA = rnd.nextInt(5);
				else break;
			} while (true);

			JOptionPane.showMessageDialog(null, quotes[qA], "Quote of the Day", JOptionPane.INFORMATION_MESSAGE);
			if(JOptionPane.showConfirmDialog(null, "Would you like to see another quote?", "Continue?", JOptionPane.YES_NO_OPTION) == 1) break;
		} while (true);
    }
}