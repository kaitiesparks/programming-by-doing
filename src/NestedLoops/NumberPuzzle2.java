package NestedLoops;

import java.util.Scanner;

public class NumberPuzzle2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice;

		do
		{		
			System.out.println("1. Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2. Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3. Quit");
			choice = keyboard.nextInt();

			if (choice == 1)
			{
				sum();
			}
			else if (choice == 2)
			{
				sum2();
			}
			else
			{
				System.out.println("Error.");
			}

			System.out.println();
		}
		while (choice != 3);
		System.out.println("Goodbye.");
	}

	public static void sum()
	{
		for (int a = 1; a <= 5; a++)
		{
			for (int b = 0; b <= 9; b++)
			{
				if (a == 5 && b == 7)
				{
					break;
				}

				if ( a + b > 10)
				{
					System.out.println(a + " + " + b + " = " + (a + b));
				}
			}
		}
	}

	public static void sum2()
	{
		for (int a = 1; a <= 9; a++)
		{
			for (int b = 0; b <= 9; b++)
			{
				int c = ((a * 10) + b) - ((b * 10) + a);

				if (a + b == c)
				{
					System.out.println(a + "" + b);
				}
			}
		}
	}
}
