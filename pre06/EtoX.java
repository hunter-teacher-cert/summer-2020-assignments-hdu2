import java.io.*;
import java.util.Scanner;

public class EtoX
{
	public static double myexp (double x, int n)
	{
		double result = 1.0, product = 1.0; // should this begin at 0.0 instead? //has incompatible type error
		
		//int temp = n; // use temp to hold the value for n without affecting the condition in for loop
		
		for (int i = 1; i <= n; i++)
		{
			product = (double)(product * x / i);
			result = result + product;
		}
		
		return result;
	}
	
	// Check method to compare result from myexp method
	public static void check (double x)
	{
		int number = 6; // number of terms in series
		System.out.println(x + "\t" + myexp (x, number) + "\t" + Math.exp(x)); 	
	}	
	
	public static int Factorial (int n) //Factorial function interatively
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
		int num; //number for exponent
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the value of x? "); //Prompt user for x-value.
		num = in.nextInt(); //issue with datatype ************************************************************** need to resolve
		
		System.out.print("What is the value for n? "); //Prompt user for n-value.
		n = in.nextInt();
		
		System.out.println("The factorial of " + n + " is " + Factorial(n) + "."); //Invoke Factorial function
		
		System.out.println("The factorial of 6 is " + Factorial(6) + "."); //Invoke Power function without using prompt values.
		
		//testing e to the x
		System.out.println("E to the exponent " + num + " is equal to " + myexp(num, n));
	}
}