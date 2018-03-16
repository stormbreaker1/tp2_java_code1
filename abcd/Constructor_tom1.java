package abcd;

public class Constructor_tom1 {
	
	private int age;
	// This is the constructor of this class......
	Constructor_tom1(int age)
	{
		this.age = age;
		System.out.println("I am the constructor, Guyssssss");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Constructor will get invoked as soon as we create the object of constructor class....");
	
		Constructor_tom1 obj1 = new Constructor_tom1(35);
		
		System.out.println("Constructor has already invoked and finished....");
	}
}
