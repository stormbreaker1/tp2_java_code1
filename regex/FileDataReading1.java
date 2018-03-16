package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDataReading1 {
	public static void main(String[] args) throws IOException
	{
		// We can use PrintWriter as well to copy the read data from a file to a file.
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\eclipse practice\\Emails_and_contacts.txt"));
		
		String line = br.readLine();
		
		while(line!=null)
		{
			Matcher m = p.matcher(line);
			
			while(m.find())
			{
				System.out.println("Contact Number is :- " + m.group());
			}
			line = br.readLine();
		}
	}
}
