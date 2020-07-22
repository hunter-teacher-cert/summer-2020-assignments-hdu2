import java.io.*;
import java.util.*;

public class Driver 
{
    public static void main(String[] args) 
	{
		BSTree test = new BSTree();
		
		test.seed();
		
		int value;
		
		value = test.search(10);
		System.out.println(value);
		
		value = test.search(15);
		System.out.println(value);
		
		// testing the search method
		try
		{
			value = test.search(17);
			System.out. println(value);
		}
		catch (NullPointerException e)
		{
			System.out. println("17 is not in the tree.");
		}
		
		// testing the insert method
		test.insert(10);
		test.insert(20);
		test.insert(5);
		test.insert(7);
		test.insert(8);
		test.insert(3);
		test.insert(25);
		
		/*// traverse without traverse method
		System.out.println("Get values from right most branch: ");
		TreeNode current = test.getRoot();
		
		while (current != null)
		{
			System.out.println(current.getData());
			current = current.getRight();
		}
		
		System.out.println("Root-Right-Left_Right");
		System.out.println(test.getRoot().getData());
		System.out.println(test.getRoot().getRight().getData());
		System.out.println(test.getRoot().getRight().getLeft().getData());
		System.out.println(test.getRoot().getLeft().getLeft().getData());
		*/
		
		//testing for various traverse methods and display in order
		test.preorder_Traverse();
		test.postorder_Traverse();
		test.inorder_Traverse();
		
		//testing for delete method
		
		test.delete(18);
		test.delete(20); //right hand side deleting 20
		
    }
}