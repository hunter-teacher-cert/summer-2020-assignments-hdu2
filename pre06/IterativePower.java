import java.io.*;
import java.util.Scanner;

public class IterativePower
{
	public static double Power (double x, int n) //Power function
	{
		int result = 1;
		
		while (n != 0)
		{
			result *= x;
			n -= 1;
		}
		return result;
	}
	
	public static void main (String[] args)
	{
		double x;
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the value of x? "); //Prompt user for x-value.
		x = in.nextDouble();
		
		System.out.print("What is the value for n? "); //Prompt user for n-value.
		n = in.nextInt();
		
		System.out.println("Base " + x + " with Exponent " + n + " is equal to " + Power(x, n) + "."); //Invoke Power function
		
		System.out.println("8 ^ 5 is " + Power(8, 5) + "."); //Invoke Power function without using prompt values.
	}
}