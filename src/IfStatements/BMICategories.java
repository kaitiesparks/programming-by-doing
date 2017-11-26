package IfStatements;

import java.util.Scanner;

public class BMICategories {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double height;
		int weight;
		
		System.out.println("Your height in meters:");
		height = keyboard.nextDouble();
		System.out.println("Your weight in kilograms:");
		weight = keyboard.nextInt();
		double BMI = weight /(height * height);
		System.out.println("Your BMI is: " + BMI);
		
		if (BMI < 18.5)
		{
			System.out.println("You are underweight.");
		}
		
		else if (BMI < 24.9)
		{
			System.out.println("You are normal weight.");
		}
		
		else if (BMI < 29.9)
		{
			System.out.println("You are over weight.");
		}
		
		else if (BMI >= 30)
		{
			System.out.println("You are obese.");
		}
		
	}

}
