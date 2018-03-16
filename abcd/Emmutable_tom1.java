package abcd;

public class Emmutable_tom1 {
	public static void main(String[] args)
	{
		// In case of this below code every time new String object will get created and 
		 // these strings will take different place in memory.
		String string1 = new String("Hello World");
		String string2 = new String("Hello World");
		
		
		// This is called as string literal
		// Internally intern() is called and this value of string will get stored in pool of
		 // String. If same value will be assigned to other string variable then JVM will check
		  // that value in the string pool. If that value exists in pool then JVM will just 
		   // assign same reference to this new variable else it will create new variable 
		String string3 = "Huahhaha";
		String string4 = "Huahhaha";
		
		System.out.println(string1==string2);
		System.out.println(string3==string4);
		System.out.println(string2==string4);
		System.out.println(string1.equals(string2));
		
		System.out.println(45);
	}
}
