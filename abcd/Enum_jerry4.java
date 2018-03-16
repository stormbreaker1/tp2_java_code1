package abcd;

public class Enum_jerry4 {
	public static void main(String[] args)
	{
		// This way we have used all the abstract methods of enum constants.....................
		// values() method will create an array which will hold all the objects of enum.....
		for(Enum_tom4 direction:Enum_tom4.values())
		{
			System.out.println(direction.getOppositeDirection());
		}
	}
}
