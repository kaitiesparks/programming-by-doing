package Arrays;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

public class GradesFile {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		String name;
		String fileName;
		int[] grades;
		grades = new int[5];

		System.out.println("Name (first last): ");
		name = keyboard.nextLine();
		System.out.println("Filename: ");
		fileName = keyboard.nextLine();		
		PrintWriter writer = new PrintWriter("C:/Users/Kaitie/Desktop/" + fileName, "UTF-8");
		System.out.println("Here are your randomly-selected grades (hope you pass): ");
		writer.println(name);

		for(int i = 0;  i < grades.length; i++)
		{
			grades[i] = 1 + r.nextInt(100);		
			System.out.println("Grade " + (i + 1) + ": " + grades[i]);		
			writer.print(grades[i] + " ");
		}

		System.out.println("Data saved in \"" + fileName + "\"");
		
		writer.close();
	}
}
