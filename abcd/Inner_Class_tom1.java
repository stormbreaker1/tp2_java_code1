package abcd;

// This is how we implement the concept of the inner class.
public class Inner_Class_tom1 {
	private int num = 4;
	private String str = "hello";
	
	// Inner class can access the private member variables of a class....
	private class Inner_Class_jerry1
	{
		void saying()
		{
			System.out.println(str +" "+ num);
		}
	}
	
	public static void main(String[] args)
	{
		Inner_Class_tom1 t_obj = new Inner_Class_tom1();
		Inner_Class_tom1.Inner_Class_jerry1 tk_obj = t_obj.new Inner_Class_jerry1();
		
		tk_obj.saying();
		
		// Can't create like below ....
	//	Inner_Class_tom1.Inner_Class_jerry1 tk_obj2 = new Inner_Class_tom1.Inner_Class_jerry1();
	}
}
