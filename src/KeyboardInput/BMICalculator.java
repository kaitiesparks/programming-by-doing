package KeyboardInput;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int heightFeet;
		int heightInches;
		int weight;
		
		System.out.print( "Your height in (feet only): " );
		heightFeet = keyboard.nextInt();
		
		System.out.print( "Your height in (inches only): " );
		heightInches = keyboard.nextInt();
		
		System.out.print( "Your weight in pounds: " );
		weight = keyboard.nextInt();
		
		double weightKilo = weight * 0.45;
		double heightMeters= heightFeet * 0.30 + heightInches * 0.02;
		
		System.out.println( "Your BMI is " + weightKilo / (heightMeters * heightMeters) );
	}

}
