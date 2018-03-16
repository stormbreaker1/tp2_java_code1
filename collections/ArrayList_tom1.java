package collections;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;;
public class ArrayList_tom1 {
	public static void main(String[] args)
	{
		// Collections is a framework and it is used to handle data with different requirements
		 // with single object....
		// It is like an Array of String type....
		ArrayList<String> alist = new ArrayList<String>();
		
		// Asking users to enter the names....
		System.out.println("Please give the 6 names of your team members....");
		
		// Creating scanner object....
		Scanner scanner = new Scanner(System.in);
		
		// Adding 6 names of team mates <String>
		for(int i=0; i<6; i++)
		{
			alist.add(scanner.nextLine());
		}
		
		Iterator<String> itr = alist.iterator();
		
		System.out.println("=================================================>");
		System.out.println("You Entered your Team mates names as:-  ");
		System.out.println("=================================================>");
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
	}
}
