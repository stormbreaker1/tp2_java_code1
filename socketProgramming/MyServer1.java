package socketProgramming;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer1 {
	public static void main(String[] args){  
		try{  
		ServerSocket ss=new ServerSocket(6666);  
		
		// create the connection between server and client.
		Socket s=ss.accept();//establishes connection   
		
		// s.getInputStream() will get the input stream attached with that socket....
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		
		// Code from this line will get executed when client code will run....
		String  str=(String)dis.readUTF();  
		System.out.println("message= "+str);  
		ss.close();  
		}catch(Exception e){System.out.println(e);}  
		} 
}
// We can actually crate 2 consoles in eclipse as well....
