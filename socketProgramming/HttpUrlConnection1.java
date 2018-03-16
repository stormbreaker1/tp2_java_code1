package socketProgramming;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// HttpURLConnection is used for getting information of the webpage....
// It is basically Http specific class....
public class HttpUrlConnection1 {
	public static void main(String[] args) throws IOException
	{
		try{
		URL url1 = new URL("https://www.javatpoint.com/URLConnection-class");
		HttpURLConnection httpurlconnection1 = (HttpURLConnection) url1.openConnection();
		
		// we can also get less number of information by decreasing the number in for loop
		for(int i=0; i<=8; i++)
		{
			System.out.println(httpurlconnection1.getHeaderFieldKey(i)+"="+httpurlconnection1.getHeaderField(i));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
	}
}
