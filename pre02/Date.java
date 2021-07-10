import java.io.*;
import java.util.*;

public class Date
{
	public static void main (String[] args)
	{
		String day = "Sunday, ";
		int date = 28;
		String month = "June";
		int year = 2020;
		System.out.println("American format: "); // American Format
		System.out.println("Today is " + day + month + " " + date + ", " + year);
		
		System.out.println("European format: "); // European format
		System.out.println(day + date + month + year);
	}
}