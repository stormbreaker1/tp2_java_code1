package abcd;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ReadingFields_jerry1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String s = "Hey! How are You ????";
	
	private String readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		// ObjectInputStream.GetField is a class in Java ....
		ObjectInputStream.GetField gf = in.readFields();
		
		return (String) gf.get("s",null); 
	}
	
}
