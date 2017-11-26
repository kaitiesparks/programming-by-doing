package IfStatements;

import java.util.Scanner;

public class AgeMessage3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("What is your name?");
		name = keyboard.next();
		System.out.println("What is your age?");
		age = keyboard.nextInt();
		
		System.out.println("Your name: " + name);
		System.out.println("Your age: " + age);

		if (age < 16)
		{
			System.out.println("You can't drive.");
		}
		
		if (age < 18 && age >= 16)
		{
			System.out.println("You can't vote.");
		}
		
		if (age < 25 && age >= 19)
		{
			System.out.println("You can't rent a car.");
		}
		
		if (age >= 25)
		{
			System.out.println("You can do whatever you want.");
		}
	}

}
