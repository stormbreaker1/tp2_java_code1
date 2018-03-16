package abcd;

// This program will show the Call By Reference implementation
class CallByReference_tom1 {
	
	int number1 = 100;
	
	void changeNumber(CallByReference_tom1 ob)
	{
		ob.number1 = ob.number1 + 57;
	}
	
	public static void main(String[] args)
	{
		// creating an object
		CallByReference_tom1 object1 = new CallByReference_tom1();

		System.out.println("Value of number1 before applying method is:- ");
		System.out.println(object1.number1);
		
		System.out.println();
		System.out.println();
		
		// Call by reference is possible in java only if we pass object in the method
		// Then changes will be reflected in the original value
		
		
		System.out.println("Value of number1 after implementation of changeNumber method is:- ");
		object1.changeNumber(object1);
		
		System.out.println(object1.number1);
	}
}
