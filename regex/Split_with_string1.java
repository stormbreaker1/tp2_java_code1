package regex;

public class Split_with_string1 {
	public static void main(String[] args)
	{
		// This is the split method of String class. This also do same work as split() method of 
		 // Pattern class do. But, the difference is that here we pass pattern as argument and in 
		  // Pattern class we pass target as argument.
		String string1 = "www.google.com is the website of GOOGLE";
		String string2 = "hey,how are you?";
	// Make habit to use recommended patterns instead of short cut because here string1.split(" ")
	 // will also work.	 
		String stringTokens[] = string1.split("[\\s[.]]");
		
		for(String s1: stringTokens)
		{
			System.out.println(s1);
		}
		
		System.out.println(); 
		
		
		String stringTokens2[] = string2.split("[,\\s]");
		
		for(String s2:stringTokens2)
		{
			System.out.println(s2);
		}
	}
}
