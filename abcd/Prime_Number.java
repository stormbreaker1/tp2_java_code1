package abcd;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args)
	{
		int m;
		int flag = 0;
		
		System.out.println("Enter the number to be tested for prime number");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		m = number/2;
		
		for(int i=2; i<=m; i++)
		{
			if((number%i)==0)
			{
				System.out.println("Number is not a Prime Number....");
				flag = 1;
				break;
				
			}
		}
		
		if(flag==0)
		{
			System.out.println("Number is a Prime Number....");
		}				
		
	}
}
