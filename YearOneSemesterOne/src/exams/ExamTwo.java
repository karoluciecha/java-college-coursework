package exams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExamTwo {

	private static void exerciseOne(Scanner console) {
        float j = 0F, f = 0F;
        System.out.printf("Enter the starting number: ");
        j = console.nextFloat();
        System.out.printf("Enter the gap number (can be decimal): ");
        f = console.nextFloat();
        for (int i = 1; i <= 10; i++) {
			j += f;
            System.out.printf("%d : %.2f\n", i, j);
        }
	}

	private static void exerciseTwo() {
		Random rnd = new Random();
		int qA = rnd.nextInt(5), qB;
		do {
			qB = qA;
			String[] quotes = {"Be yourself; everyone else is already taken.", "I have not failed. I've just found 10,000 ways that won't work.", "Know thyself.", "Dare to be different.", "Jump at the sun."};
			qA = rnd.nextInt(5);

			// Making sure quotes are different
			do {
				if (qA == qB) qA = rnd.nextInt(5);
				else break;
			} while (true);

			JOptionPane.showMessageDialog(null, quotes[qA], "Quote of the Day", JOptionPane.INFORMATION_MESSAGE);
			if(JOptionPane.showConfirmDialog(null, "Would you like to see another quote?", "Continue?", JOptionPane.YES_NO_OPTION) == 1) break;
		} while (true);
    }
	
	private static void exerciseThree(Scanner console) {
		int[] dice = {0, 0, 0, 0, 0, 0};
		Random rnd = new Random();
		boolean checker;
		int rollNumber = 0, highestOccurrence = 0, highestNumber = 0;

		do {
			checker = false;
			System.out.printf("How many times would you like to roll the dice? (Range 1 to 100): ");
			try {
				rollNumber = console.nextInt();
				if ((rollNumber < 1) || (rollNumber > 100)) {
					System.out.printf("Please enter a number between 1 and 100.\n");
					checker = true;
				}
			}
			catch (Exception e) {
				System.out.printf("Please enter a real number!\n");
				console.nextLine();
				checker = true;
			}
		} while (checker);
		for (int i = 1; i <= rollNumber; i++) dice[rnd.nextInt(6)]++;

		System.out.printf("\nResults:\n1: %d times\n2: %d times\n3: %d times\n4: %d times\n5: %d times\n6: %d times\n", dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]);
		highestOccurrence = dice[0];
		highestNumber = 1;
		if (highestOccurrence < dice[1]) {
			highestOccurrence = dice[1];
			highestNumber = 2;
		}
		if (highestOccurrence < dice[2]) {
			highestOccurrence = dice[2];
			highestNumber = 3;
		}
		if (highestOccurrence < dice[3]) {
			highestOccurrence = dice[3];
			highestNumber = 4;
		}
		if (highestOccurrence < dice[4]) {
			highestOccurrence = dice[4];
			highestNumber = 5;
		}
		if (highestOccurrence < dice[5]) {
			highestOccurrence = dice[5];
			highestNumber = 6;
		}
		System.out.printf("The number that came up most frequently was %d, occurring %d times.\n", highestNumber, highestOccurrence);
	}

	private static void exerciseFour() throws IOException {
		final int[] TICKET_PRICES = {50, 60, 100};
		Object[] optEvent = {"Concert", "Theater Play", "Sports Game", "Movie Screening"}, optTicket = {"Standard", "Premium", "VIP"};
		char[] transLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		Random rnd = new Random();
		String fileName, billFile, transID, salesReport = "";
		char letter1, letter2;
		int eventChoice = -1, ticketChoice = -1, ticketQuantity = -1, transNumber;
		float ticketPrice = 0F, totalSales = 0F;

	    // Create necessary folders if they don't exist
	    new File("Receipts").mkdirs();
	    new File("Sales").mkdirs();
	    
		JOptionPane.showMessageDialog(null, "EVENT BOOKING SYSTEM", "Message", JOptionPane.INFORMATION_MESSAGE);
		FileWriter fWriterSale = new FileWriter("Sales" + File.separator + "Sales.txt", true);
		PrintWriter pWriterSale = new PrintWriter(fWriterSale);
		do {
			fileName = "";
			billFile = "";
			eventChoice = -1;
			ticketChoice = -1;
			ticketQuantity = -1;
			ticketPrice = 0F;
			letter1 = transLetter[rnd.nextInt(26)];
			letter2 = transLetter[rnd.nextInt(26)];
			do {
				letter2 = transLetter[rnd.nextInt(26)];
			} while (letter1 == letter2);
			transNumber = rnd.nextInt(899) + 100;
			transID = String.format("%c%c%d",letter1, letter2, transNumber);
			do {
			eventChoice = JOptionPane.showOptionDialog(null, "Select an event:", "Event Choice", 0, JOptionPane.INFORMATION_MESSAGE, null, optEvent, optEvent[0]);
			} while (eventChoice < 0);
			do {
			ticketChoice = JOptionPane.showOptionDialog(null, "Select a ticket type:", "Ticket Type", 0, JOptionPane.INFORMATION_MESSAGE, null, optTicket, optTicket[0]);
			} while (ticketChoice < 0);
			do {
				try {
					ticketQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tickets:", "Input", JOptionPane.INFORMATION_MESSAGE));
	            }
				catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a valid integer.");
	            }
			} while (ticketQuantity < 0);
			if (ticketQuantity >= 10) {
				ticketPrice = TICKET_PRICES[ticketChoice] * 0.9F * ticketQuantity;
			} else {
				ticketPrice = TICKET_PRICES[ticketChoice] * ticketQuantity;
			}
	        do {
	            fileName = JOptionPane.showInputDialog(null, "Enter a filename for your receipt (no extension):", "Input", JOptionPane.INFORMATION_MESSAGE);
	            if (fileName == null || fileName.trim().isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Filename cannot be empty. Try again.");
	            }
	        } while (fileName == null || fileName.trim().isEmpty());

			FileWriter fWriter = new FileWriter("Receipts" + File.separator + fileName + ".txt", false);
			PrintWriter pWriter = new PrintWriter(fWriter);
			billFile = String.format("Event: %s\nTicket Type: %s\nNumber of Tickets: %d\nTotal Cost (with discount if applicable): $%.2f\nTransaction ID: %s\n", optEvent[eventChoice], optTicket[ticketChoice], ticketQuantity, ticketPrice, transID);
			salesReport += String.format("Event: %s\nTicket Type: %s\nNumber of Tickets: %d\nTotal Cost (with discount if applicable): $%.2f\nTransaction ID: %s\n--------------------\n", optEvent[eventChoice], optTicket[ticketChoice], ticketQuantity, ticketPrice, transID);
			pWriterSale.printf("Event: %s\nTicket Type: %s\nNumber of Tickets: %d\nTotal Cost (with discount if applicable): $%.2f\nTransaction ID: %s\n\n", optEvent[eventChoice], optTicket[ticketChoice], ticketQuantity, ticketPrice, transID);
			totalSales += ticketPrice;
			pWriter.printf("%s", billFile);
			pWriter.close();
			JOptionPane.showMessageDialog(null, "Your transaction (ID: "+ transID + ") was successful. Receipt saved in 'Receipts/" + fileName + ".txt'.");
			if (JOptionPane.showConfirmDialog(null, "Show Sales report?", "Report on Screen?", JOptionPane.YES_NO_OPTION) == 0) JOptionPane.showMessageDialog(null, "TOTAL SALES: "+ totalSales + "\n" + salesReport);
			if (JOptionPane.showConfirmDialog(null, "Exit System?", "Exit", JOptionPane.YES_NO_OPTION) == 0) break;
		} while (true);
		pWriterSale.close();
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("===== Exercise 1 =====");
		exerciseOne(scanner);

		System.out.println("\n===== Exercise 2 =====");
		exerciseTwo();
		
		System.out.println("===== Exercise 3 =====");
		exerciseThree(scanner);

		System.out.println("\n===== Exercise 4 =====");
		exerciseFour();

		scanner.close();
	}
}
