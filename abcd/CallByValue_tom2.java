package abcd;

public class CallByValue_tom2 {
	// As this number is outside the main method, so it can be called with reference of object only.
	int number = 10;
	
	// passsing by reference
	public void change(CallByValue_tom2 ob)
	{
		ob.number = ob.number + 10;
	}
	
	// Passing by value
//	public void change2(int x)
//	{
//		x = x + 1;
//	}
	
	public static void main(String[] args)
	{
		CallByValue_tom2 object1 = new CallByValue_tom2();
		object1.change(object1);
		
		// if we pass object instead of any premitive value then change will get reflected in 
		 // original value.
		System.out.println("Changed Value of number is: "+object1.number);
		//System.out.println("Value of number without object is: ");
	}
}
// Simple rule of call by value and call by reference is that int is a primitive type, so when 
 // when some variable is passed in a method and variable is primitive type then it will be passed
  // as value but when a reference variable or object is passed in a method then it is passed as 
   // reference. This rule is for Java.