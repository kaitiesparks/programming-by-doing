package NestedLoops;

public class IndividualDigits {

	public static void main(String[] args) {

		for (int a = 1; a <= 9; a++)
		{
			for (int b = 0; b <= 9; b++)
			{
				System.out.println(a + "" + b + ". " + a + " + " + b + " = " + (a + b));
			}
		}
	}
}
