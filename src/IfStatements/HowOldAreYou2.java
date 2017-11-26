package IfStatements;

import java.util.Scanner;

public class HowOldAreYou2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		
		System.out.println("What is your name?");
		name = keyboard.next();
				
		System.out.println("Ok, " + name + ", How old are you?");
		age = keyboard.nextInt();
		
		if (age < 16)
		{
			System.out.println("You can't drive.");
		}
		
		else if (age < 18)
		{
			System.out.println("You can't vote.");
		}
		
		else if (age < 25)
		{
			System.out.println("You can't rent a car.");
		}
		
		else
		{
			System.out.println("You can do whatever you want.");
		}	
	}

}
