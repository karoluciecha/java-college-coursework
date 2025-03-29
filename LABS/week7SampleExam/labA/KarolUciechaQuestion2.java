// Karol Uciecha - G00436758 - 06/11/2023

import java.util.Scanner;
import java.util.ArrayList;

public class KarolUciechaQuestion2
{
	public static void main(String[] args)
	{
		final double PRICE_PER_BREAKFAST = 10D;
		Scanner console = new Scanner(System.in);
		int option1 = 0, nono1 = 0, numberOfBreakfast = 0, costOfBreakfast = 0, j = 0;
		double cpn1 = 0D, tc1 = 0D, cost = 0D;
		char yn1 = 'a', excursion = 'a';
		String gnameo1 = "", username = "";

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> numberOfNights = new ArrayList<Integer>();
		ArrayList<Integer> numberOfBreakfasts = new ArrayList<Integer>();
		ArrayList<Integer> costOfBreakfasts = new ArrayList<Integer>();
		ArrayList<Double> pricePerNight = new ArrayList<Double>();
		ArrayList<Double> pricePerStay = new ArrayList<Double>();
		ArrayList<Double> totalCost = new ArrayList<Double>();

		System.out.printf("\t==============================================\n");
		System.out.printf("\t\tWelcome to The Cozy Corner B&B\n");
		System.out.printf("\t==============================================\n\n");
		System.out.printf("Enter username: ");
		username = console.nextLine();
		System.out.printf("Welcome to The Cozy Corner B&B Booking System");
		if (username.toUpperCase().equals("MANAGER") || username.toUpperCase().equals("OWNER"))
		{
			System.out.printf(" - You are the %s", username.toUpperCase());
		}
		do
		{
			try
			{
				System.out.printf("\n\n======== SYSTEM OPTIONS ========\n1. Guest Check-in\n2. View Reservations\n3. Generate Bill for Current Guest\n4. View All Reservations\n5. Show Booked Room Count\n6. Purchase B&B Extras\n7. Exit System\n================================\nSpecify Item: 1/2/3/4/5/6/7: ");
				option1 = console.nextInt();
			}
			catch (Exception e)
			{
				console.nextLine();
			}
			if (option1 == 7)
			{
				System.out.printf("\nExiting system, goodbye...\n\n");
				console.close();
				return;
			}
		switch (option1)
		{
			case 1:
				gnameo1 = "";
				nono1 = 0;
				numberOfBreakfast = 0;
				costOfBreakfast = 0;
				cost = 0D;
				cpn1 = 0D;
				tc1 = 0D;
				do
				{
					try
					{
						console.nextLine();
						System.out.printf("\n\n======== GUEST CHECK-IN ========\nEnter Guest Name: ");
						gnameo1 = console.nextLine();
					}
					catch (Exception e) {}
				}
				while (gnameo1.equals(""));
				do
				{
					try
					{
						System.out.printf("Number of Nights: ");
						nono1 = console.nextInt();
					}
					catch (Exception e)
					{
						console.nextLine();
					}
				}
				while (nono1 < 1);
				do
				{
					try
					{
						System.out.printf("Cost per night: ");
						cpn1 = console.nextDouble();
					}
					catch (Exception e)
					{
						console.nextLine();
					}
				}
				while (cpn1 < 1);
				tc1 = nono1 * cpn1;
				cost = nono1 * cpn1;
				System.out.printf("%d night(s) @ %.2f euros per night is %.2f\n", nono1, cpn1, tc1);
				for (int i = 1; i <= nono1; i++) {
					do
					{
						try
						{
							System.out.printf("Would the guest like to include breakfast for day %d? (Y/N): ", i);
							yn1 = console.next().charAt(0);
							yn1 = Character.toLowerCase(yn1);
						}
						catch (Exception e) {}
						if (yn1 == 'y')
						{
							System.out.printf("Breakfast for day %d added at %.2f euros.\n", i, PRICE_PER_BREAKFAST);
							numberOfBreakfast++;
							costOfBreakfast += PRICE_PER_BREAKFAST;
						}
					} while (!(yn1 == 'n') && !(yn1 == 'y'));
				}
				tc1 += costOfBreakfast;
				System.out.printf("Total Cost including breakfast: %.2f\n", tc1);
				System.out.printf("================================\n");
				names.add(gnameo1);
				numberOfNights.add(nono1);
				numberOfBreakfasts.add(numberOfBreakfast);
				costOfBreakfasts.add(costOfBreakfast);
				pricePerNight.add(cpn1);
				pricePerStay.add(cost);
				totalCost.add(tc1);
				break;

			case 2:
				System.out.printf("\n\n======== RESERVATIONS ========");
				for (int i = 0; i < names.size(); i++)
				{
					System.out.printf("\n\nName: %s\nNights: %d", names.get(i), numberOfNights.get(i));
					// System.out.printf("Customer name: %s\nBooked for %d nights\n%d nights @ %.2f euros per night is %.2f\nBreakfast x %d: %d\nTotal cost: %.2f\n==============================\n", names.get(i), numberOfNights.get(i), numberOfNights.get(i), pricePerNight.get(i), pricePerStay.get(i), numberOfBreakfasts.get(i), costOfBreakfasts.get(i), totalCost.get(i));
				}
				System.out.printf("\n==============================\n");
				break;

			case 3:
				System.out.printf("\n\n========== VIEW BILL ==========");
				try
				{
					j = names.size() - 1;
					System.out.printf("\n\nCustomer name: %s\nBooked for %d nights\n%d @ nights %.2f euros per night is %.2f\nBreakfast x %d: %d\nTotal cost: %.2f", names.get(j), numberOfNights.get(j), numberOfNights.get(j), pricePerNight.get(j), pricePerStay.get(j), numberOfBreakfasts.get(j), costOfBreakfasts.get(j), totalCost.get(j));
				}
				catch (Exception e) {}
				System.out.printf("\n===============================\n");
				break;
			case 4:
				System.out.printf("\n\n======== RESERVATIONS ========\n");
				for (int i = 0; i < names.size(); i++)
				{
					System.out.printf("%s is staying for %d night(s) - Total cost: %.2f\n", names.get(i), numberOfNights.get(i), totalCost.get(i));
				}
				System.out.printf("==============================\n");
				break;

			case 5:
				System.out.printf("\n======== ROOM COUNT ========\nNumber of rooms booked: %d\n============================\n", names.size());
				break;

			case 6:
				System.out.printf("\n\n======== PURCHASE B&B EXTRAS ========\nEnter E for Excursion Package\nEnter N for No purchase\nEnter item for purchase: ");
				excursion = console.next().charAt(0);


				while (!(excursion == 'e') && !(excursion == 'n'));

				System.out.printf("\n=====================================\n");
				break;
		}
		option1 = 0;
		}
		while (true);
	}
}