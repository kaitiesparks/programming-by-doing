package KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print( "Hello, what is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println( "Did you know that in 5 years you will be " + (age + 5) + "?");
		
		System.out.println( "And five years ago you were"  + (age <= 5 ? "n't born yet." : " " + (age - 5) + "? Imagine that!"));
	}

}
