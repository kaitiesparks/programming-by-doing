package ForLoops;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		
		        Scanner keyboard = new Scanner(System.in);

		        System.out.println( "Type in a message, and I'll display it ten times." );
		        System.out.print( "Message: " );
		        String message = keyboard.nextLine();

		        for ( int n = 2 ; n <= 10 ; n = n+2 )
		        {//int n = 2 means that the numbers displayed being with the number 2.
		         //n = n+2 means that the number ='s the number + 2 so it goes in multiples of 2.   
		        	System.out.println( n + ". " + message );
		        }

		    }
		}