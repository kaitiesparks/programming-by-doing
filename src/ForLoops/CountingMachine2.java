package ForLoops;

import java.util.Scanner;

public class CountingMachine2 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int from;
		int to;
		int by;
		
		System.out.println("Count from: ");
		from = keyboard.nextInt();
		System.out.println("Count to: ");
		to = keyboard.nextInt();
		System.out.println("Count by: ");
		by = keyboard.nextInt();

		for (int n = from ; n <= to ; n = n+by)
		{
			System.out.println( n );
		}
	}
}