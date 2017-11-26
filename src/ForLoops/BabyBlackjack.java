package ForLoops;

import java.util.Random;

public class BabyBlackjack {

	public static void main(String[] args) {
		Random r = new Random();
		int player1 = 1 + r.nextInt(10);
		int player2 = 1 + r.nextInt(10);
		int dealer1 = 1 + r.nextInt(10);
		int dealer2 = 1 + r.nextInt(10);
		
		System.out.println("Baby Blackjack!");
		System.out.println("You drew " + player1 + " and " + player2 + ".");
		System.out.println("Your total is " + (player1 + player2) + ".");
		System.out.println("The dealer drew " + dealer1 + " and " + dealer2 + ".");
		System.out.println("The dealer's total is " + (dealer1 + dealer2) + ".");
		
		if ((dealer1 + dealer2) > (player1 + player2))
		{
			System.out.println("Dealer wins!");
		}
		
		else 
		{
			System.out.println("You win!");
		}

	}

}
