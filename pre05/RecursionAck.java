import java.io.*;
import java.util.Scanner;

public class RecursionAck
{
	public static long Ack (long m, long n) //Ackermann function
	{
		if (m == 0) 
		{
			return n + 1; // Return n + 1 when m is 0.
		}
		else if (m > 0 && n == 0)
		{
			return Ack (m - 1, 1); // Calls Ackermann function recursively when m is greater than 0 and n is 0.
		}
		else
			return Ack (m - 1, Ack(m, n-1)); // Calls Ackermann function recursively when m is greater than 0 and n is greater than 0.
	
	}
	
	public static void main (String[] args)
	{
		long m, n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the value of m? ");
		m = in.nextInt();
		
		System.out.print("What is the value for n? ");
		n = in.nextInt();
		
		System.out.println(Ack(m, n)); //Invoke Ackermann function
	}
}