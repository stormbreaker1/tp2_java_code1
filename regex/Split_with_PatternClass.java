package regex;

import java.util.regex.Pattern;

public class Split_with_PatternClass {
	public static void main(String[] args)
	{
		// we could have given argument as "\\." as well to split the target string on the basis of 
		 // "."
		// For splitting the target string on the basis of "." if we pass like Pattern.compile(".")
		 // This will literally do blunder and we will get nothing when we apply p.split("www.google.com")
		Pattern p = Pattern.compile("[.]");
		
		String string1[] = p.split("www.google.com");
		
		System.out.println("Splitted Tokens of the Target string are :");
		for(String s1:string1)
		{
			System.out.println(s1);
		}
		
	}
}
