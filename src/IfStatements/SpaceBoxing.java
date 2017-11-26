package IfStatements;

import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int earthWeight;
		double planetWeight = 0.0;
		int planetName;
		
		System.out.println("Tell me your current Earth weight.");
		earthWeight = keyboard.nextInt();
		
		System.out.println("This is the information for the following planets: ");
		
		System.out.println("1. Venus    2. Mars    3. Jupiter");
		System.out.println("4. Saturn   5. Uranus  6. Neptune");
		
		System.out.println("Which planet are you visiting?");
		planetName = keyboard.nextInt();
		
		if (planetName == 1)
		{
			planetWeight = earthWeight * .78;
		}
		
		else if (planetName == 2)
		{
			planetWeight = earthWeight * .39;
		}
		
		else if (planetName == 3)
		{
			planetWeight = earthWeight * 2.65;
		}
		
		else if (planetName == 4)
		{
			planetWeight = earthWeight * 1.17;
		}
		
		else if (planetName == 5)
		{
			planetWeight = earthWeight * 1.05;
		}
		
		else if (planetName == 6)
		{
			planetWeight = earthWeight * 1.23;
		}
		
		System.out.println("Your weight is " + planetWeight + " pounds on that planet.");

	}

}
