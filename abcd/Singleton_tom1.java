package abcd;

// This is a concept called as singleton pattern. Under this concept only once instance of 
 // a class must be created.
public class Singleton_tom1 {
	public static void main(String[] args)
	{
		// This below code will give compile time error as constructor is private...
		// Singleton_jerry1 obj = new Singleton_jerry1();
		
		// Getting that instance of Singleton_jerry1 class.....
		Singleton_jerry1 obj = Singleton_jerry1.getInstance();
		
		// Now, using that object of Singleton_jerry1 class we can use other methods with same
		 // and single object.....
		obj.saying();
	}
}
