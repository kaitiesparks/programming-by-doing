package Sorting;

import java.util.Random;

public class SelectionSort {

	public static void selection_sort( int[] a )
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			int s = a[i];
			int p = i;

			for (int j = i; j < a.length; j++)
			{
				if (a[j] < s)
				{
					s = a[j];
					p = j;
				}
			}
			swap(a, i, p);
		}
	}

	public static void swap( int[] a , int i, int j )
	{
		int s = a[i];
		a[i] = a[j];
		a[j] = s;
	}

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

		selection_sort( arr );

		System.out.print("after : ");

		for ( i=0; i<arr.length; i++ )
		{
			System.out.print( arr[i] + " " );
		}

		System.out.println();
	}
}
