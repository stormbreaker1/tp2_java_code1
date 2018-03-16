package socketProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection1 {
	public static void main(String[] args) 
	{
		int i;
		
		try
		{
		URL url1 = new URL("https://www.javatpoint.com/URLConnection-class");
		
		// openConnection() method of URL class will return the object of URLConnection class....
		URLConnection connection1 = url1.openConnection();
		
		// getInputStream() method of URLConnection class will get all the data of a webpage
		InputStream stream1 = connection1.getInputStream(); 
		
		while((i=stream1.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		
		
	}
}
