package abcd;

public class Interface_tom1 implements Interface_jerry1{
	public static void main(String[] args)
	{
		Interface_tom1 obj1 = new Interface_tom1();
	//	Interface_jerry1 obj2 = new Interface_jerry1(); 
		
		// we can store the object in an variable which is interface type
		 // but that class must implement that interface....
		Interface_jerry1 obj3 = new Interface_tom1(); 
		
		obj1.saying();
		obj1.calling(obj3);
	}
	
	public void calling(Interface_jerry1 var)
	{
		var.saying();
	}
	
	@Override
	public void saying()
	{
		System.out.println("I am the saying method..... ");
	}
}
