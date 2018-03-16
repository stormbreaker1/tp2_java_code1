package abcd;

public class Constructor_jerry4 {

	public Constructor_jerry4()
	{
		// A Constructor just do not have explicit return type, but implicitly it can return 
		 // things just like below....
		saying();
		
		System.out.println("Constructor is Ending.....");
	}
	
	public String saying()
	{
		return "Hello!!!!";
	}
}