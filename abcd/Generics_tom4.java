package abcd;

public class Generics_tom4 {
	public static void main(String[] args)
	{
		Generics_jerry4<String, Integer> object1 = new Generics_jerry4<String, Integer>("Simon's",20000);
		object1.info();
	}
}
