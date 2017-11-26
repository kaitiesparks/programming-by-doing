package ForLoops;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int player1 = 2 + r.nextInt(10);
		int player2 = 2 + r.nextInt(10);
		int dealer1 = 2 + r.nextInt(10);
		int dealer2 = 2 + r.nextInt(10);
		int playerTotal = player1 + player2;
		int dealerTotal = dealer1 + dealer2;
		String choice;

		System.out.println("Blackjack!");
		System.out.println("You drew " + player1 + " and " + player2 + ".");
		System.out.println("Your total is " + playerTotal + ".");
		System.out.println("The dealer has a " + dealer1 + " showing, and a hidden card.");
		System.out.println("The dealer's total is hidden");

		while (playerTotal < 21)
		{
			System.out.println("Would you like to \"hit\" or \"stay\"?");
			choice = keyboard.next();

			if (choice.equalsIgnoreCase("hit"))
			{
				player1 = 2 + r.nextInt(10);
				playerTotal = player1 + playerTotal;
				System.out.println("You drew a " + player1 + ".");
				System.out.println("Your total is " + playerTotal + ".");
			}
			else if (choice.equalsIgnoreCase("stay"))
			{
				System.out.println("Ok, dealers turn.");
				System.out.println("The hidden card was " + dealer2 + ".");
				System.out.println("The dealer's total is " + dealerTotal + ".");
				break;
			}
		}

		if (playerTotal > 21)
		{
			System.out.println("You lose.");
		}
		else if (playerTotal == 21)
		{
			System.out.println("You win!");
		}
		else
		{
			while (dealerTotal < 21)
			{
				if (dealerTotal < 18 || playerTotal > 18)
				{
					dealer1 = 2 + r.nextInt(10);
					dealerTotal = dealer1 + dealerTotal;
					System.out.println("The dealer chooses to hit.");
					System.out.println("The dealer draws a " + dealer1 + ".");
					System.out.println("The dealers new total is " + dealerTotal + ".");
				}
				else 
				{
					System.out.println("Dealer stays.");
					break;
				}
			}

			if (dealerTotal > 21)
			{
				System.out.println("Dealer loses.");
			}
			else if (dealerTotal == 21)
			{
				System.out.println("Dealer wins!");
			}
			else
			{
				if (dealerTotal >= playerTotal)
				{
					System.out.println("Dealer wins!");
				}
				else
				{
					System.out.println("You win!");
				}
			}
		}
	}
}
