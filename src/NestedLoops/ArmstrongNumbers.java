package NestedLoops;

public class ArmstrongNumbers {

	public static void main(String[] args) {

		for (int a = 1; a <= 9; a++)
		{
			for (int b = 0; b <= 9; b++)
			{
				for (int c = 0; c <= 9; c++)
				{
					int sum = sum3(a, b, c);
					int armstrong = armstrong (a, b, c);
					
					if (sum == armstrong)
					{
						System.out.println(a + "³ + " + b + "³ + " + c + "³ = " + armstrong);
					}
				}
			}
		}
	}
	
	public static int sum3 (int a, int b, int c)
	{
		return (a * a * a) + (b * b * b) + (c * c * c);
	}
	
	public static int armstrong (int a, int b, int c)
	{
		return (a * 100 + b * 10 + c);
	}
}
