package Arrays;

import java.util.Random;

public class Basic {

	public static void main(String[] args) {
		Random r = new Random();
		int[] anArray;
		anArray = new int[1000];
		
		for (int i = 0; i < anArray.length; i++)
		{		
			int x = 10 + r.nextInt(89);
			anArray[i] = x;
			System.out.print(anArray[i] + "  ");
			
			if ((i + 1) % 20 == 0)
			{
				System.out.println();
			}
		}
	}
}
