import java.io.*;
import java.util.*;

public class Stacks
{
	// start is the original stack and chars is the reverse of the start stack
	public static String reverse (String start) 
	{
		// Create local stack within Reverse
		Stack <Character> chars = new Stack <Character> ();
		
		for (int i = 0; i < start.length(); i++)
		{
			chars.push(start.charAt(i)); //set each character from start stack to the character stack
		}
		
		// Need to create a new string called rev for popping for reversing the character stack
		String rev = "";
		
		while (!chars.empty()) //loop until there is nothing in it
		{
			rev = rev + chars.pop(); // I can use rev += chars.pop(); also
		}

		return rev; // return the reverse stack of characters
	
	} // end of reverse method
	
	// start is the original stack and rev is the reverse of the start stack (w/ Margie's help)
	public static String reverseWords (String start) 
	{
		// Create local stack within Reverse
		Stack <String> SetofWords = new Stack <String> ();
		String [] words = start.split(" ");
		
		for (String word:SetofWords)
		{
			SetofWords.push(word); //set each character from start stack to the character stack using array notation
		
		}
		
		// Need to create a new string called rev for popping for reversing the character stack
		String rev = "";
		while (!SetofWords.empty()) //
		{
			rev = rev + SetofWords.pop(); // should I use rev += chars.pop(); instead?
		}

		return rev; // return the reverse stack of characters
	
	} // end of ReverseWords method
	
	// Need to check if character stack is a palindrome
	public static boolean isPalendrome (String start)
	{
		
		//Create local stack within isPalendrome for comparison later
		Stack <Character> chars = new Stack <Character> ();
		
		for (int i = 0; i < start.length(); i++)
		{
			chars.push(start.charAt(i)); //Set each character from the start stack to the character stack
		}
		
		// make j as the counter for start stack
		int j = 0;
		while (!chars.empty()) // should I use !chars.empty() instead?
		{
			if (chars.pop() != start.charAt(j)) //Should I have !chars.pop().equals(start.charAt(j)) instead?
			{
				return false; //exit isPalendrome method when the current character in character stack does not equal to current index character in start stack
			}
			
			j++; //increment j to get the next character in start stack
		}
		
		return true; // If each character in start stack is equal to each character sequentially and respectively to each character in the character stack, return true.
		
	}// end of isPalendrome method
	
	// Check for set(s) of parentheses, brackets, and curly braces in expression 
	public static boolean parenChecker(String start)
	{
		int parenCount = 0, brackCount = 0, braceCount = 0;
		
		Stack <Character> chars = new Stack <Character> ();
		
		for (int i = 0; i < start.length(); i++)// Do I need to do this? Or should I just pop the start stack of characters?
		{
			chars.push(start.charAt(i)); //Set each character from the start stack to the character stack
			
			// check for open '('
			if (chars.equals('('))
				parenCount++;
			
			// check for close ')'
			else if (chars.equals(')'))
				parenCount--;
			
			// check for open '['
			else if (chars.equals('['))
				brackCount++;
			
			// check for close ])'
			else if (chars.equals(']'))
				brackCount--;
			
			// check for open '{'
			else if (chars.equals('{'))
				braceCount++;
			
			// check for close '}'
			else if (chars.equals('}'))
				braceCount--;
		} // end of for loop
		
		return (parenCount == 0) & (brackCount == 0) && (braceCount == 0); // determine if there are sets of parentheses, brackets, or braces
	} // end of parenCheck
	
	
	// Use main to test Stacks
	public static void main(String[] args) 
	{

		String s0 = "verisimilitude";
		String s1 = "racecar";
		String s2 = "able was i ere i saw elba";
		String e0 = "a+b*c";
		String e1 = "(a+b)*c";
		String e2 = "a+b)*c";
		String e3 = "(a+b*c";

		System.out.printf("reverse %s: %s\n", s0, reverse(s0) );
		System.out.printf("isPalindrome %s: %b\n", s0, isPalendrome(s0) );
		System.out.printf("isPalindrome %s: %b\n", s1, isPalendrome(s1) );
		System.out.printf("isPalindrome %s: %b\n", s2, isPalendrome(s2) );

		System.out.printf( "parenChck %s: %b\n", e0, parenChecker(e0) );
		System.out.printf( "parenChck %s: %b\n", e1, parenChecker(e1) );
		System.out.printf( "parenChck %s: %b\n", e2, parenChecker(e2) );
		System.out.printf( "parenChck %s: %b\n", e3, parenChecker(e3) );

		String s3 = "make it so";
		String s4 = "i am what am i";
		System.out.printf("reverseWords %s: %s\n", s3, reverseWords(s3));
		System.out.printf("reverseWords %s: %s\n", s4, reverseWords(s4));

	}//main()
	
}