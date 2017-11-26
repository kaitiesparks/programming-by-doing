package KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age;
		double salary;
		
		System.out.print( "Hello, what is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you?" );
		age = keyboard.nextInt();

		System.out.print( "So you're " + age + ( age <= 30 ? ", eh? That's not old at all!" : ", Whew! That's old!") + " How much do you make, " + name + "?");
		salary = keyboard.nextDouble();
		
		System.out.printf("%.2f$" + (salary <= 100 ? "! I hope that's per hour and not per year! LOL!" : "! Wow, look at you!"), salary );
		keyboard.next();
	}

}
