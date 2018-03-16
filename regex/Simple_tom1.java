package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple_tom1 {
	public static void main(String[] args)
	{
		int counter=0;
		
		// Pattern is a class
		Pattern p = Pattern.compile("ab");
		
		// Matcher is a class
		Matcher m = p.matcher("ababbaba");
		
		System.out.println("Pattern has been found at these places:");
		
		// If pattern gets matched then execute the below code....
		while(m.find())
		{
			// end() method returns end index + 1 value....
			// m.start() gives the starting index, m.end() gives the ending index and m.group()
			 // gives the matched pattern....
			System.out.println(m.start()+"----"+m.end()+"-----"+m.group());
			counter++;
		}
		
		System.out.println();
		System.out.println("Number of times pattern has occurred are: "+counter);
	}
}
