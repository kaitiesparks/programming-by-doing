package Arrays;

import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int[] value = new int[10];
		int inputNum;
		int amount = 0;

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
				amount++;						
			}				
		}				
		
		System.out.println(inputNum + " was found " + amount + " times");
	}
}
