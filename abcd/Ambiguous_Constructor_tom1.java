package abcd;

public class Ambiguous_Constructor_tom1 {
	public static void main(String[] args) {
		
		// This below code will give error for "Ambiguous Constructor" error
		 // because we have overloaded the constructor in the jerry clas.
		// So, when we pass the null value, java do not know which constructor to assign the 
		 // null value.
		Ambiguous_Constructor_tom1 object = new Ambiguous_Constructor_tom1(/*null*/);
		
		
	}
}
