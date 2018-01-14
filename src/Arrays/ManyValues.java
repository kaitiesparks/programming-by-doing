package Arrays;

public class ManyValues {

	public static void main(String[] args) {
		String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo" };

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
		System.out.println();
		String[] arr2 = { "10", "46", "13", "81", "4" };

		System.out.print("The second array is filled with the following values:\n\t");
		for ( int i=0; i<arr2.length; i++ )
			System.out.print( arr2[i] + " " );
		System.out.println();
	}
}
