package abcd;

public class Constructor_tom2 {
	public Constructor_tom2()
	{
		System.out.println("Hello!! I am the constructor of tom one...");
		
		// "this" is actually the instance of the class in which it is used. 
		// "this" is used here so it refers to the instance of "Constructor_tom2"
		// We are actually instantiating the constructor of Constructor_jerry2 class here....
		new Constructor_jerry2(this);  // Object creation of Constructor_jerry2 class....
		this.saying();
	}
	
	public static void main(String[] args)
	{
		// Here we are creating an object but also saving that object in an instance variable...
		Constructor_tom2 obj1 = new Constructor_tom2();
		
		// Here we are creating an object but not creating an instance variable...
		new Constructor_tom2();
	}
	
	public void saying()
	{
		System.out.println("Heyyyy!!! I am the saying method of tom....");
	}
	
//	public static void action()
//	{
//		System.out.println("I am the action method of tom...");
//		
//		// Static methods cannot use the "this" keyword as static method belongs to a class not
//		 // to an object. And, "this" refers to the current class instance....
//		new Constructor_jerry2(this);
//	}
}
