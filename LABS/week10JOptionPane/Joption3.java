// Karol - G00436758

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Joption3 {
    public static void main(String[] args) {
        String name;
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        name = console.next();
        JOptionPane.showMessageDialog(null, "Hello " + name + "\n\n\nWelceome to the program!");
        console.close();
    }
}