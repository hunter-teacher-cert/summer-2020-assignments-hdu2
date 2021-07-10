import java.io.*;
import java.util.*;

public class Print2d_Arraynew
{	
	public static void main(String[] args) //Main Program
	{
    int rows = 20;
    int cols = 20;

    int[][] grid = new int[rows][cols];

    print2d(grid);
    System.out.println();
	
	rowPop(grid, 2, 4);
	print2d(grid);
	System.out.println();
	
	colPop(grid, 8, 5);
	print2d(grid);
	System.out.println();
	
	invert(grid);
	print2d(grid);
	System.out.println();
	
	print2d(grid);
	
	diagonal(grid, 3, 5, 2, 10);
	//diagonal(grid, 6, 8, 1, 12); //Going out of bound when 2nd diagonal is drawn, do I need to re-in
	print2d(grid);

	} //End of Main 

	public static void print2d(int[][] d2) //2D Arrary with 000 entires
	{

		for (int row =0; row < d2.length; row++)
		{
			for (int col=0; col < d2[row].length; col++) 
				System.out.printf("%03d ", d2[row][col]);
		//end c for 2D array
		System.out.println();
		} //end r for 2D array
	}//end print2d Method

	public static void rowPop(int[][] d2, int row, int value) 
	{
			for (int j = 0; j < d2[row].length; j++)
					d2[row][j] = value; //Set value to the whole rth row entries. 
	}//end rowPop

	public static void colPop(int[][] d2, int col, int value) 
	{
			for (int i = 0; i < d2.length; i++)
				d2[i][col] = value; // Set value to the whole jth column entries. 
		
	} //end colPop
	
	public static void invert(int[][] d2) //This goes through d2 and modifies each element
	{
		for (int i = 0; i < d2.length; i++)
		{
			for (int j = 0; j < d2[i].length; j++)
			{
				if (d2[i][j] == 0 )	// All 0s should become 255
					d2[i][j] = 255;
				else 
					d2[i][j] = 0; // Otherwise, set 0 to each entry in the 2d array 
			}	
		}
	}

	public static void diagonal(int[][] d2, int row, int col, int direction, int value) 
	{
		while (row < d2.length && col < d2[row].length && row >= 0 && col >= 0)
		{
			d2[row][col] = value;
			if (direction == 0) //Set value to entry of r row and c column, and entries up and to the left.
			{
				row --;
				col --;
			}
			else if (direction == 1) //Set value to entry of r row and c column, and entries up and to the right.
			{
				row --;
				col ++;
			}
			else if (direction == 2) //Set value to entry of r row and c column, and entries down and to the left.
			{
				row ++;
				col --;
			}
			else					//Set value to entry of r row and c column, and entries down and to the right.
			{
				row ++;
				col ++;
			}
		}
	}//end diagonal function
}//end of class