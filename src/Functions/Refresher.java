package Functions;

import java.util.Scanner;

public class Refresher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int times = 10;

		System.out.println("What is your name: ");
		name = keyboard.next();

		if (name.equals("Mitchell"))
		{
			times = 5;
		}
		for (int n = 0; n < times; n++)
		{
			System.out.println(name);
		}
	}
}
