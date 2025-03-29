// Karol G00436758
import java.util.Scanner;

public class OneTimeCurrencyConverter {
    public static void main(String[] args) {
        final double USD_TO_EUR = 0.85D, EUR_TO_USD = 1.18D, USD_TO_GBP = 0.73D, GBP_TO_USD = 1.37D;
        Scanner console = new Scanner(System.in);
        int choice = 0;
        double amount = 0D;

        do {
            System.out.print("Currency Converter Menu:\n1: Convert from US Dollar to Euro\n2: Convert from Euro to US Dollar\n3: Convert from US Dollar to British Pound\n4: Convert from British Pound to US Dollar\n5: Exit\nEnter your choice: ");
            choice = console.nextInt();
        } while ((choice < 1) || (choice > 5));
        
        switch (choice) {
            case 5:
                console.close();
                return;
            case 1:
                do {
                    System.out.print("Enter amount in US Dollars: ");
                    amount = console.nextDouble();
                } while (amount < 0);
                System.out.println("Converted amount: " + (amount * USD_TO_EUR) + " Euro" );
                console.close();
                return;
            case 2:
                do {
                    System.out.print("Enter amount in Euro: ");
                    amount = console.nextDouble();
                } while (amount < 0);
                System.out.println("Converted amount: " + (amount * EUR_TO_USD) + " US Dollars" );
                console.close();
                return;
            case 3:
                do {
                    System.out.print("Enter amount in US Dollars: ");
                    amount = console.nextDouble();
                } while (amount < 0);
                System.out.println("Converted amount: " + (amount * USD_TO_GBP) + " British Pounds" );
                console.close();
                return;
            case 4:
                do {
                    System.out.print("Enter amount in British Pounds: ");
                    amount = console.nextDouble();
                } while (amount < 0);
                System.out.println("Converted amount: " + (amount * GBP_TO_USD) + " US Dollars" );
                console.close();
                return;
        }
        console.close();
    }
}