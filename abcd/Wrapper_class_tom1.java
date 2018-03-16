package abcd;

// Wrapper class in java provides a mechanism to convert primitive data type into Object type 
 // and Object type into the primitive data type.

public class Wrapper_class_tom1 {
	public static void main(String[] args)
	{
		int num1 = 24;
		String str = "35";
		
		Integer number1 = new Integer(num1);
		System.out.println(number1);
		
		// auto boxing done compiler, automatically
		Integer number2 = num1;
		// unboxing done by compiler itself automatically.
		System.out.println(number2);
		
		// The valueOf method returns the string representation of passed arguments....
		System.out.println(Integer.valueOf(num1));
		System.out.println(Integer.valueOf(str));
		System.out.println(String.valueOf(24));
		
		// This method is used to get the primitive data type of a certain String. 
		  // parseXxx() is a static method and can have one argument or two.
		System.out.println(Double.parseDouble(str));
		
		// can't pass something other than String...... 
		
	}
}
