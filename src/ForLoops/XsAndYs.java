package ForLoops;

public class XsAndYs {
	public static void main(String[] args) {

		for (float x = -10 ; x <= 10 ; x = x+0.5f)
		{
			float y = x * x;
			System.out.println(x + "	" + y);
		}
	}

}