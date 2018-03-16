package abcd;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization_tom2 {
	// We are gonna have checked exception hence we need to throws the below exception...
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream("C:\\eclipse practice\\serializable_file.txt");
		
		//
		ObjectInputStream ois = new ObjectInputStream(fin);
		
	//	Serialization_jerry1 objofjerry1 = new Serialization_jerry1();
		
		
		
	//	System.out.println(ois.readObject()); // This is not working as expected....
		
		// ois.readObject() will return object from serializable_file.txt and that object is 
		 // of Serialization_jerry1.java class
		Serialization_jerry1 valueofjerry1 = (Serialization_jerry1) ois.readObject();
		
		// This is working perfectly.....
		 // We have used the saved object to call the getSalary() method .
		System.out.println("The Salary is " + valueofjerry1.getSalary());
		
		ois.close();
	}
}
