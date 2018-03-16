package abcd;

import java.util.Scanner;
public class Scanner_test {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		
		Scanner_test obj1 = new Scanner_test();
		obj1.saying(age);
		
		scn.close();
	}
	
	public void saying(int value)
	{
		System.out.println("You age is " + value);
	}
}
