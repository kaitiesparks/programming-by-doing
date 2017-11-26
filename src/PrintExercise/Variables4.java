package PrintExercise;

import java.util.Calendar;

public class Variables4 {

	public static void main(String[] args) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		String name = "Kaitlin Sparks";
		int graduationYear = 2011;
		
		System.out.println(currentYear);
		System.out.println("My name is " + name + " and I graduat" + (graduationYear >= currentYear ? "e in " : "ed in ") + graduationYear);

	}

}
