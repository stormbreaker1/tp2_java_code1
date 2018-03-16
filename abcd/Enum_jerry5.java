package abcd;

import abcd.Enum_tom5.tv_series;

public class Enum_jerry5 {
	public static void main(String[] args)
	{
		for(tv_series entertainment:tv_series.values())
		{
			System.out.println(entertainment);
		}
		System.out.println();
		
		// values() method will store all the enum constants into an array.
		// As entertainment is like an object then toString() cna be used here and it will 
		 // produce same result as above....
		for(tv_series entertainment:tv_series.values())
		{
			
			System.out.println(entertainment.toString());
		}
	}
}
