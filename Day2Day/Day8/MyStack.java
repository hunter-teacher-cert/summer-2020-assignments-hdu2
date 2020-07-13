import java.io.*;
import java.util.*;

public class MyStack
{
      // add your internal data structure here
	  private LList stack;
	  
      public MyStack()
	  {
         stack = new LList(); // add constructor code
      }

      public void push(String data)
	  {
         stack.addFront(data); // add code to push data on to the stack. Invoke addFront method
      }

      public String pop()
	  {
          String value = stack.get(0);
		  stack.remove(0); // add code to remove and return the item on the top of the stack, invoke remove() method
		  return value;					// return the item on the top of the stack
      }

      public String top()
	  {
		  return stack.get(0);     // add code to return but not remove the item on the top of the stack
      }

      public boolean isEmpty()
	  {
          return stack.isEmpty(); // return true if the stack has no data, false otherwise. Invoke LList isEmpty() method
      }

      public int size()
	  {
          return stack.length(); // add code to return the number of items currently on the stack, invoke length() method
      }
    
} //end of stack 
