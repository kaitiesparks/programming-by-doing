package Functions;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int shape = 0;

		while (shape != 5)
		{
			System.out.println("1. Traingle");
			System.out.println("2. Rectangle");
			System.out.println("3. Square");
			System.out.println("4. Circle");
			System.out.println("5. Quit");
			System.out.println("Which shape: ");
			shape = keyboard.nextInt();

			if (shape == 4)
			{
				int radius;
				System.out.println("Radius: ");
				radius = keyboard.nextInt();
				double area_circle = area_circle(radius);
				System.out.println("The area is " + area_circle + ".");
			}
			else if (shape == 2)
			{
				int length;
				int width;
				System.out.println("Length: ");
				length = keyboard.nextInt();
				System.out.println("Width: ");
				width = keyboard.nextInt();
				int area_rectangle = area_rectangle(length, width);
				System.out.println("The area is " + area_rectangle + ".");
			}
			else if (shape == 3)
			{
				int side;
				System.out.println("Side: ");
				side = keyboard.nextInt();
				int area_square = area_square(side);
				System.out.println("The area is " + area_square + ".");
			}
			else if (shape == 1)
			{
				int base;
				int height;
				System.out.println("Base: ");
				base = keyboard.nextInt();
				System.out.println("Height: ");
				height = keyboard.nextInt();
				double area_triangle = area_triangle(base, height);
				System.out.println("The area is " + area_triangle + ".");
			}
			System.out.println("");
		}
		System.out.println("Goodbye.");
	}

	public static double area_circle( int radius )
	{
		double pi = 3.14, area;
		area = pi * radius * radius;
		return area;
	}
	public static int area_rectangle( int length, int width )
	{
		int area;
		area = length * width;
		return area;
	}
	public static int area_square( int side )   
	{
		int area_square = area_rectangle(side, side);
		return area_square;
	}
	public static double area_triangle( int base, int height ) 
	{
		double area_triangle = 0.5 * base * height;
		return area_triangle;
	}
}
