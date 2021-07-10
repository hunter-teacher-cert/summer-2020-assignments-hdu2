import java.io.*;
import java.util.Scanner;

public class Methods
{
	public static boolean isDivisible (int n, int m) //Check if n is divisible by m
	{
		if (n%m == 0)
		{
			System.out.println("n is divisible by m.");
			return true;
		}
		else
		{
			System.out.println("n is not divisible by m.");
			return false;
		}
	}
	
	public static void main (String[] args)
	{
		int n, m;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the value of n: ");
		n = in.nextInt();
		
		System.out.print("What is the value of m: ");
		m = in.nextInt();
		
		isDivisible(n, m); //Invoke/call isDivisible
	}
}