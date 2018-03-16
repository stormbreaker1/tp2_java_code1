package abcd;

public class Characters_tom1 {
	public static void main(String[] args) {
		String str1 =  "Hello World";
		int len = str1.length();
		for(int x=0;x<len;x++)
		{
			System.out.println("Character at " + x + " is "+ str1.charAt(x));
		}
	}
}
