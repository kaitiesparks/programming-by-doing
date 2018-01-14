package Arrays;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		String word = randomWord();
		char letter;				
		String wrongLetter = "";
		char[] output = new char[word.length()];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");		

		for (int i = 0; i < word.length(); i++)
		{
			output[i] = '_';
		}

		while (!wordFinished(output) && wrongLetter.length() < 8)
		{
			System.out.print("Word: ");
			System.out.println(output);
			System.out.println("Misses: " + wrongLetter);
			System.out.println("Guess: ");
			letter = keyboard.nextLine().charAt(0);
			boolean hasFoundLetter = false;

			for (int i = 0; i < word.length(); i++)
			{
				if (letter == word.charAt(i))
				{
					output[i] = letter;
					hasFoundLetter = true;
				}
			}
			if (hasFoundLetter == false)
			{
				wrongLetter += letter;
			}
		}
		
		if (wordFinished(output))
		{
			System.out.println(word);
			System.out.println("You win!");
		}
		else
		{
			System.out.println("You lose!");		
			System.out.println("The word was " + word);
		}
	}

	public static String randomWord()
	{
		String[] words = {"partridge", "rolodex", "xylophone", "jazz", "buzz"};
		String word = words[(int) (Math.random() * words.length)];
		return word;
	}

	public static boolean wordFinished(char[] output)
	{
		for (int i = 0; i < output.length; i++)
		{
			if (output[i] == '_')
			{
				return false;
			}
		}
		return true;
	}
}
