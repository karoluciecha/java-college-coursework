// Karol Uciecha - G00436758 - 13/11/2023

import java.util.Scanner;

public class KarolUciechaQuestion1
{
	public static void main(String[] args)
	{
		// Declaring variables
		final int NUMBER_OF_QUESTIONS = 2;
		Scanner console = new Scanner(System.in);
		char answerOne = 'a', answerTwo = 'b';
		int correctQuestionsCounter = 0;



		// Taking user answers
		try
		{
			System.out.printf("Welcome to the Simple Quiz!\nChoose the correct answer (A, B, C or D)\nQuestion 1: What is the capital of France?\nA: Berlin\nB: Paris\nC: Madrid\nD: London\nYour answer: ");
			answerOne = Character.toLowerCase(console.next().charAt(0));
		}
		catch (Exception e) {}
		try
		{
			System.out.printf("Question 2: How many continents are there on Earth?\nA: 5\nB: 6\nC: 7\nD: 8\nYour answer: ");
			answerTwo = Character.toLowerCase(console.next().charAt(0));
		}
		catch (Exception e) {}

		// Calculation results
		switch (answerOne)
		{
			case 'b':
				System.out.printf("You answered question 1 correctly\n");
				correctQuestionsCounter++;
				break;
			default:
				System.out.printf("You answered question 1 incorrectly\n");
				break;
		}
		switch (answerTwo)
		{
			case 'c':
				System.out.printf("You answered question 1 correctly\n");
				correctQuestionsCounter++;
				break;
			default:
				System.out.printf("You answered question 1 incorrectly\n");
				break;
		}


		// Printing results
		System.out.printf("Your final score: %d/%d\n", correctQuestionsCounter, NUMBER_OF_QUESTIONS);
		console.close();
	}
}