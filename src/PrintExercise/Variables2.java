package PrintExercise;

public class Variables2 {

	public static void main(String[] args)
	{
		String Name, Eyes, Teeth, Hair;
		int Age, Height, Weight;
		boolean isFemale;

		Name = "Kaitlin Sparks";
		isFemale = true;
		Age = 24;     // not a lie
		Height = 61;  // inches
		Weight = 105; // lbs
		Eyes = "Blue";
		Teeth = "White";
		Hair = "Brown";

		System.out.println( "Let's talk about " + Name + "." );
		System.out.println( (isFemale ? "She" : "He") + "'s " + Height + " inches tall." );
		System.out.println( (isFemale ? "She" : "He") + "'s " + Weight + " pounds heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( (isFemale ? "She" : "He") + "'s got " + Eyes + " eyes and " + Hair + " hair." );
		System.out.println( (isFemale ? "Her" : "His") + " teeth are usually " + Teeth + " depending on the coffee." );
		System.out.println("Weight in kilos " + (Weight * 0.45) + " Height in meters " + (((Height/12.0) * 30.48)/100));
		

		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
				+ " I get " + (Age + Height + Weight) + "." );
	}
}

