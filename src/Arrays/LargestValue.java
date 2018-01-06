package Arrays;

import java.util.Random;

public class LargestValue {

	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[10];
		int largest = 0;
		int position = 0;
		
		System.out.print("Array: ");
		for(int i = 0;  i < array.length; i++)
		{
			array[i] = 1 + r.nextInt(100);		
			System.out.print(array[i] + " ");	
			
		}	
		
		for(int i = 0;  i < array.length; i++)
		{
			if (array[i] > largest)
			{
				largest = array[i];
				position = i + 1;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("The largest number is " + largest);
		System.out.println("It is in slot " + position);
	}
}
