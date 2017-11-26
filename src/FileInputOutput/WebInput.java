package FileInputOutput;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WebInput {

	public static void main(String[] args) throws IOException {

		URL mcool = new URL("https://www.google.com/robots.txt");
		Scanner webIn = new Scanner( mcool.openStream() );

		while (webIn.hasNextLine())
		{
			String one = webIn.nextLine();		
			System.out.println(one);
		}

		webIn.close();
	}
}
