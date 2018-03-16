package abcd;

public class Overloading_tom1 {
	public static void main(String[] args)
	{
		Overloading_tom1 obj1 = new Overloading_tom1();
		
		// add method without argument
		obj1.add();
		
		// add method with single integer
		System.out.println(obj1.add(4));
		
		// add method with two integers
		System.out.println(obj1.add(11, 12));
		
		// We are calling overloaded main() method and as it is static, we do not need it's 
		 // reference to call it.
		main();
	}

	public void add()
	{
		System.out.println("You entered nothing");
	}
	
	public int add(int num1)
	{
		return num1;
	}
	
	public int add(int num1, int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main()
	{
		System.out.println("I am the main method without argument");
	}
}
