// Karol G00436758
import java.util.Scanner;
public class PersonalDetailsFormatter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fname, sname;
        int age = -1;
        int choice = 0;
        do {
            System.out.printf("Enter your first name: ");
            fname = console.nextLine();
        } while (fname.equals(""));
        do {
            System.out.printf("Enter your surname: ");
            sname = console.nextLine();
        } while (sname.equals(""));
        do {
            System.out.printf("Enter your age: ");
            age = console.nextInt();
        } while (age < 0);

        do {
            System.out.printf("Choose a formatting option:\n1: Display each detail on a new line\n2: Display all details on a single line separated by comas\n3: Display full name on one line and age on the next\n4: Display surname in uppercase\n5: Right-align age with the last character of surname\n6: Display all text in uppercase\n7: Display all text aligned to the left\nEnter your choice: ");
            choice = console.nextInt();
        } while ((choice < 1) || (choice > 7));

        switch (choice) {
            case 1:
                    System.out.printf("Name: %s\nSurname: %s\nAge: %d\n\n", fname, sname, age);
                    break;
            case 2:
                System.out.printf("Name: %s, surname: %s, age: %d.\n\n", fname, sname, age);
                break;
            case 3:
                System.out.printf("Full name: %s %s\nAge: %d\n\n", fname, sname, age);
                break;
            case 4:
                System.out.printf("SURNAME: %s\n\n", sname.toUpperCase());
                break;
            case 5:
                System.out.printf("%20s\n%20s\n%20d\n\n", fname, sname, age);
                break;
            case 6:
                System.out.printf("%s %s, %d\n\n", fname.toUpperCase(), sname.toUpperCase(), age);
                break;
            case 7:
                System.out.printf("%-1s\n%-1s\n%-1d\n\n", fname, sname, age);
                break;
        }
        console.close();
    }
}