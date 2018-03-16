package abcd;

public class StaticVartom1 {
	
	public static int number = 0;
	
	public static void main(String[] args)
	{
		StaticVarjerry1 object_jerry = new StaticVarjerry1();
		StaticVarmobby1 object_mobby = new StaticVarmobby1();
		
		object_jerry.incrementNumber();
		object_mobby.incrementNumber();
		
		System.out.println("The Value of number is "+ number);
	}
}
