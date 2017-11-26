package RandomNumbers;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();
		int choice1 = 1 + r.nextInt(6);
		int choice2 = 1 + r.nextInt(6);
		
		System.out.println("Here comes the dice!");
		System.out.println("Roll #1: " + choice1);
		System.out.println("Roll #2: " + choice2);
		System.out.println("The total number is " + (choice1 + choice2));

	}

}
