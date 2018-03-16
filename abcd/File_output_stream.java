package abcd;

import java.io.FileOutputStream;
import java.io.IOException;

public class File_output_stream {
	public static void main(String[] args)throws IOException
	{
		// opening the file to write something into it..
		FileOutputStream fout = new FileOutputStream("I:\\Programming\\My Channel Videos\\ThunderPearl Git\\Java_Practice1\\sample1.txt");
		
		// creating a string variable 
		String str = "Hey! I am your teacher";
		
		// getting the string into bytes...
		byte[] b = str.getBytes();
		
		// writing the bytes into the file.
		fout.write(b);
		
		// closing the open file...
		fout.close();
		
		System.out.println("Success in writing the file....");
	}
}
