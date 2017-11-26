package DoWhileLoops;

import java.util.Random;

public class DoubleDice2 {

		public static void main(String[] args) {
			Random r = new Random();
			int choice1;
			int choice2;
			System.out.println("Here comes the dice!");
			
			do
			{
				choice1 = 1 + r.nextInt(6);
				choice2 = 1 + r.nextInt(6);
				System.out.println("Roll #1: " + choice1);
				System.out.println("Roll #2: " + choice2);
				System.out.println("The total number is " + (choice1 + choice2));
				System.out.println();
			}while (choice1 != choice2);

		}

	}