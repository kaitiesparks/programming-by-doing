package ForLoops;

import java.util.Scanner;

public class CountingMachine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		
		System.out.println("Count to: ");
		number = keyboard.nextInt();
		
		for (int n = 0 ; n <= number ; n = n+1)
		{
			System.out.println( n );
		}
	}

}
