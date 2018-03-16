package abcd;

public class Pass_By_Value_Reference {
	public static void main(String[] args)
	{
		int x = 43;
		
		// In java everything is pass by value except array... 
		System.out.println("Value of x before applying method is:- " + x);
		Pass_By_Value_Reference obj1 = new Pass_By_Value_Reference();
		obj1.modify_integer(x);
		
		System.out.println("Value of x after applying method is:- " + x);
		
	}
	
	void modify_integer(int num)
	{
		num += 3;
	}
}
