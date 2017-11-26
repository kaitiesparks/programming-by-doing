package NestedLoops;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("x |	1	2	3	4	5	6	7	8	9");
		System.out.println("==+==========================================================================");
		
		for (int num1 = 1; num1 <= 12; num1++)
		{
			System.out.print(num1 + " |  ");
			
			for (int num2 = 1; num2 <= 9; num2++)
			{
				System.out.print("      " + num1 * num2);
			}
			System.out.println();
		}
	}

}
