package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice = 1 + r.nextInt(100);
		int number;
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		number = keyboard.nextInt();
		
		if (number > choice)
		{
			System.out.println("Sorry, too high! The number I was thinking of it " + choice + ".");
		}
		else if (number < choice)
		{
			System.out.println("Sorry, too low. I was thinking of " + choice + ".");
		}
		else if (number == choice)
		{
			System.out.println("That's right, how'd you know?");
		}

	}

}
