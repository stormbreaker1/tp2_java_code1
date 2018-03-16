package abcd;

// This program is for testing assertion in java..............
// To enable assertion we have to go to "Run-->Run Configurations-->Java Application-->Running
  // Program--> Arguments tab--> VM Arguments", type "-ea" then apply and run   ............
public class Assert_tom1 {
	public static void main(String[] args)
	{
		System.out.println("We are trying assertion implementation here.....");
		
		Assert_tom1 obj = new Assert_tom1();
		
		
		System.out.println(obj.checkingAssert(-100));
		
		// This below line will not get executed as assertion thrown an error and program
		 // terminates right here......
		System.out.println("Program Ends Here........");
	}
	
	String checkingAssert(int age)
	{
		// This below assert code will activate only when it will return false..... 
		// Assertion never replaces exception but it compliments it................
		assert(age<150):"You entered a wrong age, that is "+age;
		
		if(age > 0 )
		{
			return "Your age is " + age;
		}
		else
		{
			return "Please enter the age greater than 0";
		}
	}
}
