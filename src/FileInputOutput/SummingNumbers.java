package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		int num;
		int sum = 0;
		String fileName;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Which file would you like to read numbers from? ");
		fileName = keyboard.next();
		File file = new File("C:/Users/Kaitie/Desktop/" + fileName);
		System.out.println("Reading numbers from file \"" + fileName + "\"");
		System.out.println();
		Scanner input = new Scanner(file);
		num = input.nextInt();
		sum += num;
		System.out.print(num + " ");
		num = input.nextInt();
		sum += num;
		System.out.print(num + " ");
		num = input.nextInt();
		sum += num;
		System.out.println(num + "  ");
		System.out.println("Total is: " + sum);
	}

}
