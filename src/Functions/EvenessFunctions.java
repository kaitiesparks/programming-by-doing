package Functions;

public class EvenessFunctions {

	public static void main(String[] args) {

		for (int n = 1 ; n <= 20 ; n = n+1)
		{
			if (isEven(n) && isDivisibleBy3(n))
			{
				System.out.println(n + ". <=");
			}
			else if (isEven(n))
			{
				System.out.println(n + ". <");
			}
			else if (isDivisibleBy3(n))
			{
				System.out.println(n + ". =");
			}

			else
			{
				System.out.println(n);
			}
		}
	}

	public static boolean isEven( int n )
	{
		return n % 2 == 0;
	
	}
	public static boolean isDivisibleBy3( int n )
	{
		return n % 3 == 0;
	}

}
