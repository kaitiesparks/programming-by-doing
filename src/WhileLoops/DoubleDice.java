package WhileLoops;

import java.util.Random;

public class DoubleDice {
	public static void main(String[] args) {
		Random r = new Random();
		int choice1 = 1;
		int choice2 = 2;
		System.out.println("Here comes the dice!");
		
		while (choice1 != choice2)
		{
			choice1 = 1 + r.nextInt(6);
			choice2 = 1 + r.nextInt(6);
			System.out.println("Roll #1: " + choice1);
			System.out.println("Roll #2: " + choice2);
			System.out.println("The total number is " + (choice1 + choice2));
			System.out.println();
		}

	}

}
