package abcd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Input_Stream_tom1 {
	public static void main(String[] args) throws IOException
	{
		// This class is use to read the stream of raw bytes
//		FileInputStream fin = new FileInputStream("C:\\eclipse practice\\abc.txt");
//		int i = 0;
//		
//		while((i = fin.read())!=-1)
//		{
			// output will be byte by byte...
//			System.out.print(i);
//		}
		
		// Read the the documentation from the oracle website..... 
		FileReader fr = new FileReader("C:\\Java_Practice\\abc.txt");
		
		// This is wrapping the BufferedReader around FileReader class 
		BufferedReader br = new BufferedReader(fr);
//		String line;
		//while((line = br.readLine())!=null)
	//	{
			System.out.println(br.readLine());
		//}
		
		/*will buffer the input from the specified file. Without buffering, 
		 * each invocation of read() or readLine() could cause bytes to be read 
		 * from the file, converted into characters, and then returned, which can be 
		 * very inefficient.
*/
			fr.close();
	}
	
}
