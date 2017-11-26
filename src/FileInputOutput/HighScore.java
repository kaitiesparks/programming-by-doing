package FileInputOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("C:/Users/Kaitie/Desktop/highscore.txt", "UTF-8");
		Scanner keyboard = new Scanner(System.in);
		int score;
		String name;

		System.out.println("You got a high score!");
		System.out.println("Please enter your score: ");
		score = keyboard.nextInt();
		System.out.println("Please enter your name: ");
		name = keyboard.next();

		writer.println(score);
		writer.println(name);
		writer.close();
	}
}
