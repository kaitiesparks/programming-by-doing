package Sorting;

import java.net.URL;
import java.util.Scanner;

public class MovieTitleGenerator {

	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		String choice;

		String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
		String[] nouns = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");

		System.out.println("Mitchell's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

		do
		{
			int adj = 0 + (int)(Math.random() * adjectives.length);
			int nn = 0 + (int)(Math.random() * nouns.length); 

			String adjective = adjectives[adj];
			String noun = nouns[nn];

			System.out.println( "Your movie title is: " + adjective + " " + noun );
			System.out.println("Would you like to try again? Y/N?" );
			choice = keyboard.next();
		} while (choice.equalsIgnoreCase("Y"));
		
		System.out.println("Goodbye.");
	}

	/**
	 *	@param url - the URL to read words from
	 *	@return An array of words, initialized from the given URL
	 */	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for ( int i=0; i<words.length; i++ )
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}
}
