package abcd;

public class Classesss {
	public static void main(String[] args)
	{
		Apprentice obj = new Apprentice(24);
		
		System.out.println("The value of x is " + obj.getX());
		
	}
}

// This level of defining two classes in same file is possible but this is not 
 // a good advise to do so.
// We would not be able to tell whose .class file it is 
// Other limitation is we cannot directly initialize x in below class
// Instead, if we want to have 2 classes in same file use the concept of nested classes
 // that thing is easy to handle as well efficient to put top level classes at same
  // place.
class Apprentice
{
	int x;
	
	Apprentice(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return x;
	}
}