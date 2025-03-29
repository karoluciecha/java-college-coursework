// Karol G00436758
import java.util.Scanner;
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String bname, aname, category;
        int year = -1;
        int choice1 = 0;
        do {
            System.out.printf("Enter the name of the book: ");
            bname = console.nextLine();
        } while (bname.equals(""));
        do {
            System.out.printf("Enter the autor's name: ");
            aname = console.nextLine();
        } while (aname.equals(""));
        do {
            System.out.printf("Enter the year the book was published: ");
            year = console.nextInt();
        } while (year < 0);
        console.nextLine();
        do {
            System.out.printf("Enter the category of the book: ");
            category = console.nextLine();
        } while (category.equals(""));

        do {
            System.out.printf("What would you like to do next?\n1: Display book information\n2: Display author's bibliography\nEnter your choice: ");
            choice1 = console.nextInt();
        } while ((choice1 < 1) || (choice1 > 2));

        switch (choice1) {
            case 1:
                choice1 = 0;
                do {
                    System.out.printf("How would you like the book information to be displayed?\n1: Display all information as is\n2: Display all information in uppercase\n3: Display all information, but with book title in uppercase\nEnter your choice: ");
                    choice1 = console.nextInt();
                } while ((choice1 < 1) || (choice1 > 3));
                switch (choice1) {
                    case 1:
                        System.out.printf("Book: %s\t | Author: %s\t | Year: %s\t | Category: %s\n\n", bname, aname, year, category);
                        break;
                    case 2:
                        System.out.printf("BOOK: %s\t | AUTHOR: %s\t | YEAR: %s\t | CATEGORY: %s\n\n", bname.toUpperCase(), aname.toUpperCase(), year, category.toUpperCase());
                        break;
                    case 3:
                        System.out.printf("Book: %s\t | Author: %s\t | Year: %s\t | Category: %s\n\n", bname.toUpperCase(), aname, year, category);
                        break;
                }
                break;
            case 2:
                choice1 = 0;
                do {
                    System.out.printf("How would you like the author's bibliography information to be displayed?\n1: Display all information as is\n2: Display all information in uppercase\nEnter your choice: ");
                    choice1 = console.nextInt();
                } while ((choice1 < 1) || (choice1 > 2));
                switch (choice1) {
                    case 1:
                        System.out.printf("\t| Author: %s\t |\n\n", aname);
                        break;
                    case 2:
                        System.out.printf("\t| AUTHOR: %s\t |\n\n", aname.toUpperCase());
                        break;
                }
                break;
        }
        console.close();
    }
}