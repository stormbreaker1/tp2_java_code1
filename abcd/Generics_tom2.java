package abcd;

public class Generics_tom2 {
	public static void main(String[] args)
	{	
		// Number of arguments given in as generics <Boolean> must be same as 
		 // number of argument given in Generics_jerry2 class.
		// For type safety we are giving <Boolean>
		Generics_jerry2<Boolean> obj1 = new Generics_jerry2<Boolean>(Boolean.TRUE);
		obj1.printType();
		
		// For type safety we are giving <String>
		Generics_jerry2<String> obj2 = new Generics_jerry2<String>("YOYO");
		obj2.printType();
 	}
}
