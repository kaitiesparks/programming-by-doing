package IfStatements;

public class ElseAndIf {

	public static void main(String[] args) {
		{
			int people = 30;
			int cars = 40;
			int buses = 15;

			if ( cars > people )
			{
				System.out.println( "We should take the cars." );
			}
			//It reads as a syntax error if you remove the if from the else if statement.
			//It makes a difference because the computer doesn't know that it is a continuation of the previous if statement.
			else if ( cars < people )
			{
				System.out.println( "We should not take the cars." );
			}
			else
			{
				System.out.println( "We can't decide." );
			}


			if ( buses > cars )
			{
				System.out.println( "That's too many buses." );
			}
			else if ( buses < cars )
			{
				System.out.println( "Maybe we could take the buses." );
			}
			else
			{
				System.out.println( "We still can't decide." );
			}


			if ( people > buses )
			{
				System.out.println( "All right, let's just take the buses." );
			}
			else
			{
				System.out.println( "Fine, let's stay home then." );
			}
			
			//If the if statement is not true then it prints out the else comment.

		}
	}
}

