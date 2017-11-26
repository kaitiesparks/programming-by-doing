package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VowelCapitalization {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		String name;

		System.out.print("Open which file: ");
		fileName = keyboard.next();
		File file = new File("C:/Users/Kaitie/Desktop/" + fileName);
		Scanner input = new Scanner(file);

		while (input.hasNext())
		{
			String line = input.nextLine();
			for(int i = 0; i < line.length(); i++)
			{
				if (line.charAt(i) == 'a')
				{
					System.out.print("A");
				}
				else if (line.charAt(i) == 'e')
				{
					System.out.print("E");
				}
				else if (line.charAt(i) == 'i')
				{
					System.out.print("I");
				}
				else if (line.charAt(i) == 'o')
				{
					System.out.print("O");
				}
				else if (line.charAt(i)  == 'u')
				{
					System.out.print("U");
				}
				else
				{
					System.out.print(line.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
