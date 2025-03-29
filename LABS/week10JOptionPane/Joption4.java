// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption4 {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog(null, "Enter Your Name:");
        JOptionPane.showMessageDialog(null, "Hello " + name + "\n\nThis was created using swing!\n\n");
    }
}