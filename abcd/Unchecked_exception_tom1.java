package abcd;

import java.io.FileNotFoundException;

// Testing for unchecked exception
public class Unchecked_exception_tom1 {
	public static void main(String[] args)
	{
		System.out.println("First statement of the program");
		System.out.println("Second statement of the program");
		
		int x = 0;
		
		try
		{
			x = 4/2;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is getting executed");
		}
		
		
		System.out.println("The value of x is " + x);
		
		System.out.println("Third statement of the program");
	}
}
