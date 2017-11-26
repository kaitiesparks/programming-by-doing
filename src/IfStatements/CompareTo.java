package IfStatements;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String s1 = "Carswell";
		String s2 = "Jones";
		String s3 = "Smith";
		String s4 = "Young";
		String name;
		
		System.out.println("What's your last name?");
		name = keyboard.next();
		
		if (name.compareTo(s1) < 0)
		{
			System.out.println("You don't have to wait long, " + name + ".");
		}
		else if (name.compareTo(s2) < 0)
		{
			System.out.println("That's not bad, " + name + ".");
		}
		else if (name.compareTo(s3) < 0)
		{
			System.out.println("Looks like a bit of a wait, " + name + ".");
		}
		else if (name.compareTo(s4) < 0)
		{
			System.out.println("Not going anywhere for a while, " + name + "?");
		}


	}

}
