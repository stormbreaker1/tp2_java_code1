package abcd;

public class ObjinMeth_tom1 {
	// We can create the object of a class from a method also
	public void object_creation()
	{
		ObjinMeth_jerry1 objjerry1 = new ObjinMeth_jerry1();
		objjerry1.greeting();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		// An object can be created using below code as well.
		ObjinMeth_tom1 objtom1 = ObjinMeth_tom1.class.newInstance();
		objtom1.object_creation();
	}
}
