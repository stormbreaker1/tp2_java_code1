package abcd;

// So, In this case, an interface which is implemented by another class has to implement 
 // all the methods of interface, inclusing the parent interface.
public class Extending_Interface_mobby1 implements Extending_Interface_tom1{

	@Override
	public void saying() {
		// TODO Auto-generated method stub
		System.out.println("Hello! How are you doing .... ?");
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("I am creating this company ....");
	}
	
	public static void main(String[] args)
	{
		Extending_Interface_mobby1 mobbyObject1 =  new Extending_Interface_mobby1();
		
		mobbyObject1.saying();
		mobbyObject1.action();
	}
}
