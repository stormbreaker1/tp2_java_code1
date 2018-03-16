package abcd;

import java.util.*;
public class Practice_problem1 {
	public static void main(String[] args)
	{
		// boolean type array for storing the answers
		Boolean[] answers = new Boolean[8];
		
		// creating the object of scanner class
		Scanner scn = new Scanner(System.in);
		
		for(int x=0; x<answers.length; x++)
		{
			
			System.out.println("Enter your answer....");
			
			Boolean ans = scn.nextBoolean();
			System.out.println();
			
			if(ans==true || ans==false)
			{
				answers[x] = ans;
			}
			else
			{
				System.out.println("Enter the correct option");
				x--;
			}
		}
			scn.close();
			
			System.out.println("Your answer are.....");
			System.out.println();
			
			for(int y=0; y<answers.length; y++)
			{
				System.out.println((y+1)+" "+answers[y]);
			}		
	}
}
