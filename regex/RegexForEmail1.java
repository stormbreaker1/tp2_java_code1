package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForEmail1 {
	public static void main(String[] args)
	{
		// This program is the basic program for searching email ID's using regular expressions.
		Pattern p = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z]+[.]com");
		
		// For url "www[.][0-9a-zA-Z]+[.]['com''in''org''uk']*"
		Matcher m = p.matcher("akjdh392&@%hello1223@yahoo.comksk982389(*&theaction21@gmail.com");
		
		System.out.println("Found email ID's are:");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
