package Arrays;

import java.util.Scanner;

public class ParallelArrays {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int ID;
		String[] names = {"Smith", "Mason", "Thomas", "Klien", "Franks"};
		double[] averages = {99.5, 95.3, 89.4, 86.7, 78.1};
		int[] ids = {572737, 281934, 910362, 815294, 461953};
		
		System.out.println("Values:");
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(names[i] + " " + averages[i] + " " + ids[i]);
		}
		
		System.out.println();
		System.out.print("ID number to find: ");		
		ID = keyboard.nextInt();

		for (int i = 0; i < ids.length; i++)
		{
			if (ID == ids[i])
			{
				System.out.println();
				System.out.println("Found in slot " + i);
				System.out.println("    Name:" + names[i]);
				System.out.println("    Average:" + averages[i]);
				System.out.println("    ID:" + ids[i]);
				break;
			}
		}
	}
}
