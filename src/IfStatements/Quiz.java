package IfStatements;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int score = 0;
		
		System.out.println("Are you ready for a quiz? Y/N?");
		keyboard.next();
		
		System.out.println("Alright! Let's begin.");
		System.out.println();
		System.out.println("What is 9 * 3?");
		System.out.println("1) 32");
		System.out.println("2) 18");
		System.out.println("3) 27");
		int choice = keyboard.nextInt();
		
		if (choice == 3)
		{
			System.out.println("Good job!");
			score ++;
		}
		
		else
		{
			System.out.println("Nope, sorry.");
		}
		
		System.out.println();
		System.out.println("Which is a desert?");
		System.out.println("1) Ice cream");
		System.out.println("2) Sahara");
		System.out.println("3) Cake");
		int choice2 = keyboard.nextInt();
		
		if (choice2 == 2)
		{
			System.out.println("Wow, look at you!");
			score ++;
		}
		
		else
		{
			System.out.println("Wrong.");
		}
		
		System.out.println(); 
		System.out.println("Ok, final question.");
		System.out.println(); 
		System.out.println("What is the first planet in our solar system?");
		System.out.println("1) Mercury");
		System.out.println("2) Pluto");
		System.out.println("3) Mars");
		int choice3 = keyboard.nextInt();
		
		if (choice3 == 1)
		{
			System.out.println("Great job!");
			score ++;
		}
		
		else
		{
			System.out.println("Sorry, wrong answer.");
		}
		
		System.out.println();
		System.out.println("You scored " + score + " out of 3.");

	}

}
