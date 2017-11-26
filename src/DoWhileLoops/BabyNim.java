package DoWhileLoops;

import java.util.Scanner;

public class BabyNim {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		String choice;
		int pileA = 6;
		int pileB = 4;
		int pileC = 8;

		

		while ( pileA > 0 || pileB > 0 || pileC > 0)
		{
		System.out.println("A: "+ pileA + "      B:" + pileB + "      C:" + pileC);
		System.out.println("Choose a pile: ");
		choice = keyboard.next();
		
			if (choice.equalsIgnoreCase("A"))
			{
				System.out.println("How many to remove from pile A: ");
				number = keyboard.nextInt();
				pileA = pileA - number;
			}
			else if (choice.equalsIgnoreCase("B"))
			{
				System.out.println("How many to remove from pile B: ");
				number = keyboard.nextInt();
				pileB =pileB - number;
			}
			else if (choice.equalsIgnoreCase("C"))
			{
				System.out.println("How many to remove from pile C: ");
				number = keyboard.nextInt();
				pileC = pileC - number;
			}
		}
		System.out.println("A: "+ pileA + "      B:" + pileB + "      C:" + pileC);
	}

}
