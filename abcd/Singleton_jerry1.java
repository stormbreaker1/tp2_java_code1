package abcd;

//This is a concept called as singleton pattern. Under this concept only once instance of 
// a class must be created.
public class Singleton_jerry1 {
	
	// creating the object of this Singleton_jerry1 class
	private static Singleton_jerry1 instance = new Singleton_jerry1();
	
	// creating a private default constructor so that this class's instance can't be created.
	private Singleton_jerry1()
	{
		// This is the default private constructor.....
	}
	
	// only available global object.....
	public static Singleton_jerry1 getInstance()
	{
		return instance;
	}
	
	public void saying()
	{
		System.out.println("Hello!! How are You doing ?????");
	}	
}
