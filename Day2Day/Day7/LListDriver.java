import java.io.*;
import java.util.*;

public class LListDriver 
{
  public static void main(String[] args) 
  {

    LList g = new LList();

    System.out.println("Test Empty list print & isEmpty:");
    System.out.println(g);
    System.out.println(g.isEmpty());

    System.out.println("\nTest addFront 3x & isEmpty():");
    g.addFront("good");
    g.addFront("news");
    g.addFront("everyone!");
    System.out.println(g);
    System.out.println(g.isEmpty());

   System.out.println("\nTest get 0, 1, 5:");
   System.out.println(g.get(0));
   System.out.println(g.get(1));
   System.out.println(g.get(5));

	try
	{	
		System.out.println(g.get(7));
	}
	catch (IndexOutOfBoundsException e)
	{
		System.out.println("No, you can't get something that does not exist.");
	}

   System.out.println("\nTest set 0, 1, 5:");
   g.set(0, "me!");
   g.set(1, "job");
   g.set(5, "wow");

	try 
	{
		g.set(8, "What");
	}
	catch  (IndexOutOfBoundsException e)
	{
		System.out.println("No, you can't get something that does not exist.");
	}

   System.out.println(g);
	
   System.out.println("\nTest insert 0, 2, 5, 10:");
   g.insert(0, "woo!");
   g.insert(2, "go");
   g.insert(5, "cool");
   g.insert(10, "too far");

	try 
	{
		g.insert(15, "What");
	}
	catch(IndexOutOfBoundsException e)
	{
		System.out.println("No, you can't get something that does not exist.");
	}

   System.out.println(g);

   System.out.println("\nTest search \"woo!\", \"cool\", \"too far\"");
   System.out.println(g.search("woo!"));
   System.out.println(g.search("cool"));
   System.out.println(g.search("too far"));

   System.out.println("\nTest remove 0, 2:");
   g.remove(0);
   System.out.println(g);
   g.remove(2);
   System.out.println(g);

  }//main
}//LListDriver