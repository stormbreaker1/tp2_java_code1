package collections;

import java.util.ArrayList;

public class ArrayList_tom2 {
	public static void main(String[] args)
	{
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(11);
		alist.add(12);
		alist.add(23);
		alist.add(35);
		alist.add(75);
		
		// As ArrayList is an Array, hence we can access it like below as well
		// This below is the enhanced for loop in java
		for(int number:alist)
		{
			System.out.print(number+"\t");
		}

	}
}
