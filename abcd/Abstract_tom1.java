package abcd;

public class Abstract_tom1 extends Abstract_jerry1 {
	public static void main(String[] args)
	{
		Abstract_jerry1 object1 = new Abstract_jerry1();
		
		object1.saying();
		object1.returnNumber(24);
		
		// Math.abs(15.4);
		//
	
		// We should not create the object of abstract class, because an object is created when 
		 // we want to use the method of a class. But, inside an abstract class we dont have
		  // method definition of abstract method then what is the use of making object of 
		   // an abstract class.....
	}

}
