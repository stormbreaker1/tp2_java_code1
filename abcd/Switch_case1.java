package abcd;

import java.util.*;
public class Switch_case1 {
	public static void main(String[] args)
	{
		// Using scanner class to scan the input provided by user
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the input....");
		
		int num1 = scn.nextInt();
		
		// applying the switch cases.
		switch(num1)
		{
			case 4:
			System.out.println("selected number is 4");
			break;
				
			case 10:
			System.out.println("selected number is 10");
			break;
				
			// default action when no case matched.	
			default:
			System.out.println("I donno what the value is ?");
			break;
		}
	}
}
