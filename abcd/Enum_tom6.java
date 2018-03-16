package abcd;

// This program is for checking the difference between "==" and "equals()" method in case of 
 // enum. This will also show how to avoid null point exception in case of enums.
public class Enum_tom6 {
	enum Movies
	{
		 BAHUBALI,THOR,DANGAL;
	}
	
	public static void main(String[] args)
	{
		// This enum constant is unknown and we knowingly set it to "null"
		Movies unknown = null;
		
		// This is another enum constant which we have set to "BAHUBALI" 
		Movies bahubali = Movies.BAHUBALI;
		
		// Now, we will test them with "==" and "equals()" methods.........
		// "==" will have type safety for enum types at compile time while "equals()" do not though
		 // "equals()" will error at run time which is kinda bad.........
		boolean result1 = (unknown == bahubali);
		System.out.printf("First result is %s",result1);
		System.out.println("");
		
		// This will give an null point exception in this case. So, to avoid null point exception
		 // use "==" in case of enums.......
		
		try
		{
		boolean result2 = unknown.equals(bahubali);
		System.out.printf("Second result is %s",result2);
		}
		catch(NullPointerException e)
		{
			System.out.println("So, We got the exception as " + e);
		}
		
//		// But, this null point exception can be handled if we reverse the values in case of 
//		 // "equals()", but still avoid this in case of enums and use "==" for enums.........
		boolean result3 = bahubali.equals(unknown);
		System.out.printf("Third result is %s",result3);

		
		
	}

}
