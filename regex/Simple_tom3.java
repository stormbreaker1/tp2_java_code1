package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This program is for predefined characters
public class Simple_tom3 {
	public static void main(String[] args)
	{
		// "\s" means space but "\" is a escape character so we will have to use "\\s"
		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher("ab%$A87-@d  9Hs");
	
		while(m.find())
		{
			System.out.println(m.start() + "----" + m.group());
		}
	}
}

//	\\s is for space character
//	\\S except space character
//	\\d is for numbers character
//	\\D except numbers character
//	\\w is for alpha numeric character
//	\\W except alpha numeric character
//	. is for any character