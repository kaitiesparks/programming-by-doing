package IfStatements;

import java.util.Scanner;

public class ChooseAdventure {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String choiceA;
		
		System.out.println("You are in a haunted house. You hear a noise and want to investigate.");
		System.out.println("Will you go \"upstairs\" or into the \"livingroom\"?");
		choiceA = keyboard.next();
		
		if (choiceA.equalsIgnoreCase("upstairs"))
		{
			System.out.println("Upstairs you investigate the bathroom where you find a drippy faucet and clogged toilet.");
			System.out.println("Would you like to search the \"cabinets\" or the laundry \"hamper\"?");
			choiceA = keyboard.next();
			
			if(choiceA.equalsIgnoreCase("cabinets"))
			{
				System.out.println("You find a rat! Would you like to pet it? Yes/No");
				choiceA = keyboard.next();
				
				if (choiceA.equalsIgnoreCase("yes"))
				{
					System.out.println("The rat bites you and then runs off.");
				}
				else if (choiceA.equalsIgnoreCase("no"))
				{
					System.out.println("The rat jumps on your face and attacks you!");
				}
			}
			else if (choiceA.equalsIgnoreCase("hamper"))
			{
				System.out.println("You open the lid and find a $100 bill under someone's dirty underwear. Will you grab it? Yes/No");
				choiceA = keyboard.next();

				if (choiceA.equalsIgnoreCase("yes"))
				{
					System.out.println("Eww, you're gross but here's your $100. Don't spend it all in one place.");
				}
						
				else if (choiceA.equalsIgnoreCase("no"))
				{
					System.out.println("That's probably for the best. But as you put the lid back on a roach crawls up your arm.");
				}
			}
		}
		else if (choiceA.equalsIgnoreCase("livingroom"))
		{
			System.out.println("In the livingroom you find a couch pushed against a doorway, blocking your way to the kitchen.");
			System.out.println("Would you like to move the \"couch\" to get to the kitchen or \"look\" around the livingroom some more?");
			choiceA = keyboard.next();
			
			if (choiceA.equalsIgnoreCase("couch"))
			{
				System.out.println("You move the couch and walk into the kitchen.");
				System.out.println("Your stomach starts to growl so you look in the fridge for some food but all the food in there is gross.");
				System.out.println("Will you eat the food? Yes/No");
				choiceA = keyboard.next();
				
				if (choiceA.equalsIgnoreCase("yes"))
				{
					System.out.println("Nice job, you die of food poisoning.");
				}
				else if (choiceA.equalsIgnoreCase("No"))
				{
					System.out.println("You die of starvation...eventually.");
				}
			}
			else if (choiceA.equalsIgnoreCase("look"))
			{
				System.out.println("In a drawer you find a key. Will you explore and find what it unlocks? Yes/No");
				choiceA =keyboard.next();
				
				if (choiceA.equalsIgnoreCase("Yes"))
				{
					System.out.println("You find that it unlocks the basement door but it is so dark down there that when you take your first step");
					System.out.println("you fall down the stairs and die.");
				}
				else if (choiceA.equalsIgnoreCase("No"))
				{
					System.out.println("You leave the house not knowing what secrets it holds.");
				}
			}
		}
		

	}

}
