package abcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser_tom1 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter your Input: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println("You Entered: " + str);
		
		
	}
}
