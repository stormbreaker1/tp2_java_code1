package abcd;

public class Polymorphism_tom1 {
	public static void main(String[] args)
	{
		Polymorphism_jerry1 obj = new Polymorphism_jerry1();
		doSomething(obj);
	}
	
	public static void doSomething(Polymorphism_jerry1 arg0)
	{
		arg0.saying();
	}
}
