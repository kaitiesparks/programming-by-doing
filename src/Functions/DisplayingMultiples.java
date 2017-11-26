package Functions;

import java.util.Scanner;

public class DisplayingMultiples {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		
		System.out.println("Choose a number: ");
		number = keyboard.nextInt();
		
		for (int n = 1; n <= 12; n++)
		{
			System.out.println(number + "X" + n + " = " + (number * n));
		}
	}

}
