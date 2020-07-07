import java.io.*;
import java.util.*;
import java.util.Arrays;

public class SuperArray 
{
    private int[] data;
    private int numberElements;

	public SuperArray () //Default constructor
	{	
		this.data = new int [10]; //Setting the size of the array data
		this.numberElements = 0;  //Setting numberElements
	}
	
	public SuperArray (int num) //Overload constructor will allows specific size fo initial capacity.
	{
		this.data = new int[num]; //This can make the array size to be different from default size.
	}

	public void add (int value) //Add a new element to the array
	{
		if (data.length > numberElements) //If there is no more room in the array, do nothing.
		{
			data[numberElements] = value; //This routine will add the parameter value to the end of the SuperArray (don’t forget to update numberElements).
			this.numberElements += 1;
		}
		else 
		{
			grow();
			data[numberElements] = value; //This routine will add the parameter value to the end of the SuperArray (don’t forget to update numberElements).
			this.numberElements += 1;
		}
			
	}
	
	public void add(int index, int value)
	{	
		if(numberElements + 1 < data.length)
		{
			for (int i = data.length-1; i > index; i--) //Have the current item store to data[index +1} from data[index] and repeat for the remaining elements.
			{
				data[i] = data[i-1]; //out of bound error?
			}
			data[index] = value;
			this.numberElements += 1;	
		}
		else 
		{
			grow();
			for (int i = data.length-1; i > index; i--) //Have the current item store to data[index +1} from data[index] and repeat for the remaining elements.
			{
				data[i] = data[i-1];
			}
			data[index] = value;
			this.numberElements += 1;	
		}
		
	}
	
	public int set (int index, int newValue)
	{
		int oldValue =  data[index];
		
		
	}
	public int get(int index)  //return the value at location index from the array. If index is past the last element, return -1.
	{
		if (index > numberElements) //Check to see if index is greater than numberElements, if so return -1.
			return -1;
		else
			return data[index];  //Return the value at location index in the array.		
	}	
	
	public void remove(int index)
	{
		if(numberElements > index)
		{
			for (int i = index; i < data.length-1; i++) //Have the current item store to data[index +1} from data[index] and repeat for the remaining elements.
			{
				data[i] = data[i+1]; //Bound resolved.
			}
			numberElements--;
		}
	}
		
	  public boolean isEmpty()
	  {
		return numberElements == 0;
	  }

	  public String toString()
	  {
		String s = "";
		for (int i = 0; i < numberElements; i++) 
		{
			s = s + data[i] + ", ";
		}
		return s;
	  }
	  
	  public String debug()
	  {
		String s = "";
		s = "Size: " + this.data.length;
		s = s + " LastItem: " + numberElements + "  Data: ";
		for (int i = 0; i < numberElements; i++) 
		{
			s = s + data[i] + ", ";
		}
		s = s + "\n";
		return s;
	  }

	  private void grow()
	  {
		int [] data2 = new int [data.length+10]; //Increase the size of the array by 10. (create a new array with extra space)
			for (int i = 0; i <data.length; i++) // copy over all the elements from the old array to the new one
			{
				data2[i] = data[i];
			}
		data = data2; // point data to the new array
	  }

}	