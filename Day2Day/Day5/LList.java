import java.io.*;
import java.util.*;

public class LList
{
    private Node head;

    public LList()
	{
		head = null;
    }

	public boolean isEmpty()
	{
		return head == null;
	}

    public void addFront(String data)
	{
		Node newnode = new Node(data);

	// first point the new node to the beginning
		newnode.setNext(head);

	// point head to the new node
		head = newnode;
		
	//Do we need to length++?
    }

    public String toString()
	{
		String s = "";

		Node tmp;
		tmp = head;
		while (tmp != null)
		{
			s = s + tmp.getData()+"-->";
			// how can we now move tmp to the next node
			// this is the magic linked list idiom!!!!
			// this moves a pointer to the next node!!!
			// It's analagous to i=i+1 for an array (for loop)
			tmp = tmp.getNext();
		}

		s = s + "null";
		return s;
    }

    public int length()
	{
		int l = 0;

		Node tmp;
		tmp = head;
		
		while (tmp != null)
		{
			l = l + 1;

			// how can we now move tmp to the next node
			// this is the magic linked list idiom!!!!
			// this moves a pointer to the next node!!!
			// It's analagous to i=i+1 for an array (for loop)
			tmp = tmp.getNext();
		}
		return l;
    }

	public void set(int index, String value) // Set value to current.data
	{
		Node current = head;
		int counter = 0;
		
		while (current != null && counter != index)
		{		
				counter++;
				current = current.getNext();
		}
			
		if (current != null)
			current.setData(value);
	/*Set the Node at index to contain value
	If index is invalid, do nothing.*/
	}
	
	public String get(int index) //Returns the value (not the Node) at index.
	{
		Node current = head;
		int counter = 0; //Begin looking at the first element of the linked list at index 0
		
			while (current != null)
			{
				if (counter == index)
					return current.getData(); //returns the value (not the Node) at indext once we increament counter sequentially
				counter++;
				current = current.getNext();
			}	
			
		return null; //If something does not exist, return null.
		/*If index is out of bounds, return null.*/
	}
	
    public void insert(int index, String value) //Need to check this
	{
		if (index == 0) //If at index 0, then insert into the head/beginning of the linked list
			addFront(value);

		else
		{
			int counter = 0; //start at index 0 for insertion
			
			Node newNode = new Node(value); // make new node
		
			Node temp = head; // make a temp node
			
			while (counter + 1 < index && temp.getNext() != null) //Will this work? Does it work for edge cases?
			{
				temp = temp.getNext();
				counter++;
			}
			
				if (counter == index) // Will this work?
				{
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
				}
		}
	// move temp down the list until it's right BEFORE the insertion point

	// insert 
    }
	
    public void remove(int index) //Remove a node
	{
		if (index == 0 && head != null)
			head = head.getNext();
		
		else
		{
			Node prev = null;
			Node temp = head; // make a tmp node
			
			int counter = 0;

			for (counter=0; temp != null && counter < index; counter++) //Will this work? Even for edge cases?
			{	
				prev = temp;
				temp = temp.getNext();
			}
			
			if (index <= counter)
			prev.setNext(temp.getNext()); //Skip one and go to the next node
		}
	// move tmp down the list until it's BEFORE the node we want to delete

	// change tmp's next pointer to skip the node we are deleting 
    }
    
	public int search(String key) //Does this work? Need to check
	{
		int counter = 0;
		Node temp = head;
		
		while (temp != null)
		{
			if (temp.getData() == key)
				return counter;
			counter++;
			temp = temp.getNext();
		}
		return -1;	
	/*Returns the index of the first time key occurs in the list.
	Returns -1 if key is not found.*/
	}
}