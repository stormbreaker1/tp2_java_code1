package abcd;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args)
	{
		int flag = 0;
		
		do
		{
			System.out.println("Enter a even number....");
			
			Scanner scn1 = new Scanner(System.in);
			int number = scn1.nextInt();
			
			if((number%2)==0)
			{
				System.out.println("You Entered Even number");
				flag = 1;
				
				scn1.close();
			}
			
			else
			{
				System.out.println("You did not enter Even Number....");
			}
			
		}
		while(flag == 0);
	}
}
