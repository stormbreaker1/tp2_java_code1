package abcd;

public class EqualsMethod {
	public static void main(String[] args)
	{
		// These two strings s1 and s2 are created using String class, hence these both reference
		 // types are separate from each other 
		String s1 = new String("hello");
		String s2 = new String("hello");
		
 // "==" will compare object references and will return true if two entity have same references
  // ".equals()" will compare the content only
		
		// compares the reference of two elements
		System.out.println(s1==s2);      // Will give false
		
		// compares the content of two element only 
		System.out.println(s1.equals(s2));  // Will give true
	}
}
