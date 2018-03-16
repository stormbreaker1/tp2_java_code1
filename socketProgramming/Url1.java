package socketProgramming;

import java.net.URL;

public class Url1 {
	public static void main(String[] args) throws Exception
	{
		// This URL class is useful in networking for retrieving URL related Information....
		URL url1 = new URL("http://google.com");
		
		System.out.println("Information about GOOGLE: ");
		System.out.println();
		
		System.out.println("Protocol: " +url1.getProtocol());
		System.out.println("HOST NAME: " +url1.getHost());
		System.out.println("PORT: " +url1.getPort());
		System.out.println("File Name: "+url1.getFile());
	}
}
