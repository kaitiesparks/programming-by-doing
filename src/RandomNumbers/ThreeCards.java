package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class ThreeCards {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice = 1 + r.nextInt(3);
		int number;
		
		System.out.println("You slide up to the card table and the cardholder lays down 3 cards. Can you guess which one is the Ace?");
		System.out.println("   ##   ##   ##");
		System.out.println("   ##   ##   ##");
		System.out.println("    1    2    3");
		number = keyboard.nextInt();
		
		if (choice == number && choice == 1)
		{
			System.out.println("Great job! The cardholder reluctantly hands over the money.");
			System.out.println("    AA   ##   ##");
			System.out.println("    AA   ##   ##");
		}
		else if (choice == number && choice == 2)
			{
				System.out.println("Great job! The cardholder reluctantly hands over the money.");
				System.out.println("    ##   AA   ##");
				System.out.println("    ##   AA   ##");
			}
		else if (choice == number && choice == 3)
			{
				System.out.println("Great job! The cardholder reluctantly hands over the money.");
				System.out.println("    ##   ##   AA");
				System.out.println("    ##   ##   AA");
			}
		
		if (choice > number && choice == 1)
		{
			System.out.println("Sorry, fork over the money! The ace was card number " + choice + ".");
			System.out.println("    AA   ##   ##");
			System.out.println("    AA   ##   ##");
		}
		else if (choice > number && choice == 2)
			{
				System.out.println("Sorry, fork over the money! The ace was card number " + choice + ".");
				System.out.println("    ##   AA   ##");
				System.out.println("    ##   AA   ##");
			}
		else if (choice > number && choice == 3)
			{
				System.out.println("Sorry, fork over the money! The ace was card number " + choice + ".");
				System.out.println("    ##   ##   AA");
				System.out.println("    ##   ##   AA");
			}

		if (choice < number && choice == 1)
		{
			System.out.println("Sorry, not this time. Give the cardholder your money! The ace was card number " + choice + ".");
			System.out.println("    AA   ##   ##");
			System.out.println("    AA   ##   ##");
		}
		else if (choice < number && choice == 2)
			{
				System.out.println("Sorry, not this time. Give the cardholder your money! The ace was card number " + choice + ".");
				System.out.println("    ##   AA   ##");
				System.out.println("    ##   AA   ##");
			}
		else if (choice < number && choice == 3)
			{
				System.out.println("Sorry, not this time. Give the cardholder your money! The ace was card number " + choice + ".");
				System.out.println("    ##   ##   AA");
				System.out.println("    ##   ##   AA");
			}
}
}