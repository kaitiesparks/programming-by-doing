package IfStatements;

import java.util.Scanner;

public class TwoQuestions {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String choiceA;
		String choiceB;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to think of it.");
		System.out.println("Question 1) Is it an animal, vegetable, or mineral? ");
		choiceA = keyboard.next();
		
		System.out.println("Is it bigger than a bread box?");
		choiceB = keyboard.next();
		
		if (choiceA.equals("animal"))
		{
			if (choiceB.equals("no"))
			{
				System.out.println("My guess is you are thinking of a bird.");
			}
			else if (choiceB.equals("yes"))
			{
				System.out.println("My guess you are thinking of an elephant.");
			}
		}
		
		else if (choiceA.equals("vegetable"))
		{
			if(choiceB.equals("no"))
			{
				System.out.println("My guess is you are thinking of a pineapple.");
			}

			else if (choiceB.equals("yes"))
			{
				System.out.println("My guess is you are thinking of a pumpkin.");
			}
		}
		else if (choiceA.equals("mineral"))
		{
			if (choiceB.equals("no"))
			{
				System.out.println("My guess is you are thinking of a pebble.");
			}

			else if (choiceB.equals("yes"))
			{
				System.out.println("My guess you are thinking of an ocean.");
			}
		}
		System.out.println("I would ask you if I'm right, but I don't actually care.");
	}

}
