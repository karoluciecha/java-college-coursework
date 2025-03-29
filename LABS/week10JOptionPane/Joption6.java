// Karol - G00436758

import javax.swing.JOptionPane;

public class Joption6 {
    public static void main(String[] args) {
        String username, password;
        username = JOptionPane.showInputDialog(null, "Enter a username:");
        password = JOptionPane.showInputDialog(null, "Enter a password:");

        if (username.equalsIgnoreCase("bob") && password.equals("pass")) {
            JOptionPane.showMessageDialog(null, "Welcome " + username + " - User level access granted!");
        } else if (username.equalsIgnoreCase("admin") && password.equals("super")) {
            JOptionPane.showMessageDialog(null, "Welcome " + username + " - Admin level access granted!");
        } else {
            JOptionPane.showMessageDialog(null, "Access is denied!");
        }
    }
}