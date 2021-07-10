import java.io.*;
import java.util.*;

public class ArrayExample
{
	// Exercise 1.1 powArray method
	 public static double [] powArray (double [] a, int x)
	{
		// declare a_sq as second array to store the square of each element of array a
		double [] a_sq = new double [a.length]; 

		for (int i = 0; i < a.length; i++) 
		{
			a_sq[i] = Math.pow(a[i], x);
		}
		
		return a_sq;
	}
	
	// Exercise 1.2 histogram method
	public static int [] histogram (int [] scores)
	{
		int[] counts = new int[101];
		for (int score : scores) 
		{
			counts[score]++;
		}
		return counts;
	}
	
	public static int [] randomArray (int limit, int counters)
	{
		Random random = new Random ();
		
		int [] new_array = new int [counters];
		
		for (int i = 0; i < new_array.length; i++)
		{
			new_array[i] = random.nextInt(limit);
		}
		
		return new_array;
	}
	
	//Exercise 4 - indexOfMax method returns the index of the largest element
	public static int indexOfMax (int [] array)
	{
		int maxIndex = 0;
		int maxValue = array[0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > maxValue)
			{
				maxValue = array[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	// Exercise 5 Sieve method finds all prime numbers up to any given limit
	public static boolean [] sieve (int number)
	{
		boolean [] prime_numbers = new boolean [number+1];
		prime_numbers[0] = false;
		prime_numbers[1] = false;
		
		for (int i = 2; i < number; i++)
			prime_numbers[i] = true;
		
			for (int i = 2; i * i <= number; i++)
			{
				if (prime_numbers[i] == true)
				
				// multiples of i is a non-prime number
				for (int j = i * 2; i <= number; i +=j)
					prime_numbers[j] = false;
			}	
		/*
		
		for (int i = 2; i *i < number ; i++)
		{
			prime_numbers[i] = true;
				for (int j = i; j < number; j++)
				{
					if (i % j == 0)
					prime_numbers[i] = false;
				}
		}*/
		
		return prime_numbers;
	}
		
		public static void main (String [] args)
		{
			//test for Exercise 1.1
			double [] a = {1, 2, 3, 4, 5};
			
			double [] new_array;
			
			int power = 3;
			
			new_array = powArray(a, power);
			
			System.out.println("Raise each element of the array to the power " + power);
			System.out.println(java.util.Arrays.toString(new_array));
			System.out.println();
			
			// test for Exercise 1.2
			int counters = 2;
			
			int limit = 100;
			
			System.out.printf("Histogram of %d random scores from 0 to (but not including) %d:\n", counters, limit);
			double [] scores  = powArray(a, counters); // type compatibility issue
			int [] hist_array = {65, 75, 70, 100, 70, 65, 80};
			int [] counts_hist = histogram(hist_array);
			
			for (int i = 0; i < counts_hist.length; i++)
			{
				System.out.printf("%3d: ", i);
				for (int j = 0; j < counts_hist[i]; j++)
				{
					System.out.print("#");
				}	
			}
			
			//test for Exercise 4
			int [] test_Array = {10, 5, 15, 6, 8, 30, 25, 20, 12};
			System.out.println("The maximum value is at index " + indexOfMax(test_Array));
			
			// test for Exercise 5
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int value = scanner.nextInt();
			
			System.out.println("The prime numbers from 2 to " + value + " is \n");
			
			boolean [] primes = sieve(value);
			
			for (int i = 0; i <= value; i++)
			{
				if (primes[i] == true)
				System.out.print(i + " ");
			}// end of for loop
		} //end of main	
} // end of ArrayExample
