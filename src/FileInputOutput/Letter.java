package FileInputOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Letter {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("C:/Users/Kaitie/Desktop/letter.txt", "UTF-8");
		
		writer.println("+------------------------------+");
		writer.println("|                         #### |");
		writer.println("|                         #### |");
		writer.println("|                         #### |");
		writer.println("|                              |");
		writer.println("|                              |");
		writer.println("|                              |");
		writer.println("|           Kaitlin Sparks     |");
		writer.println("|            123 Fake St.      |");
		writer.println("|          Nowhere, NV 12345   |");
		writer.println("+------------------------------+");		
		
		writer.close();

	}
}
