package DoWhileLoops;

import java.util.Scanner;

public class Nim {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		String choice;
		int pileA = 6;
		int pileB = 4;
		int pileC = 8;
		String player1;
		String player2;
		int turn = 1;

		System.out.println("Player 1, enter your name: ");
		player1 = keyboard.nextLine();
		System.out.println("Player 2, enter your name: ");
		player2 = keyboard.nextLine();


		while ( pileA > 0 || pileB > 0 || pileC > 0)
		{
			boolean right = false;

			System.out.println("A: "+ pileA + "      B:" + pileB + "      C:" + pileC);

			if (turn == 1)
			{
				System.out.println(player1 + " choose a pile: ");
			}
			else if(turn == 2)
			{
				System.out.println(player2 + " choose a pile: ");
			}

			choice = keyboard.next();

			if (choice.equalsIgnoreCase("A"))
			{
				if (pileA == 0)
				{
					System.out.println("Sorry, pile A is already zero. Try again. Choose a pile: ");
				}
				else
				{
					System.out.println("How many to remove from pile A: ");
					number = keyboard.nextInt();
					if (pileA - number < 0)
					{
						System.out.println("Sorry, pile A doesn't have that many. Try again.");
					}
					else if (number <= 0)
					{
						System.out.println("Sorry, the number must be more than 0. Try again.");
					}
					else 
					{
						right = true;
						pileA = pileA - number;
					}
				}
			}
			else if (choice.equalsIgnoreCase("B"))
			{
				if (pileB == 0)
				{
					System.out.println("Sorry, pile B is already zero. Try again. Choose a pile: ");
				}
				else
				{
					System.out.println("How many to remove from pile B: ");
					number = keyboard.nextInt();
					if (pileB - number < 0)
					{
						System.out.println("Sorry, pile B doesn't have that many. Try again.");
					}
					else if (number <= 0)
					{
						System.out.println("Sorry, the number must be more than 0. Try again.");
					}
					else 
					{
						right = true;
						pileB = pileB - number;
					}
				}
			}

			else if (choice.equalsIgnoreCase("C"))
			{
				if (pileC == 0)
				{
					System.out.println("Sorry, pile C is already zero. Try again. Choose a pile: ");
				}
				else
				{
					System.out.println("How many to remove from pile C: ");
					number = keyboard.nextInt();
					if (pileC - number < 0)
					{
						System.out.println("Sorry, pile C doesn't have that many. Try again.");
					}
					else if (number <= 0)
					{
						System.out.println("Sorry, the number must be more than 0. Try again.");
					}
					else 
					{
						right = true;
						pileC = pileC - number;
					}
				}
			}
			if (right)
			{
				if (pileA + pileB + pileC == 1)
				{
					break;
				}
				if (turn == 1)
				{
					turn = 2;
				}
				else 
				{
					turn = 1;
				}
			}
		}
		
		if (turn == 1)
		{
			System.out.println(player1 + ", you win! Great job.");
		}
		else if (turn == 2)
		{
			System.out.println(player2 + ", you win! Great job.");
		}
		System.out.println("A: "+ pileA + "      B:" + pileB + "      C:" + pileC);
	}

}