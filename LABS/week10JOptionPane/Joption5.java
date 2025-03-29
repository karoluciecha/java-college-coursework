// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption5 {
    public static void main(String[] args) {
        String fname, sname, address;
        fname = JOptionPane.showInputDialog(null, "Enter your first name:");
        sname = JOptionPane.showInputDialog(null, "Enter your surname:");
        address = JOptionPane.showInputDialog(null, "Enter your address:");
        JOptionPane.showMessageDialog(null, "Frst name: " + fname + "\nSurname: " + sname + "\n********************\nAddress: " + address);
    }
}