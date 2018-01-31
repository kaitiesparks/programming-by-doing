package Sorting;

import java.util.Random;

public class ExchangeSort {
	
	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		for ( i=0; i<arr.length; i++ )
		{
			arr[i] = 1 + r.nextInt(100);		
		}
		System.out.print("before: ");

		for ( i=0; i<arr.length; i++ )
		{
			System.out.print( arr[i] + " " );
		}			

		System.out.println();

		exchange_sort( arr );

		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
		{
			System.out.print( arr[i] + " " );
		}		

		System.out.println();
	}
	private static void exchange_sort(int[] arr) {
		for (int a = 0; a < arr.length; a++)
		{
			for (int b = 0 ; b < arr.length; b++)
			{
				if (arr[a] < arr[b])
				{
					int s = arr[a];
					arr[a] = arr[b];
					arr[b] = s;
				}
			}
		}
	}
}
