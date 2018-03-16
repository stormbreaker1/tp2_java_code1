package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForMobileNumbers2 {
	public static void main(String[] args)
	{
		// Regular expression to find the mobile numbers of 10 digits and 11 digits which have 
		 // starting from 0
		
		// For number starting from +91
		// ("[+91]{3}?[7-9][0-9]{9}")
		Pattern p = Pattern.compile("[0]?[7-9][0-9]{9}");
		Matcher m = p.matcher("snvsnkld9722432232lfanl@lkns828jksfk91fkp09873841230");
		
		System.out.println("Found Mobile Numbers are: ");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
