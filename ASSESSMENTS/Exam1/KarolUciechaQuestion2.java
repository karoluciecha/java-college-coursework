// Karol Uciecha - G00436758 - 06/11/2023

import java.util.Scanner;
import java.util.ArrayList;

public class KarolUciechaQuestion2
{
	public static void main(String[] args)
	{
		// Declaring variables
		final double[] PRICES = {55.00D, 180.00D, 250.00D};
		Scanner console = new Scanner(System.in);
		int[] cartItemQuantities = {0, 0, 0};
		int action = 0, itemToAddQuantity = 0, itemToRemoveQuantity = 0;
		double userBudget = -1D, cartTotal = 0D;
		char itemToAdd = 'q', itemToRemove = 'q';

		// Taking budget value
		do
		{
			try
			{
				System.out.printf("Enter your budget (1 to 1000): ");
				userBudget = console.nextDouble();
			}
			catch (Exception e)
			{
				console.nextLine();
			}

		if (!((userBudget > 0) && (userBudget < 1001)))
		{
			System.out.printf("Invalid entry. Please enter a value between 1 and 1000.\n");
		}
		else
		{
			System.out.printf("You have $%.2f to spend.", userBudget);
			break;
		}
		}
		while (true);

		// Main program
		do
		{
			// Asking user which action to run
			action = 0;
			try
			{
				System.out.printf("\n\nPlease select an option:\n1. View all items       4. View cart total\n2. Add to cart          5. Checkout\n3. Remove from cart     6. Exit\n\nEnter your choice: ");
				action = console.nextInt();
			}
			catch (Exception e)
			{
				console.nextLine();
			}

			// Running indicated action
			switch (action)
			{
				case 1:
					System.out.printf("A: Luxury Smartphone Case ($%.2f)\nB: High-End Wireless Earbuds ($%.2f)\nC: Smartwatch ($%.2f)", PRICES[0], PRICES[1], PRICES[2]);
					break;

				case 2:
					itemToAdd = 'q';
					itemToAddQuantity = 0;
					do
					{
						try
						{
							System.out.printf("Enter the letter of the item you wish to add (A, B, C): ");
							itemToAdd = Character.toLowerCase(console.next().charAt(0));
						}
						catch (Exception e)
						{
							console.nextLine();
						}
						if (!(itemToAdd == 'a') && !(itemToAdd == 'b') && !(itemToAdd == 'c'))
						{
							System.out.printf("Invalid item selection.\n");
						}
						else
						{
							break;
						}
					}
					while (true);
					do
					{
						try
						{
							System.out.printf("Enter the quantity: ");
							itemToAddQuantity = console.nextInt();
						}
						catch (Exception e)
						{
							console.nextLine();
						}
					}
					while (itemToAddQuantity < 0);
					switch (itemToAdd)
					{
						case 'a':
							cartItemQuantities[0] += itemToAddQuantity;
							cartTotal += PRICES[0] * itemToAddQuantity;
							break;
						case 'b':
							cartItemQuantities[1] += itemToAddQuantity;
							cartTotal += PRICES[1] * itemToAddQuantity;
							break;
						case 'c':
							cartItemQuantities[2] += itemToAddQuantity;
							cartTotal += PRICES[2] * itemToAddQuantity;
							break;
						default:
							break;
					}
					break;

				case 3:
					itemToRemove = 'q';
					itemToRemoveQuantity = 0;
					do
					{
						try
						{
							System.out.printf("Enter the letter of the item you wish to remove (A, B, C): ");
							itemToRemove = Character.toLowerCase(console.next().charAt(0));
						}
						catch (Exception e)
						{
							console.nextLine();
						}
						if (!(itemToRemove == 'a') && !(itemToRemove == 'b') && !(itemToRemove == 'c'))
						{
							System.out.printf("Invalid item selection.\n");
						}
						else
						{
							break;
						}
					}
					while (true);
					do
					{
						try
						{
							System.out.printf("Enter the quantity to remove: ");
							itemToRemoveQuantity = console.nextInt();
						}
						catch (Exception e)
						{
							console.nextLine();
						}
					}
					while (itemToRemoveQuantity < 0);
					switch (itemToRemove)
					{
						case 'a':
							if (cartItemQuantities[0] >= itemToRemoveQuantity)
							{
								cartItemQuantities[0] -= itemToRemoveQuantity;
								cartTotal -= PRICES[0] * itemToRemoveQuantity;
							}
							else
							{
								System.out.printf("Not enough quantity in cart.");
							}
							break;

						case 'b':
							if (cartItemQuantities[1] >= itemToRemoveQuantity)
							{
								cartItemQuantities[1] -= itemToRemoveQuantity;
								cartTotal -= PRICES[1] * itemToRemoveQuantity;
							}
							else
							{
								System.out.printf("Not enough quantity in cart.");
							}
							break;

						case 'c':
							if (cartItemQuantities[2] >= itemToRemoveQuantity)
							{
								cartItemQuantities[2] -= itemToRemoveQuantity;
								cartTotal -= PRICES[2] * itemToRemoveQuantity;
							}
							else
							{
								System.out.printf("Not enough quantity in cart.");
							}
							break;

						default:
							break;
					}
					break;

				case 4:
					if ((cartItemQuantities[0] <= 0) && (cartItemQuantities[1] <= 0) && (cartItemQuantities[2] <= 0))
					{
						System.out.printf("Your cart is empty.");
						break;
					}
					System.out.printf("Items in Cart:\n");
					if (cartItemQuantities[0] > 0)
					{
						System.out.printf("- Luxury Smartphone Case x %d\n", cartItemQuantities[0]);
					}
					if (cartItemQuantities[1] > 0)
					{
						System.out.printf("- High-End Wireless Earbuds x %d\n", cartItemQuantities[1]);
					}
					if (cartItemQuantities[2] > 0)
					{
						System.out.printf("- Smartwatch x %d\n", cartItemQuantities[2]);
					}
					System.out.printf("Total Cost: $%.2f", cartTotal);
					break;

				case 5:
					System.out.printf("Checking out...\n");
					if (cartTotal <= userBudget)
					{
						userBudget -= cartTotal;
						System.out.printf("Total cost is $%.2f. You have $%.2f remaining.", cartTotal, userBudget);
						cartTotal = 0;
						cartItemQuantities[0] = 0;
						cartItemQuantities[1] = 0;
						cartItemQuantities[2] = 0;
					}
					else
					{
						System.out.printf("Insufficient funds for this purchase.");
					}
					break;

				case 6:
					console.close();
					return;

				default:
					System.out.printf("Invalid option. Please try again.");
					break;
			}
		}
		while (true);
	}
}