package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Name {

	public static void main(String[] args) throws FileNotFoundException {
		String name;
		
		File file = new File("C:/Users/Kaitie/Desktop/name.txt");
		System.out.println("Using my awesome skills I can tell you your name: ");
		Scanner input = new Scanner(file);
		name = input.nextLine();
		System.out.println(name);
		
	}

}
