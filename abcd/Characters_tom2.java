package abcd;

public class Characters_tom2 {
	public static void main(String[] args) {
		String str1 = "'Hello'";
		
		String final_word = "";
		
		int len = str1.length();
		
		for(int i=1;i<len-1;i++)
		{
			char mychar = str1.charAt(i);
			final_word = final_word.concat(Character.toString(mychar));
		}
		
		System.out.println("Trimmed String is:- " + final_word);
	}
}
