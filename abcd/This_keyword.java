package abcd;

class This_keyword {
 
	// member variable
 int variable = 5;
 
 public static void main(String args[]) {
 This_keyword obj = new This_keyword();
 
 obj.method(20);
 obj.method();
 }
 
 // here "variable" is not same as "variable" of member variable :) :D :D 
 void method(int variable) {
	 // instance variable
	 variable = 10;
	 
	 // this.variable will call the member variable that is 5
	 System.out.println("Value of Instance variable :" + this.variable);
	 // here instance variable will be called
	 System.out.println("Value of Local variable :" + variable);
	 
	 // If there will not be a line variable = 10, then last line in this method 
	  // will print 20.
 }
 
 void method() {
	 int variable = 40;
	 System.out.println("Value of Instance variable :" + this.variable);
	 System.out.println("Value of Local variable :" + variable);
 }
}