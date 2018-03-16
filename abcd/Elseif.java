package abcd;

public class Elseif {
	public static void main(String[] args)
	{
		// initializing x to 23
		int x = 23;
		
		// using "if" condition to see if x is smaller to 3
		if(x<3)
		{
			System.out.println("x is smaller than 3");
		}
		
		// using "else if" condition to see if x is between 3 and 8
		else if(x>3 && x<8)
		{
			System.out.println("x is between 3 and 8");
		}
		
		else if(x>8 && x<14)
		{
			System.out.println("x is between 8 and 14");
		}
		
		else
		{
			System.out.println("x must be greater than 14");
		}
		
	}
}
