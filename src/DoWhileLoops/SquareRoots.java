package DoWhileLoops;

import java.util.Scanner;

public class SquareRoots {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		
		System.out.println("SQUARE ROOT!");
		System.out.println("Enter a number: ");
		number = keyboard.nextInt();
		
		while (number < 0 )
		{
			System.out.println("You can't do the square root of a negative number, try again.");
			number = keyboard.nextInt();
		}
		
		System.out.println("The square root of " + number + " is " + Math.sqrt(number) + ".");

	}

}
