package abcd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// This program is for understanding the concept of serialization
public class Serialization_tom1{
	public static void main(String[] args) throws IOException
	{
		Serialization_jerry1 object_jerry = new Serialization_jerry1(200000);
		
		FileOutputStream fout = new FileOutputStream("C:\\eclipse practice\\serializable_file.txt");
		
		ObjectOutputStream Oout = new ObjectOutputStream(fout);
		
		// telling, which object has to be written to the file
		Oout.writeObject(object_jerry);
		Oout.flush();
		
		System.out.println("Success in Serialization");
	}
}
