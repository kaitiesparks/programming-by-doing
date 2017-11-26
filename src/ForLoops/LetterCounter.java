package ForLoops;

import java.util.Scanner;

public class LetterCounter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String message;
		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;
		
		System.out.println("Type in a message: ");
		message = keyboard.nextLine();
		int length = message.length();
		
		for (int n = 0 ; n < length ; n++)
		{
			char c = message.charAt(n);
			System.out.println(c);
			
			if (c == 'a' || c == 'A')
			{
				vowelA++;
			}
			else if (c == 'e' || c == 'E')
			{
				vowelE++;
			}
			else if (c == 'i' || c == 'I')
			{
				vowelI++;
			}
			else if (c == 'o' || c == 'O')
			{
				vowelO++;
			}
			else if (c == 'u' || c == 'U')
			{
				vowelU++;
			}
		}
		
		System.out.println("Your message is " + length + " characters long.");
		System.out.println("The first character at position \"0\" is " + message.charAt(0) + ".");
		System.out.println("The last character at position " + (length-1) + " is " + message.charAt(length-1) + ".");
		System.out.println("There are " + vowelA + " \"A\"'s.");
		System.out.println("There are " + vowelE + " \"E\"'s.");
		System.out.println("There are " + vowelI + " \"I\"'s.");
		System.out.println("There are " + vowelO + " \"O\"'s.");
		System.out.println("There are " + vowelU + " \"U\"'s.");
	}

}
