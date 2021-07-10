import java.io.*;
import java.util.Scanner;

public class Triangle
{
	public static boolean isTriangle (int side1, int side2, int side3) //Check if the 3 sides entered form a triangle.
	{
		if (side3 < (side1 + side2) && side2 < (side1 + side3) && side1 < (side2 + side3))
		{
			System.out.println("These 3 sides can form a triangle.");
			return true;
		}
		else
		{
			System.out.println("These 3 sides cannot form a triangle.");
			return false;
		}
	}
	
	public static void main (String[] args)
	{
		int side1, side2, side3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the length of side 1: ");
		side1 = in.nextInt();
		
		System.out.print("What is the length of side 2: ");
		side2 = in.nextInt();
		
		System.out.print("What is the length of side 3: ");
		side3 = in.nextInt();
		
		isTriangle(side1, side2, side3); //Invoke/call isTriangle
	}
}