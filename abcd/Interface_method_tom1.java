package abcd;

public class Interface_method_tom1 {
	public static void main(String[] args)
	{
		// This way we are defining objects of each class which are implementing mobby interface.
		 // Objects are of type Interface_method_mobby1. Benefit is that we can't call action method
		  // of jerry these objects. So, we are restricting jerry to use
		   // implemented method from the interface.
		
		// Below, we are having the dynamic binding, as object is getting identified at the runtime.
		Interface_method_mobby1 jerryObject = new Interface_method_jerry1();
		Interface_method_mobby1 cobbyObject = new Interface_method_cobby1();
		
		jerryObject.saying();
		
		// Below code will give the error because jerryObject which is of type mobby do not have
		 // method action() defined in mobby interface.
		
		// jerryObject.action();
		
		cobbyObject.saying(); 
	}
}
