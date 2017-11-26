package NestedLoops;

public class NumberPuzzle {

	public static void main(String[] args) {
		
		for (int a = 10; a < 50; a++)
		{
			for (int b = 10; b < 50; b++)
			{
				if ((a + b) == 60 && Math.abs(a - b) == 14)
				{
					System.out.print("(" + a + ", " + b + ")\n");
				}
			}
		}
		
	}

}
