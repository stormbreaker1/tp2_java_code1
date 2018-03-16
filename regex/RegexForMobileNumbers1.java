package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForMobileNumbers1 {
	public static void main(String[] args)
	{
		// Regular expression for searching mobile number of 10 digits.
		Pattern p = Pattern.compile("[7-9][0-9]{9}");
		Matcher m = p.matcher("snvsnkld9722432232lfanl@lkns828jksfk91fkp9873841230");
		
		System.out.println("The found mobile numbers from the target string are:");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
