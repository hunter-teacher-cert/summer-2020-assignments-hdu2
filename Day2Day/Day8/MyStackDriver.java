import java.io.*;
import java.util.*;

public class MyStackDriver
{

	public static void main (String args [])
	{
		MyStack test = new MyStack();
		
		System.out.println(test);
		
		test.push("Hi");
		test.push("Who");
		test.push("Bye");
		
		String show = test.pop();
		System.out.println(show);
		
		show = test.pop();
		System.out.println(show);
		
		show = test.pop();
		System.out.println(show);

	} // end of main
}// end of MyStackDriver