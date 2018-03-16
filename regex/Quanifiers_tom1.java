package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This program is for quantifiers....
public class Quanifiers_tom1 {
	public static void main(String[] args)
	{
		// a+ means at least 1 a  
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("aabcdbaaabdaaaaa834jls393%$nfkp");
	
		while(m.find())
		{
			System.out.println(m.start()+ "----" + m.group());
		}
	}
}	

//	 a+ means atleast 1 "a"
//	 a* means any number of "a" including 0
//   a? means at most 1 "a"