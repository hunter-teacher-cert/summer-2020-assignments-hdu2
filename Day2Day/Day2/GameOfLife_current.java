import java.io.*;
import java.util.*;
/*
  2D array
  set up
  change values in it
  a way of applying the GOL rules
 */
class GameOfLife_current
{
    /*
      create a new 2D array, fill it with ' '
      representing that the entire board is empty.
     */
    public static char[][] createNewBoard(int rows, int cols)
	{
		char[][] board = new char[rows][cols];
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
				board[r][c] = ' ';
			}
		}
		return board;
    }
    // printBoard method - prints the board of the game
    public static void printBoard(char[][] board)
	{
		for (int r = 0; r < board.length; r++)
		{
			for (int c = 0; c < board[r].length; c++)
			{
				System.out.printf("%c",board[r][c]);
			}

			System.out.println();
		}

		System.out.println("\n\n------------------\n\n");
    }
    /*
      set the cell (r,c) to value
    */
    public static void setCell(char[][] board, int r, int c, char val)
	{
		if (r>=0 && r<board.length && c>=0 && c<board[r].length)
		{
			board[r][c] = val;
		}
    }
    /*
       Count and return the number of living neigbords around board[r][c]
       approach 1 - lots of if statements
       approach 2 - you can loop over the grid from board[r-1][c-1]
                    to board[r+1][c+1]
    */
    public static int countNeighbours(char[][] board, int row, int col)
	{
		int counter = 0; // this keeps track of live neighbors
		int start_col, start_row; // declare variables for the beginning of row and column

		if (row == 0) //if row is equal to 0, start there
			start_row = 0;
		else 				//else start one row before the given row
			start_row = row - 1;

		if (col == 0) // if column is equal to 0, start there
			start_col = 0;
		else			// else start one column before the given column
			start_col = col - 1;

		for (int i = start_row; i <= row + 1 && i < board.length; i++) // check one row before and one row after the given row
		{
			for (int j = start_col; j <= col + 1 && j <board[row].length; j++) //check one column before and one column after the given column
			{
				if (board[i][j] == 'X') // when board space is equal to x (alive), then increment counter by 1
					counter++;
			}
		}

		if (board[row][col] == 'X') // we need to not count the center cell in the 3 by 3 grid
			counter--;

		return counter;
    }
    /*
      given a board and a cell, determine, based on the rules for
      Conway's GOL if the cell is alive ('X') or dead (' ') in the
      next generation.  ********************************************
     */
    public static char getNextGenCell(char[][] board,int row, int col)
	{
	// calculate the number of living neighbors around board[r][c]
	// determine if board[r][c] is living or dead
	//    if living and 2 3 neighbors then remain alive
	//    if dead and 3 neighbors then become alive
	/* from wikipedia
		These rules, which compare the behavior of the automaton to real life, can be condensed into the following:
		Any live cell with two or three live neighbours survives.
		Any dead cell with three live neighbours becomes a live cell.
		All other live cells die in the next generation. Similarly, all other dead cells stay dead.*//*(board[row][col] == 'X' && ((neighbors == 2) || (neighbors == 3)))*/

		int neighbors = countNeighbours(board, row, col);
		if ((board[row][col] == 'X' && neighbors == 2) || (board[row][col] == 'X' && neighbors == 3))
			return 'X';
		else if (board[row][col] == ' ' && neighbors == 3)
			return 'X';
		else
			return ' ';
    }
    /*
      scan the board to generate a NEW board with the
      next generation *****************************************
    */
    public static char[][] generateNextBoard(char[][] board)
	{
		char newBoard[][] = new char[25][25];

		// fill the new board
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				newBoard[i][j] = getNextGenCell(board, i, j);

		return newBoard;
    }

	public static void GameSetUp (char[][] board)
	{
    for(int i = 8; i < 18; i++)
      setCell(board, 12, i, 'X');
	}

    // main method
    public static void main(String[] args)
	{
		char[][] board;
		board = createNewBoard(25,25);

		GameSetUp(board);

		//Generate a new board
		for(int i = 0; i < 5; i++)
		{
			board = generateNextBoard(board);
			printBoard(board);
		}

  } // end of main */

} // end of Game of Life
