package DoWhileLoops;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		int steps = 0;
		int biggestNumber = 0;
		

		System.out.println("Starting number: ");
		number = keyboard.nextInt();

		while (number != 1)
		{
			if (number % 2 == 0)
			{
				number = number/2;
			}

			else
			{
				number = number * 3 + 1;
			}
			System.out.println(number);
			steps++;
			if (number > biggestNumber)
			{
				biggestNumber = number;
			}
		}
		System.out.println("The biggest number is " + biggestNumber + " .");
		System.out.println("It took " + steps + " steps to complete.");
	}

}
