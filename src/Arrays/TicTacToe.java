package Arrays;

import java.util.Scanner;

public class TicTacToe {
	static char[][] board = new char[3][3];
	static char player = 'X';

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		initBoard();

		while (!checkWinner() && !checkTie())
		{
			String choice;
			displayBoard();

			do
			{
				System.out.print(player + ", choose your location (row, column): ");
				choice = keyboard.nextLine();
				System.out.println();
			} while (board[Character.getNumericValue(choice.charAt(0))][Character.getNumericValue(choice.charAt(3))] != ' ');

			board[Character.getNumericValue(choice.charAt(0))][Character.getNumericValue(choice.charAt(3))] = player;

			if (player == 'X')
			{
				player = 'O';
			}
			else 
			{
				player = 'X';
			}
		}
		displayBoard();
		if (!checkTie())
		{
			if (player == 'X')
			{
				System.out.println("O is the winner.");
			}
			else
			{
				System.out.println("X is the winner.");
			}
		}
		else
		{
			System.out.println("The game is a tie.");
		}
	}

	public static boolean checkWinner()
	{
		for (int i = 0; i < 3; i++)
		{
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
			{
				return true;
			}
			else if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
			{
				return true;
			}
		}
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
		{
			return true;
		}
		else if (board[2][0] != ' ' && board[2][0] == board[1][1] && board[1][1] == board[0][2])
		{
			return true;
		}
		return false;
	}

	public static boolean checkTie()
	{
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				if (board[x][y] == ' ')
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
}
