package IfStatements;

import java.util.Scanner;

public class TwoQuestions2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String choiceA;
		String choiceB;
		
		System.out.println("Think of something and I'll try to guess it.");
		System.out.println("Question 1) Does it stay inside, outside or both?");
		choiceA = keyboard.next();
		System.out.println("Question 2) Is it a living thing?");
		choiceB = keyboard.next();
		
		if (choiceA.equals("inside") && choiceB.equalsIgnoreCase("yes"))
		{
			System.out.println("You are obviously thinking of a canary.");
		}
		
		if (choiceA.equals("inside") && choiceB.equalsIgnoreCase("no"))
		{
			System.out.println("You are thinking of a dead rat.");
		}
		
		if (choiceA.equals("outside") && choiceB.equalsIgnoreCase("yes"))
		{
			System.out.println("It's gotta be a tiger!");
		}
		
		if (choiceA.equals("outside") && choiceB.equalsIgnoreCase("no"))
		{
			System.out.println("A child's playset?");
		}
		
		if (choiceA.equals("both") && choiceB.equalsIgnoreCase("yes"))
		{
			System.out.println("It's a creepy crawly spider!");
		}
		
		if (choiceA.equals("both") && choiceB.equalsIgnoreCase("no"))
		{
			System.out.println("A dead bug of course.");
		}

	}

}
