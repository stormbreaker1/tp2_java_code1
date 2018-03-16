package abcd;

// In this program we will be using switch for enum.............
public class Enum_tom3 {
	enum Movies
	{
		Bahubali,NannakuPrematho,DRStrange,DearZindagi,BeforeSeries; 
	}
	
	public static void main(String[] args)
	{
		Movies movie = Movies.Bahubali;
		
		switch(movie)
		{
			case Bahubali:
				System.out.println("Your choice is Bahubali");
				break;
				
			case NannakuPrematho:
				System.out.println("Your choice is Nannaku Prematho");
				break;
				
			case DRStrange:
				System.out.println("Your choice is Dr. Strange");
				break;
				
			case BeforeSeries:
				System.out.println("Your choice is Before Series");
				break;
				
			default:
				System.out.println("You did not made any choice....");
				break;
				
		}
	}
}
