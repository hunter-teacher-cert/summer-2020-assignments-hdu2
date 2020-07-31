// Graps game

import java.io.*;
import java.util.*;

public class Craps
{
	Scanner in = new Scanner(System.in);
	
	// roll method accepts an integer parameter and returns a random number between 1 and that number inclusively
	public static int roll (int integer)
	{
		Random random_int = new Random ();
		return random_int.nextInt(integer) + 1;
	}
	
	/* shoot method accepts two parameters - a number and the maximum value for those dice
	  and returns the rolling those dice. */
	public static int shoot (int num_dice, int max_value)
	{
		int sum = 0;
		
		System.out.print("Roll: ");
		
		for (int i = 0; i < num_dice; i++)
		{
			sum += roll(max_value);
		}
		System.out.print("The total is: " + sum + "\n");
		return sum;
	}
	
	/* round method - accepts no parameters and it should return something to indicate
	   if the shooter wins or loses. */
	public static boolean round ()
	{
		int shooting_dice = shoot(2, 6);
		
		// if player rolls a sum of 2, 3, or 12, Craps and player loses.
		if (shooting_dice == 2 || shooting_dice == 3 || shooting_dice == 12)
		{
			System.out.println("Craps! You lose this round.");
			return false;
		}
		// if player rolls a sum of 7 or 11, that's Natural and player wins.
		else if (shooting_dice == 7 || shooting_dice == 11)
		{
			System.out.println("Natural! You win!");
			return true;
		}
		else
		{
			System.out.println("Point, Shoot again.");
			
			while (!false)
			{
				int shooting_dice2 = shoot (2, 6);
				if (shooting_dice == shooting_dice2)
				{
					System.out.println("You win this round!");
					return true;
				}
				else if (shooting_dice2 == 7)
				{
					System.out.println("You lose this round!");
					return false;
				}
				System.out.println("Shoot again!");
			}
		}
	}
					
	public static void main (String [] args)
	{
		System.out.println("Welcome to the game of Craps!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many rounds of the game of Craps would you like to play?");
		int rounds = scanner.nextInt();
		
		int number_wins = 0;
		
		for (int i = 0; i < rounds; i++)
		{
			System.out.println("Round " + (i + 1));
			if (round())
			{
				number_wins++;
			}
		}
			
	}// end of main	
	
} // end of Craps game	