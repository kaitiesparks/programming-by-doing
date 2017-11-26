package WhileLoops;

import java.util.Scanner;

public class AddingValues {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice;
		int total = 0;
		
		System.out.println("I will add up the number you give me.");
		choice = keyboard.nextInt();
		total = choice + total;

		while (choice != 0)
		{
			System.out.println("The total so far is " + total + ".");
			choice = keyboard.nextInt();
			total = choice + total;
		}
		
		System.out.println("The total is " + total + ".");
	}

}
