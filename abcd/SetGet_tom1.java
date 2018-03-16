package abcd;

public class SetGet_tom1 {
	public static void main(String[] args)
	{
		SetGet_jerry1 object1 = new SetGet_jerry1(100000);
		// SetGet_jerry1 object2 = new SetGet_jerry1();
		//object1.setSalary(100000);
		
		System.out.println("Your salary is "+object1.getSalary());
	}
}
