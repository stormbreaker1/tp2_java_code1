package abcd;

public class CallByValue_tom1 {
	public static void main(String[] args)
	{
		int x = 10;
		int y[] = {2,3,4,5,6,7,8,9};
		
		CallByValue_tom1 object1 = new CallByValue_tom1();
		object1.changeInt(x);
		
		System.out.println("Value of x is : "+x);
		System.out.println();
		
		System.out.println("Array elements after method changeArray1 are:- ");
		object1.changeArray1(y);
		
		
		System.exit(0);
		
		System.out.println("Array elements after method changeArray2 are:- ");
		object1.changeArray2(y);
		
		System.out.println("Printing Array using for loop: ");
		for(int z:y)
		{
			System.out.print(z+" ");
		}
	}
	
	public void changeInt(int i)
	{
		i+=4;
	}
	
	public void changeArray1(int array1[])
	{
		
		for(int j:array1)
		{
			j+=1;
		}
		
		for(int k:array1)
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		System.out.println();
		
	}
	
	public void changeArray2(int array2[])
	{
		for(int j:array2)
		{
			j+=1;
		}
	}
}
