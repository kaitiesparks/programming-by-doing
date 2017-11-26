package WhileLoops;

import java.util.Scanner;

public class Counting {
	
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int amount;

		System.out.println( "Tell me a message." );
		String message = keyboard.nextLine();
		System.out.print( "How many times would you like me to say it? " );
		amount = keyboard.nextInt();
		System.out.print( "Message: " );
		System.out.println();

		int n = 0;
		while (amount > 0 )
		{ 
			n = n + 10;
			System.out.println( (n) + ". " + message );
			amount--;
		}

	}
}
