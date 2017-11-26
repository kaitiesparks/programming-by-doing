package IfStatements;

import java.util.Scanner; 

public class HowOldAreYou {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;

		System.out.print( "What is your name?");
		name = keyboard.next();
		
		System.out.print( "Ok, " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if (age < 16)
		{
			int ageDifference = 16 - age;
			System.out.println( "You can't drive, " + name + ". Wait " + ageDifference + " more year" + (ageDifference > 1 ? "s.": "."));
		}
		
		if (age < 18)
		{
			int ageDifference = 18 - age;
			System.out.println( "You can't vote, " + name + ". Wait " + ageDifference + " more year" + (ageDifference > 1 ? "s.": "."));
		}
		
		if (age < 25)
		{
			int ageDifference = 25 - age;
			System.out.println( "You can't rent a car, " + name + ". Wait " + ageDifference + " more year" + (ageDifference > 1 ? "s.": "."));
		}
		
		if (age >= 25)
		{
			System.out.println( "You can do anything that is legal, " + name + ".");
		}
	}

}
