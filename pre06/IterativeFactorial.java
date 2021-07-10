import java.io.*;
import java.util.Scanner;

public class IterativeFactorial
{
	public static int Factorial (int n) //Factorial function
	{
		int product = 1;
		
		for (int i = 1; i <= n; i++)
		{
			product *= i;
		}
		return product;
	}
	
	public static void main (String[] args)
	{
		//double x;
		int n;
		
		Scanner in = new Scanner(System.in);
		
		/*sSystem.out.print("What is the value of x? "); //Prompt user for x-value.
		x = in.nextDouble();*/
		
		System.out.print("What is the value for n? "); //Prompt user for n-value.
		n = in.nextInt();
		
		System.out.println("The factorial of " + n + " is " + Factorial(n) + "."); //Invoke Factorial function
		
		System.out.println("The factorial of 6 is " + Factorial(6) + "."); //Invoke Power function without using prompt values.
	}
}