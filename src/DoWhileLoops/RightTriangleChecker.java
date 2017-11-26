package DoWhileLoops;

import java.util. Scanner;

public class RightTriangleChecker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int side1;
		int side2;
		int side3;

		System.out.println("Enter three integers: ");
		System.out.println("Side 1: ");
		side1 = keyboard.nextInt();
		System.out.println("Side 2: ");
		side2 = keyboard.nextInt();


		while (side1 > side2)
		{
			System.out.println(side2 + " is smaller than " + side1 + ". Try again.");
			side2 = keyboard.nextInt();
		}

		System.out.println("Side 3: ");
		side3 = keyboard.nextInt();

		while (side2 > side3)
		{
			System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
			side3 = keyboard.nextInt();
		}
		
		System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3 + ".");
		
		if ((side1 * side1) + (side2 * side2) == (side3 *side3))
		{
			System.out.println("These do make a right triangle. Great job!");
		}

		else
		{
			System.out.println("These do not make a right triangle.");
		}
	}

}
