package IfStatements;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number;
		int choice = 1 + r.nextInt(10);
		
		System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");
		number = keyboard.nextInt();
		
		if (number == choice)
		{
			System.out.println("Aww man, you got me!");
		}
		else if (number != choice)
		{
			System.out.println("Haha, you're wrong, my number was " + choice + "!");
		}

	}

}
