package abcd;

import java.util.Scanner;

// This program is for testing assertion in Java
public class Assert_tom2 {
	public static void main(String[] args)
	{
		System.out.println("Enter your gearscore...");
		
		Scanner scn1 = new Scanner(System.in);
		int gearscore1 = scn1.nextInt();
		
		assert gearscore1>=5000:"You should have gearscore more than 5000 to enter raid";
		
		System.out.println("Your Gearscore is "+gearscore1+ ", You can Enter");
		
		scn1.close();
		
		
	}
}
