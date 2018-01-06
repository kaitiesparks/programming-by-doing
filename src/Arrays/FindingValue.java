package Arrays;

import java.util.Random;
import java.util.Scanner;

public class FindingValue {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int[] value = new int[10];
		int inputNum;

		System.out.print("Array: ");
		for(int i = 0;  i < value.length; i++)
		{
			value[i] = 1 + r.nextInt(50);		
			System.out.print(value[i] + " ");		
		}
		System.out.println();
		System.out.print("Value to find: ");
		inputNum = keyboard.nextInt();
		System.out.println();
		
		for (int i = 0; i < value.length; i++)
		{
			if (inputNum == value[i])
			{
				System.out.println(inputNum + " is in the array");
			}
		}
	}
}
