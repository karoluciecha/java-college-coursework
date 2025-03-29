// Karol G00436758
import java.util.Scanner;

public class JavaScanner11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fName, lName;
        int empID;
        double salary, taxRate;
        System.out.print("Enter first name: ");
        fName = keyboard.nextLine();
        System.out.print("Enter surname: ");
        lName = keyboard.nextLine();
        System.out.print("Enter employee ID: ");
        empID = keyboard.nextInt();
        System.out.print("Enter salary: ");
        salary = keyboard.nextDouble();
        System.out.print("Enter current tax rate: ");
        taxRate = keyboard.nextDouble();
        System.out.println("\n|------------------------------------------|");
        System.out.println("| PAYSLIP                                  |");
        System.out.println("|------------------------------------------|");
        System.out.println("| EMPLOYEE: " + fName + " " + lName);
        System.out.println("| ID: " + empID);
        System.out.println("|                                          |");
        System.out.println("| SALARY: " + salary);
        System.out.println("| PRSI: " + salary * (taxRate/100));
        System.out.println("| ANNUAL TAKE HOME: " + (salary - (salary * (taxRate/100))));
        System.out.println("| MONTHLY TAKE HOME: " + ((salary - (salary * (taxRate/100))))/12);
        System.out.println("|------------------------------------------|");
        keyboard.close();
    }
}