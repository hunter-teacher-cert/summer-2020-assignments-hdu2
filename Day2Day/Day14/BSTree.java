import java.io.*;
import java.util.*;

public class BSTree 
{
    private TreeNode root;

    public BSTree()
	{
		root = null;
    }

	// Search method to compare target value wtih elements in Binary Search Tree -- Search method works
	public int search (int target)
	{
		TreeNode current = root;
		
		while (current != null)// terminate loop when there is nothing to compare
		{
			int currentValue = current.getData();
			
			if (currentValue == target)
			{
				return currentValue;	// return current value when currentValue is equal to target
			}
			else if (currentValue > target)
			{
				current = current.getLeft(); //go the the left hand side if currentValue is greater than target
			}
			else 
			{
				current = current.getRight();//go the the right hand side if currentValue is less than target 
			}
				
		}
	
		// throw an exception when target was not found
		throw new NullPointerException();
	
	}
	
	// Insert method to the Binary Tree and must satisfy Binary Tree properties - always insert as a new leaf

	public void insert (int insert_value)
	{
		TreeNode front = root; //Piggy back a second pointer
		TreeNode newNode = new TreeNode (insert_value); // make new node for insertion
		
		// If the tree is empty, then manually insert the new node
		if (root == null) // base case
		{
			root = newNode;
			return;
		}	
		
		TreeNode trailer = root; //make trailer node
		
		while (front != null)
		{
			int frontValue = front.getData();
			
			if (frontValue == insert_value)
			{
				/* When frontValue is equal to insert_value, it means that insert_value
				already exists in the tree. We can update this tree in some way and then return	*/
				return;
			}
			else if (frontValue > insert_value)
			{
				trailer = front;
				front = front.getLeft(); // go left of the tree if frontValue is great than insert_value
			}
			else
			{
				trailer = front;
				front = front.getRight(); // go right of the tree if frontValue is less than insert_value
			}
		} // end of while loop
		
		/*Now, front points to null, but trailer points to the node that's before
		or above where the new node goes
		add the insert_value here. */
			if (insert_value > trailer.getData())
			{
				trailer.setRight(newNode);
			}
			else 
			{
				trailer.setLeft(newNode);
			}
			
	} // end of insertion
	
	public TreeNode getRoot()
	{
		return root;
	}
	
	// traverse method to go through all elements - it worked
	private void preorder_Traverse (TreeNode current)
	{
		if (current == null) // base case
			return;
		
		// process the current node
		System.out.print(current.getData() + ", ");
		
		//recursively print out the left sub-tree
		preorder_Traverse(current.getLeft());
		
		//recursively print out the right sub-tree
		preorder_Traverse(current.getRight());
		
	}
	
	// helper function for private traverse()
	public void preorder_Traverse ()
	{
		preorder_Traverse(root);
		System.out.println();
	}
	
	// traverse method to go through all elements - it worked (this is a copy of the original)
	private void postorder_Traverse (TreeNode current)
	{
		if (current == null) // base case
			return;
		
		// process the current node
		//System.out.print(current.getData() + ", ");
		
		//recursively print out the left sub-tree
		postorder_Traverse(current.getLeft());
		
		//recursively print out the right sub-tree
		postorder_Traverse(current.getRight());
		
		
		// process the current node
		System.out.print(current.getData() + ", ");
	}
	
	// helper function for private traverse() this is a copy of the original
	public void postorder_Traverse ()
	{
		postorder_Traverse(root);
		System.out.println();
	}
	
	// traverse method to go through all elements - it worked (this is a copy of traverse 2)
	private void inorder_Traverse (TreeNode current)
	{
		if (current == null) // base case
			return;
		
		// process the current node
		//System.out.print(current.getData() + ", ");
		
		//recursively print out the left sub-tree
		inorder_Traverse(current.getLeft());
		
		// process the current node
		System.out.print(current.getData() + ", ");
		
		//recursively print out the right sub-tree
		inorder_Traverse(current.getRight());
		
	}
	
	// helper function for private traverse() this is a copy of traverse 2
	public void inorder_Traverse ()
	{
		inorder_Traverse(root);
		System.out.println();
	}
	
	// Get maximum element in binary search tree
	public static TreeNode maximumElement(TreeNode start)
	{
		if (start == null)
			return null;
		if (start.getLeft() == null && start.getRight() == null)
			return start;
		else //need to look at this again due to infinite loop
			return maximumElement(start.getRight()); // recursively use maximumElement method to find max element on the left hand side in binary tree 	
	}
	
	// Delete method to delete a specific value
	public void delete (int target)
	{
	
		// If the tree is empty, there is nothing to delete.
		if (root == null)
			return;
		
		// how to delete something after searching when it is not there
		// delete node with one child
		// delete node with two children this is the difficult case
		// how to hold binary tree properties
		TreeNode front = root;
		TreeNode trailer = root;
		
		/* this is to do the actual deletion
		do the piggy back loop until we either find the target or null
		if target is not there*/
		while (front != null && front.getData() != target)
		{
			if (front.getData() > target)
			{
				trailer = front;
				front = front.getLeft(); // go left of the tree if frontValue is great than insert_value
			}
			else
			{
				trailer = front;
				front = front.getRight(); // go right of the tree if frontValue is less than insert_value
			}
		} // end of while loop
		
		// If this is the end of the left hand side, then return null.
		if (front == null)
			return;
		
		/*if we get here, front points to the node we want to delete
		and trailer points to the one above it */

		// case 1 - the node we want to delete is a leaf.
		if (front.getLeft() == null && front.getRight() == null)
		{
			if (trailer.getLeft() == front) //
			{
				trailer.setLeft(null);
			}
			else 
			{
				trailer.setRight(null);// repoint front's parent to null
			}
		}
			/* case 2 - check to see if front has one child*/
		else if (front.getLeft() == null || front.getRight() == null)
		{
			// repoint front's parent to front's child
			
			// what to do if it is a child on the left
			if (front.getLeft() != null)
			{
				if (trailer.getLeft() == front) //came from left
				trailer.setLeft(front.getLeft());
			
				else							// came fromt the right
				trailer.setRight(front.getLeft());
			}
			else // what to do if it is a child on the right
			{
				if (trailer.getLeft() == front) // came from left
				trailer.setLeft(front.getRight()); 
			
				else							// came from right
				trailer.setRight(front.getRight());
			
			}
		}
		else // case 3 - if front has two children
		{
			// find the node with the largest value is this correct?
			TreeNode maxNodeLeft = maximumElement(front.getLeft());
			
			front.setData(maxNodeLeft.getData()); //set the maximumElement of the left to the front
			
			delete(maxNodeLeft.getData()); // should I replace front with left instead? recursively? need to look at it again
			
			// on fronts left subtree (hint at 1:14:30 is for hint in video)
			// and replace front with it
		}

	}		
	
    public void seed()
	{
		TreeNode t;

		t = new TreeNode(10);
		root = t;
		t = new TreeNode(5);
		root.setLeft(t);
		t = new TreeNode(20);
		root.setRight(t);

		root.getLeft().setRight(new TreeNode(8)); // read from left to right

		t = new TreeNode(15);
		root.getRight().setLeft(t);

		t = new TreeNode(22);
		root.getRight().setRight(t);
	}
	
}