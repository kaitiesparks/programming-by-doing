package Functions;

import java.util.Scanner;

public class BabyCalculator {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double a = -1;
		double b, c;
		String op;

		do
		{				
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if (a == 0)
			{
				break;
			}

			if ( op.equals("+") )
			{
				c = a + b;
			}
			else if (op.equals("-"))
			{
				c = a - b;
			}
			else if (op.equals("*"))
			{
				c = a * b;
			}
			else if (op.equals("/"))
			{
				c = a / b;
			}
			else if (op.equals("^"))
			{
				c = a;
				for (int n = 1; n < b; n++)
				{
					c *= a;
				}
			}
			else if (op.equals("%"))
			{
				while (a > b)
				{
					a -= b;
				}
				c = a;
			}
			else if (op.equals("!"))
			{
				for (c = 1; a > 1; a--)
				{
					c *= a;
				}
			}
			else 
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);
		} 
		while ( true );
		System.out.println("Goodbye.");
	}

}
