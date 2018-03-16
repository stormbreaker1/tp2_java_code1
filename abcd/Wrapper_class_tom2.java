package abcd;

// Wrapper classes concept means wrapping primitive data type into Object type
// There is a concept of unwrapping as well

// As java is 99.9 % object oriented language, so we have few primitive data types.
// So, there is the concept of Wrapper classes where we use object instead of primitive data types.
// In advance frameworks we use objects only, we do not deal with primitive data types. One example of such 
 // framework is Apache Hadoop .
public class Wrapper_class_tom2 {
	public static void main(String[] args)
	{
		int x = 26;
		
		// Wrapping the primitive data type around class and this concept is called as Boxing.
		Integer iobject1 = new Integer(x);
	
		// This below concept is called as auto boxing.
		Integer wrapobject1 = x;
		
		// Unwrapping the data and this is called as Unboxing
		int a = iobject1.intValue();
		
		// This below concept is called as auto unboxing.
		int unwrapobject1 = wrapobject1; 
		
		System.out.println(a);
		
		
		
		String str1 = new String();
	}
}
