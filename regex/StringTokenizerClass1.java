package regex;

// Most of the String class are in java.lang package but StringTokenizer class is in java.util package. 
import java.util.StringTokenizer;

public class StringTokenizerClass1 {
	public static void main(String[] args)
	{
		// This StringTokenizer class is specifically designed for splitting
		// Default pattern with which target has to be split is space.
		StringTokenizer string1 = new StringTokenizer("Hello how are you");
		
		// Here, simple "." will also work but use recommended way.
		StringTokenizer string2 = new StringTokenizer("www.yahoo.com","[.]");
		
		while(string1.hasMoreTokens())
		{
			System.out.println(string1.nextToken());
		}
		
		while(string2.hasMoreTokens())
		{	
			System.out.println(string2.nextToken());
		}
	}
}
