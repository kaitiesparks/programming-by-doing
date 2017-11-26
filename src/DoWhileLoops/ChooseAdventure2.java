package DoWhileLoops;

import java.util.Scanner;

public class ChooseAdventure2 {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int nextroom = 1;
		String choice = "";

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You're standing at the bottom of the stairs. Will you go \"upstairs\" or go to the \"livingroom\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("upstairs") )
					nextroom = 2;
				else if ( choice.equals("livingroom") )
					nextroom = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "You're standing at the top of the stairs and the door at the end of the hall seems to be open. Will you go \"in\" or go \"back\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("in") )
					nextroom = 4;
				else if (choice.equals("back"))
						nextroom = 1;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 3 )
			{
				System.out.println( "There isn't much to see in the livingroom except for a rat sitting on the couch." );
				System.out.println("You throw something at the rat and it gets angry and jumps on your face and starts biting you.");
				System.out.println("Will you run? Y/N?");
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equalsIgnoreCase("Y") )
					nextroom = 6;
				else if ( choice.equalsIgnoreCase("N") )
					nextroom = 7;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 4 )
			{
				System.out.println( "In the room you hear the closet door suddenly close. Will you \"inspect\" it or \"run\" the other way?" );
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("inspect") )
					nextroom = 5;
				else if ( choice.equals("run") )
					nextroom = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 5 )
			{
				System.out.println( "You throw open the door and to your surprise there lays a cat and her litter of newborn kittens." );
				System.out.println( "You want to pet them but all of a sudden the father cat jumps on your back from the top shelf" );
				System.out.println( "and starts attacking you." );
				System.out.println();
				System.out.println( "You run out of the house crying." );
				nextroom = 0;
			}
			if ( nextroom == 6 )
			{
				System.out.println("You can't see because the rat is covering your eyes and you fall through a hole in the floor and die.");
				nextroom = 0;
			}
			if ( nextroom == 7 )
			{
				System.out.println("You stand there looking like an idiot while the rat gnaws on your face. You eventually die of blood loss." );
				nextroom = 0;
			}

		}

		System.out.println( "\nThe game is over. The next episode can be downloaded for only 800 Microsoft points!" );
	}

}
