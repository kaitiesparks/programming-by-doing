package Functions;

import java.util.Scanner;

public class WeekdayCalculator {

	public static void main(String[] args) {
				Scanner keyboard = new Scanner(System.in);

				System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
				System.out.println();
				System.out.println("All you have to do is enter your birth date, and it will");
				System.out.println("tell you the day of the week on which you were born.");
				System.out.println();
				System.out.println("Some automatic tests....");
				System.out.println("12 10 2003 => " + weekday(12,10,2003));
				System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
				System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
				System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
				System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
				System.out.println("10 13 2000 => " + weekday(10,13,2000));
				System.out.println();

				System.out.println("Now it's your turn!  What's your birthday?");
				System.out.print("Birth date (mm dd yyyy): ");
				int mm = keyboard.nextInt();
				int dd = keyboard.nextInt();
				int yyyy = keyboard.nextInt();

				String weekday = weekday(mm, dd, yyyy);
				System.out.println("You were born on " + weekday + ".");
			}


			public static String weekday( int mm, int dd, int yyyy )
			{
				int yy, total;
				String date = "";

				yy = yyyy - 1900;
				total = yy / 4;
				total += yy;
				total += dd;
				total += month_offset(mm);
				
				if ((mm == 1 || mm == 2) && is_leap(yyyy))
				{
					total--;
				}
				total = total % 7;
				date = name(total);
				

				date = date + ", " + month_name(mm) + " " + dd + ", " + yyyy;

				return date;
			}


			public static int month_offset(int month) {
				int result = -1;
				if (month == 1 || month == 10)
				{
					result = 1;
				}
				else if (month == 2 || month == 3 || month == 11)
				{
					result = 4;
				}
				else if (month == 4 || month == 7)
				{
					result = 0;
				}
				else if (month == 5)
				{
					result = 2;
				}
				else if (month == 6)
				{
					result = 5;
				}
				else if (month == 8)
				{
					result = 3;
				}
				else if (month == 9 || month == 12)
				{
					result = 6;
				}
			
				return result;
			}

			public static String month_name( int month )
			{
				String result;
				if (month == 1)
				{
					result = "January";
				}
				else if (month == 2)
				{
					result = "February";
				}
				else if (month == 3)
				{
					result = "March";
				}
				else if (month == 4)
				{
					result = "April";
				}
				else if (month == 5)
				{
					result = "May";
				}
				else if (month == 6)
				{
					result = "June";
				}
				else if (month == 7)
				{
					result = "July";
				}
				else if (month == 8)
				{
					result = "August";
				}
				else if (month == 9)
				{
					result = "September";
				}
				else if (month == 10)
				{
					result = "October";
				}
				else if (month == 11)
				{
					result = "November";
				}
				else if (month == 12)
				{
					result = "December";
				}
				else
				{
					result = "error";
				}
				return result;
			}
			
			public static String name(int day) {
				String name = "";
				
				if (day == 1)
				{
					name = "Sunday";
				}
				else if (day == 2)
				{
					name = "Monday";
				}
				else if (day == 3)
				{
					name = "Tuesday";
				}
				else if (day == 4)
				{
					name = "Wednesday";
				}
				else if (day == 5)
				{
					name= "Thursday";
				}
				else if (day == 6)
				{
					name = "Friday";
				}
				else if (day == 7 || day == 0)
				{
					name = "Saturday";
				}
				
				return name;
			}
				
			public static boolean is_leap( int year )
			{
				// years which are evenly divisible by 4 are leap years,
				// but years divisible by 100 are not leap years,
				// though years divisible by 400 are leap years
				boolean result;

				if ( year%400 == 0 )
					result = true;
				else if ( year%100 == 0 )
					result = false;
				else if ( year%4 == 0 )
					result = true;
				else
					result = false;
				
				return result;
			}
		}