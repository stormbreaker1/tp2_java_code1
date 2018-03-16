package abcd;

public class Interface_tom2 {
	public static void main(String[] args)
	{
		Interface_tom2 object1 = new Interface_tom2();
		System.out.println(object1.nextString());;
	}
	
	public Interface_jerry2 nextString()
	{
		return new Interface_jerry2()
				{
					public String returnString()
					{
						return "meowwwwww";
					}
				};
	}
}
