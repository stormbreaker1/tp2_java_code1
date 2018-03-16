package abcd;

public class Interface_tom3 {
	public static void main(String[] args) {
		Interface_tom3 object1 = new Interface_tom3();
		
		Interface_cobby3 obj1 = object1.getObject();
		
		// Below line will give the error as interface Interface_cobby3 do not have the greeting() method in it 
		// obj1.greeting();
		
		obj1.action();
	}
	
	public Interface_cobby3 getObject()
	{
		return new Interface_mobby3();
	}
}
