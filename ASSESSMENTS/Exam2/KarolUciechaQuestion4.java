// Karol Uciecha - G00436758 - 18/12/2023

import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;

public class KarolUciechaQuestion4 {
    public static void main(String[] args) throws IOException {
		final int[] TICKET_PRICES = {50, 60, 100};
		Object[] optEvent = {"Concert", "Theater Play", "Sports Game", "Movie Screening"}, optTicket = {"Standard", "Premium", "VIP"};
		char[] transLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		Random rnd = new Random();
		String fileName, billFile, transID, salesReport = "";
		char letter1, letter2;
		int eventChoice = -1, ticketChoice = -1, ticketQuantity = -1, transNumber;
		float ticketPrice = 0F, totalSales = 0F;

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
				catch (Exception e) {}
			} while (ticketQuantity < 0);
			if (ticketQuantity >= 10) {
				ticketPrice = TICKET_PRICES[ticketChoice] * 0.9F * ticketQuantity;
			} else {
				ticketPrice = TICKET_PRICES[ticketChoice] * ticketQuantity;
			}
			do {
				fileName = JOptionPane.showInputDialog(null, "Enter a filename for your receipt:", "Input", JOptionPane.INFORMATION_MESSAGE);
			} while (fileName.equals(""));

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
}