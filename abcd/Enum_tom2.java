package abcd;

// This is very simple example of enum.............................
// enum can be defined outside the class as well bcoz it is similar to a class....

enum Genre
{
	Action,Romantic,Drama,Suspence,Tragedy;
}
public class Enum_tom2 {

	public enum Days
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
	
	public static void main(String[] args)
	{
		for(Days days:Days.values())
		{
			System.out.printf("%s ",days);
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------");

		
		System.out.println("Now, we will access the outside enum....");
		
		for(Genre movie:Genre.values())
		{
			System.out.printf("%s ",movie);
		}
	}
}
