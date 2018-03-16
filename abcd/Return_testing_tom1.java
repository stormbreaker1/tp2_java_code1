package abcd;

public class Return_testing_tom1 {
	
	int x = 10;
	public static void main(String[] args)
	{
		Return_testing_tom1 obj1 = new Return_testing_tom1();
		int result = obj1.returnInteger();
		System.out.println(result);
	}
	
	public int returnInteger()
	{
		// If this "if" condition is true then "x" will be returned else "1" will be returned.
		if(x>24)
		{
			return x;
		}
		return 1;
	}
}
