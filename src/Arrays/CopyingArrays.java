package Arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {

	public static void main(String[] args) {
		Random r = new Random();
		int[] anArray;
		anArray = new int[10];

		for (int i = 0; i < anArray.length; i++)
		{
			int x = 1 + r.nextInt(100);
			anArray[i] = x;
		}

		int[] anArrayb;
		anArrayb = new int[10];

		for (int i = 0; i < anArrayb.length; i++)
		{
			anArrayb[i] = anArray[i];
		}
		System.out.print("Array 1: ");
		anArray[9] = -7;
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print(anArray[i] + "  ");
		}
		System.out.println();
		System.out.print("Array 2: ");
		for (int i = 0; i < anArrayb.length; i++)
		{
			System.out.print(anArrayb[i] + "  ");
		}

	}
}
