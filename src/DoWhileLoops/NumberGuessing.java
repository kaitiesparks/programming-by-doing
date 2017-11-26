package DoWhileLoops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice = 1 + r.nextInt(10);
		int number;
		int guesses = 1;
		
		System.out.println("I'm thinking of a number between 1-10. Try to guess it.");
		number = keyboard.nextInt();
		
		do
		{
			System.out.println("Sorry, try again.");
			number = keyboard.nextInt();
			guesses++;
		}while (number != choice);
		
		System.out.println("That's right!" +  " It took you " + guesses + " tries.");
		

	}

}
