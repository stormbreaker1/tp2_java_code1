package design_patterns;

public class ShapeFactory1
{
//use getShape method to get object of type shape 
public Shape1 getShape(String shapeType)
   {
	//	Shape1 value = null;
	   if(shapeType == null)
	   {
	      return null;
	   }		
	   if(shapeType.equalsIgnoreCase("Circle"))
	   {
	      return new Circle1();   
	   }
	   else if(shapeType.equalsIgnoreCase("Rectangle"))
	   {
		   return new Rectangle1();
       } 
	   else if(shapeType.equalsIgnoreCase("Triangle"))
	   {
		   return new Triangle1();
       }
   
	  // return value;
	    // In starting of method we have declared "value" as "Shape1" type. So, now 
	     // if we return value which is assigned null then it is same as directly 
	      // returning null. We are doing this because this method's return type is Shape1.
	   return null;
   }
}