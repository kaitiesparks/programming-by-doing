package IfStatements;

import java.util.Scanner;

public class GenderGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nameFirst;
		String nameLast;
		String gender;
		String choice;
		int age;
		
		System.out.println("What is your gender (M/F): ");
		gender = keyboard.next();
		System.out.println("First name: ");
		nameFirst = keyboard.next();
		System.out.println("Last name; ");
		nameLast = keyboard.next();
		System.out.println("Your age: ");
		age = keyboard.nextInt();
		
		if (gender.equalsIgnoreCase("M") && age < 20)
		{
			System.out.println("I shall call you " + nameFirst + " " + nameLast + ".");
		}
		else if (gender.equalsIgnoreCase("M") && age > 20)
		{
			System.out.println("I shall call you Mr. " + nameFirst + " " + nameLast + ".");
		}
		
		if (gender.equalsIgnoreCase("F") && age < 20)
		{
			System.out.println("I shall call you Ms. " + nameFirst + " " + nameLast + ".");
		}
		else if (gender.equalsIgnoreCase("F") && age >= 20)
		{
			System.out.println("Are you married, " + nameFirst + " (Y/N)?");
			choice = keyboard.next();
			
			if (choice.equalsIgnoreCase("Y"))
			{
				System.out.println("Then I shall call you Mrs. " + nameFirst + " " + nameLast + ".");
			}
			else if (choice.equalsIgnoreCase("N"))
			{
				System.out.println("I shall call you Ms. " + nameFirst + " " + nameLast + ".");
			}
		}

	}

}
