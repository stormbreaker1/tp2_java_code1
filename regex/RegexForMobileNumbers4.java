package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForMobileNumbers4 {
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(args[0]);
		
		// We have to run this via command line and pass the argument at the time of running.
		if(m.find() && m.group().equals(args[0]))
		{
			System.out.println("Valid Mobile Number...");
		}
		else
		{
			System.out.println("Invalid Mobile Number...");
		}
	}
}
