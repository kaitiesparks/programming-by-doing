package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice = 1 + r.nextInt(100);
		int number;
		int triesLeft = 7;
		int tries = 0;

		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		number = keyboard.nextInt();
		tries++;

		while (number != choice && tries < triesLeft)
		{	
			if (number < choice)
			{
				System.out.println("Sorry, too low.");
				number = keyboard.nextInt();
				tries++;
			}
			else if (number > choice)
			{
				System.out.println("Sorry too high.");
				number = keyboard.nextInt();
				tries++;
			}
		}
		
		if (number == choice)
		{
			System.out.println("That's right, how'd you know?");
		}
		
		else
		{
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
	}
}
