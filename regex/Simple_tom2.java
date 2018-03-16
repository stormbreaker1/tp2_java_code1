package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple_tom2 {
	public static void main(String[] args)
	{
		int counter = 0;
		
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher("ab34#d3&^h571kp");
	
		while(m.find())
		{
			System.out.println(m.start() +"----"+ m.group());
			counter++;
		}
		
		System.out.println("Number of times, the occurence of pattern is:- "+counter);
	}
}

//[abc] = "a" or "b" or "c"
//[^abc] = except "a" or "b" or "c"
//[0-9] = 0 or 1 or 2 till 9
//[^0-9] = anything except 0 to 9
//[a-zA-Z] = anything from a to z or A to Z
//[^a-zA-Z] = anything except a to z or A to Z
