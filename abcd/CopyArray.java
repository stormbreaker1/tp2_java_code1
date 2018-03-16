package abcd;

public class CopyArray {
	public static void main(String[] args)
	{
		// We are copying elements from source array to destination array....
		
		int array1[] = {3,4,5,6,7,8,9};
		int array2[] = new int[4];
		int array3[] = {0,1,2,3,4,5,6,7,8,9};
		
		// First parameter defines source array, second parameter tell the starting point from
		 // source array. Third parameter tells the destination array and fourth parameter tells
		  // starting point into destination array. And, finally fifth parameter tells the 
		   // number of elements to be copied from source to destination.....
		System.arraycopy(array1, 0, array2, 0, 3);
		
		for(int i:array2)
		{
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		System.arraycopy(array2, 0, array3, 0, 3);
		
		for(int j:array3)
		{
			System.out.printf("%d ",j);
		}
		
		
	}
}
