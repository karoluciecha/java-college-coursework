import java.io.*;

import javax.swing.JOptionPane;


public class lecture {
    public static void main(String[] args) throws IOException {
        boolean append = true;
        int choice = JOptionPane.showConfirmDialog(null, "Append (yes)?", "Conformation", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            append = true;
        } else {
            append = false;
        }
        String text = "This is a line of text from a string";
        String file = "output.txt";

        FileWriter fWriter = new FileWriter(file, append);
        PrintWriter pWriter = new PrintWriter(fWriter);

        


        pWriter.println(text);

        pWriter.close();
    }
    
}