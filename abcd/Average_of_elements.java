package abcd;

public class Average_of_elements {
	public static void main(String[] args)
	{
		// we have stored marks of subjects in an array
		int[] subject_marks = new int[]{80,70,65,84,75};
		
		int Total = 0;
		
		for(int x=0; x<subject_marks.length; x++)
		{
			Total+=subject_marks[x];
		}
		
		// Total marks of subjects...
		System.out.printf("Total marks are %d ",Total);
		
		// Average marks of the subjects
		System.out.println("Average marks are:- " + Total/subject_marks.length);
	}
}
