package RandomNumbers;

import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {
		Random r = new Random();
		int choice = 1 + r.nextInt(6);
		String response1 = "";
		String response2 = "";
		
		if (choice == 1)
		{
			response1 = "Friendship will get you through the hardships.";
			response2 = "13-17-43-36-8";
		}
		else if (choice == 2)
		{
			response1 = "Love is right around the corner.";
			response2 = "5-42-18-58-12";
		}
		else if (choice == 3)
		{
			response1 = "The darkness will soon pass.";
			response2 = "6-24-21-59-40";
		}
		else if (choice == 4) 
		{
			response1 = "Much will soon be revealed.";
			response2 = "4-31-55-28-19";
		}
		else if (choice == 5)
		{
			response1 = "There will be a big change in your future.";
			response2 = "9-16-22-48-26";
		}
		else if (choice == 6)
		{
			response1 = "Happiness and hope is in your future.";
			response2 = "15-10-47-16-50";
		}
		
		System.out.println("Fortune cookie says: " + response1);
		System.out.println("                           " + response2);
		

	}

}
