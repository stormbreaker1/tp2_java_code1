package abcd;

public class Inheritence_tom1 {
	public static void main(String[] args)
	{
		// Creating object of Inheritence_jerry1 
		Inheritence_jerry1 object_of_jerry1 = new Inheritence_jerry1();
		Inheritence_mobby1 object_of_mobby1 = new Inheritence_mobby1();
		
		Inheritence_cobby1 object_of_cobby1 = new Inheritence_cobby1();
		
		// Initializing member inherited variable 
		object_of_jerry1.num1 = 11;
		object_of_mobby1.num1 = 12;
		
		// This will print the above values....
		System.out.println(object_of_jerry1.num1);
		System.out.println(object_of_mobby1.num1);
		
		// Will call the respective methods of jerry and mobby class
		object_of_jerry1.action();
		object_of_mobby1.action();
		
		// Default value for num1 will be 0 
		System.out.println(object_of_cobby1.num1);
		
		// We can get the class name using below method
		System.out.println(object_of_cobby1.getClass().getName());
		
		// System.out.println(object_of_mobby1.action());
		
		
		
		
	}
}
