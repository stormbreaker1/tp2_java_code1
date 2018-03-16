package abcd;

public class Split1 {
	public static void main(String[] args) {
		String string1 = "hello,how,are,you?";
		
		String lineParts[] = string1.split(",");
		
		for(String word:lineParts)
		{
			System.out.println(word);
		}
	}
}
