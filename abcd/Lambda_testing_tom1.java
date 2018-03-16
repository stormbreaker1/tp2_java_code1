package abcd;

public class Lambda_testing_tom1 {
	
	public void greeting(Lambda_Testing_Jerry1 variable)
	{
		variable.saying();
	}
	
	public static void main(String[] args)
	{
		Lambda_testing_tom1 tomobject = new Lambda_testing_tom1();
		
		Lambda_Testing_Mobby1 mobbyobject = new Lambda_Testing_Mobby1();
		
		// for working of lambda, a variable must be of functional interface and 
		 // we also need to have to have same kind of method as in interface.
		Lambda_Testing_Jerry1 lambdavariable = ()-> System.out.println("Hello World");
		
		// All these 3 are doing the same things.
		mobbyobject.saying();
		tomobject.greeting(mobbyobject);
		
		lambdavariable.saying();
		
		// so, conclusion here is that to print hello we were doing whole polymorphism
		 // thing all along which is a bit tidy task.
		
		// But, with the help of lambda expression, we can achieve same in less code.
		
		// We are actually simplifying this concept also by lambda expression. 
		Lambda_Testing_Jerry1 innerObjectofJerry = new Lambda_Testing_Jerry1()
				{
					public void saying()
					{
						System.out.println("Hello World");
					}
				};
	
		innerObjectofJerry.saying();		
		
		// This is the test for inner classes and use of their method....
		Lambda_Testing_Mobby1 innerObjectofMobby = new Lambda_Testing_Mobby1()
				{
					public void saying()
					{
						System.out.println("Hello World of Inner Object of Mobby");
					}
				};
				
				innerObjectofMobby.saying();
	}
	

}