package abcd;

public class Arrays1 {
	public static void main(String[] args)
	{
		// Array Declaration
		int[] array1 = new int[4];
		
		// int array5[] = new int[4];
		
		int[] array2 = new int[]{2,3,4,5};
		
		int[] array3 = {3,4,5,6,7,8};
		
		int[] array4;
		 
		array4 = new int[6];
		
		array4[0] = 11;
		array4[1] = 12;
		array4[2] = 23;
		array4[3] = 35;
		array4[4] = 45;
		array4[5] = 52;
		
		
		System.out.println("Elements of the array4 are.......");
		for(int x=0; x<(array4.length); x++)
		{
			System.out.println(array4[x]);
		}
		
		Arrays2 obj1 =new Arrays2();
		obj1.saying();
		
		
		for(int x:array4)
		{
			System.out.println(x);
		}
	}
}
