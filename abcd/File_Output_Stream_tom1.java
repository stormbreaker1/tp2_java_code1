package abcd;

//FileOutputStream for writing the file...........

import java.io.*;  
class File_Output_Stream_tom1{  
public static void main(String args[])
	{  
	try{  
		  FileOutputStream fout = new FileOutputStream("C:\\Java_Practice\\abc.txt");  
		  String s = "Sachin Tendulkar is my favourite player....";  
		  byte b[] = s.getBytes();//converting string into byte array  
		  fout.write(b);  
		  fout.close();  
		  System.out.println("success...");  
	 }
	catch(Exception e)	
		{
		   System.out.println(e);
		  }  
	   }  
} 
