package abcd;

public class Generics_tom1 {
	public static void main(String[] args)
	{ 
		// This below code will take any variable as we are using generics
		Generics_jerry1 gj_object1 = new Generics_jerry1(24);
		
		// But, if want to make type safe then, we will be using below code.
		 // Above code is giving warning also because we have not made it type safe.
		Generics_jerry1<Integer> gj_object2 = new Generics_jerry1<Integer>(35);
		
		Generics_jerry1<String> gj_object3 = new Generics_jerry1<String>("35");
		
		 
		System.out.println(gj_object1.display_data());
		System.out.println(gj_object2.display_data());
		System.out.println(gj_object3.display_data());
	}
}
