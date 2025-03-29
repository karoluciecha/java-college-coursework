// Karol Uciecha - G00436758 - 06/11/2023

import java.util.Scanner;

public class KarolUciechaQuestion1
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		int month = 0, day = 0;
		String season = "";

		// Getting month
		try
		{
			System.out.printf("Enter a month (1 - 12): ");
			month = console.nextInt();
		}
		catch (Exception e)
		{
			System.out.printf("That's not an INT value number! Program is now shutting down...\n");
			console.close();
			return;
		}
		finally
		{
			if ((month < 1) || (month > 12))
			{
				System.out.printf("That's not a correct month number. Program is now shutting down...\n");
				console.close();
				return;
			}
		}

		// Getting day
		try
		{
			System.out.printf("Enter a day (1 - 31): ");
			day = console.nextInt();
		}
		catch (Exception e)
		{
			System.out.printf("That's not an INT value number! Program is now shutting down...\n");
			console.close();
			return;
		}
		finally
		{
			switch (month)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if ((day < 1) || (day > 31))
					{
						System.out.printf("That's not a correct day number for the month selected.\nNumber should be between 1 and 31.\nProgram is now shutting down...\n");
						console.close();
						return;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if ((day < 1) || (day > 30))
					{
						System.out.printf("That's not a correct day number for the month selected.\nNumber should be between 1 and 30.\nProgram is now shutting down...\n");
						console.close();
						return;
					}
					break;
				case 2:
					if ((day < 1) || (day > 28))
					{
						System.out.printf("That's not a correct day number for the month selected.\nNumber should be between 1 and 28.\nProgram is now shutting down...\n");
						console.close();
						return;
					}
					break;
			}
		}

		// Outputting result
		switch (month)
		{
			case 12:
			case 1:
			case 2:
				season = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "Autumn";
				break;
		}
		System.out.printf("You chose %d/%d, which corresponds to the season: %s.\n", month, day, season);






		console.close();
	}
}