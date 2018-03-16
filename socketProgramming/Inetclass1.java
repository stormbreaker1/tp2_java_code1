package socketProgramming;

import java.net.InetAddress;

public class Inetclass1 {
	public static void main(String[] args)
	{
		try
		{
		InetAddress ip1 = InetAddress.getByName("https://www.javatpoint.com");
		
		System.out.println("Host Name is :- "+ ip1.getHostName());
		System.out.println("Host Address is :- "+ip1.getHostAddress());
		System.out.println("Local Host is :- "+ip1.getLocalHost());
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of the Program....");
	}
}
