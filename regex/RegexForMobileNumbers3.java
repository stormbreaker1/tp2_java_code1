package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForMobileNumbers3 {
	public static void main(String[] args)
	{
		// Regular expression to find the mobile numbers of 10 digits, 11 digits and 12 digits 
		 // starting from 0 in case of 11 digits and starts from 91 in case of 12 digits.
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m = p.matcher("snvsnkld9722432232lfanl@lkns828jksfk91fkp09873841230adkja*&57]%919752857434");
		
		System.out.println("Found Mobile Numbers are: ");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
