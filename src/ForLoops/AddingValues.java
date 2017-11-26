package ForLoops;

import java.util.Scanner;

public class AddingValues {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		int amount = 0;
		
		System.out.println("Number: ");
		number = keyboard.nextInt();
		
		for (int n = 1 ; n <= number ; n ++)
		{
			System.out.println(n);
			amount+= n;
		}
		
		System.out.println("The sum is " + amount + ".");
	}

}
