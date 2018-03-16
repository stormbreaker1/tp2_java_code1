package abcd;

public class MemberVariableTesting {
	public static void main(String[] args)
	{
		int num = 0;
		
		int array1[] = new int[]{3,4,5,6,7,8};
		
		for(int i = 0; i<=10; i++)
		{
			num += 1;
		}
		
		// This will print the new value achieved using for loop.....
		System.out.println(num);
		
		change(num);
		
		// This will just print 11 again because in change() method, value has been passed as 
		 // call by value....
		System.out.println(num);
		
		System.out.println("Checking for the array....");
		
		// An array will always be passed as reference inside a method in Java language ....
		arrayChange(array1);
		
		for(int r:array1)
		{
			System.out.print(r + "\t");
		}
		
	}
	
	
	// Now using a method....
	// In java, everything is passed as value, but in case of java array is passed as reference 
	 // because array is an object and when we pass array inside a method then array's reference 
	  // is copied into that method....
	public static void change(int x)
	{
		x += 5;
		System.out.println(x);
	}
	
	public static void arrayChange(int y[])
	{
		for(int p=0; p<y.length; p++)
		{
			y[p] += 1;
		}
	}
}
