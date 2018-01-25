package Sorting;

public class SortingArrays {

	public static void main(String[] args) {
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.

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

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
