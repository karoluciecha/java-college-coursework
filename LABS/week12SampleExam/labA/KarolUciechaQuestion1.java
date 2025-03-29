// Karol - G00436758 - 12/11/2023

import javax.swing.JOptionPane;
import java.util.Random;

public class KarolUciechaQuestion1 {
    public static void main(String[] args) {
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Random rnd = new Random();
        int day = rnd.nextInt(28) + 1, month = rnd.nextInt(12), year = 2023;
        JOptionPane.showMessageDialog(null, day + " " + monthName[month] + " " + year + "\n");
    }
}