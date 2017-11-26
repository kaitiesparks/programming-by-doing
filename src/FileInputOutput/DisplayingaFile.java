package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayingaFile {

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
			name = input.nextLine();
			System.out.println(name);
		}
	}

}
