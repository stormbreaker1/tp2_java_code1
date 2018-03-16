package abcd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadingFields_tom1 {
	public static void main(String[] args)
	{
		try
		{
			// create a new file with an ObjectOutputStream
	         FileOutputStream out = new FileOutputStream("test.txt");
	         ObjectOutputStream oout = new ObjectOutputStream(out);

	         // write something in the file
	         oout.writeObject(new ReadingFields_jerry1());
	         oout.flush();

	         // create an ObjectInputStream for the file we created before
	         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));

	         // read the object and print the string
	         ReadingFields_jerry1 a = (ReadingFields_jerry1) ois.readObject();

	         // print the string that is in Example class
	         System.out.println("" + a.s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
