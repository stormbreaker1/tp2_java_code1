package practice_problems;

import java.util.*;
public class Fibonacci_P2 {
	public static void main(String[] args)
	{
		// This is the program for making fibonacci series
		System.out.println("Enter the number of values you want...");
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		// creating the array of the size of the desired number of elements for 
		 // fibonacci series.
		int[] array = new int[num];
		
		int leng = array.length;
		
		array[0] = 0;
		array[1] = 1;
		
		for(int x=2; x<leng; x++)
		{
			array[x] = array[x-1] + array[x-2];
		}
		
		System.out.println("Your Fibonacci series is....");
		
		for(int y:array)
		{
			System.out.print(y + " ");
		}	
	}
}
