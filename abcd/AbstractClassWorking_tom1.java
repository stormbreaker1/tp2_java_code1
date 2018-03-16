package abcd;

// We have to provide the implementation of the abstract method of the abstract class
public class AbstractClassWorking_tom1 extends AbstractClassWordking_jerry1{
	public static void main(String[] args) {
		
		AbstractClassWorking_tom1 tom_object1 = new AbstractClassWorking_tom1();
		
		callingMethods(tom_object1);
	}
	
	void saying()
	{
		System.out.println("I am the saying method of the tom class....");
	}
	
	public static void callingMethods(AbstractClassWorking_tom1 obj)
	{
		obj.saying();
	}
}
