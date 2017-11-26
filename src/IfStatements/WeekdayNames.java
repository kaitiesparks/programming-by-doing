package IfStatements;

import java.awt.print.Printable;
import java.util.Scanner;

public class WeekdayNames {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int day;
		String name;
		
		System.out.println("Choose a number 0-7.");
		day = keyboard.nextInt();
		
		if (day == 1)
		{
			name = "Sunday";
		}
		else if (day == 2)
		{
			name = "Monday";
		}
		else if (day == 3)
		{
			name = "Tuesday";
		}
		else if (day == 4)
		{
			name = "Wednesday";
			
		}
		else if (day == 5)
		{
			name= "Thursday";
		}
		else if (day == 6)
		{
			name = "Friday";
		}
		else if (day == 7 || day == 0)
		{
			name = "Saturday";
		}
		else
		{
			name = "Error";
		}
		if (name != "Error")
		{
			System.out.println("Today is " + name + ".");
		}
		else
		{
			System.out.println("Error");
		}

	}

}
