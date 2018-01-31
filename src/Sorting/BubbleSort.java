package Sorting;

import java.util.Random;

public class BubbleSort {	

	public static void bubble_sort( int[] a )
	{
		for (int i = 1; i <= a.length; i++)
		{
			for (int j = 0; j < a.length - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					swap(a, j, j + 1);
				}
			}
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
			System.out.print(arr[i] + " " );
		}

		System.out.println();

		bubble_sort(arr);

		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
		{
			System.out.print(arr[i] + " " );
		}

		System.out.println();
	}
}
