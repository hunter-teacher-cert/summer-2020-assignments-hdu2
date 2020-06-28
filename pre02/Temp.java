import java.io.*;
import java.util.Scanner;

public class Temp
{
	public static void main (String[] args)
	{
		double TempCel, TempFah;
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is today's temperature in Celsius? "); // Asks for today's temp in Celsius.
		TempCel = in.nextFloat();
		
		TempFah = (TempCel * 9/5) +32.0; // Convert degree in Celsius to Fahrenheit.
		
		System.out.printf("%.1f C = %.1f F", TempCel, TempFah); // Display temperature conversion in 1 decimal place.
	}
}