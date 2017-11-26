package KeyboardInput;

import java.util.Scanner;

public class UserDate {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String nameFirst;
		String nameLast;
		int grade;
		int idNumber;
		String login;
		double gpa;
		
		System.out.print( "First name: " );
		nameFirst = keyboard.next();
		
		System.out.print( "Last name: " );
		nameLast = keyboard.next();

		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		idNumber = keyboard.nextInt();
		
		System.out.print( "Login: " );
		login = keyboard.next();
		
		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();
		
		System.out.println( "Your information: " );
		
		System.out.println("      Login: " + login );
		
		System.out.println( "      ID: " + idNumber );
		
		System.out.println( "      Name: " + nameLast + ", " + nameFirst );
		
		System.out.println( "      GPA: " + gpa );
		
		System.out.println( "      Grade: " + grade );
	}

}
