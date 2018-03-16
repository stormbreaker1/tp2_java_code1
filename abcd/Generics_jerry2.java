package abcd;

// Using generics here in this program

// Here T is an unbounded parameter so during type 
 // erasure process Java compiler replaces it with the Object.
public class Generics_jerry2<T> {
	private T ObjReff;
	
	Generics_jerry2(T value)
	{
		ObjReff = value;
	}
	
	public T getObjReff()
	{
		return ObjReff;
	}
	
	public void printType()
	{
		// This below method, getClass().getName() is pretty important method....
		System.out.println("Name of the Class is " + ObjReff.getClass().getName());
		System.out.println("Class is "+ ObjReff.getClass());
		// System.out.println("Name is "+ObjReff.getName());
		System.out.println("You passed "+ ObjReff);
	}
}
