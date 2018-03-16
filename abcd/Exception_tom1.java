package abcd;

// Program for exception handling...
public class Exception_tom1 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 0;
		
		try{
			int ans = num1/num2;
			System.out.println("Your answer is "+ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
