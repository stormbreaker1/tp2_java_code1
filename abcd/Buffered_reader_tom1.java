package abcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_reader_tom1 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter Your Name:----");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Your Name is "+br.readLine());
		
	}
}
