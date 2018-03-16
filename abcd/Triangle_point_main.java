package abcd;

// This is one good program for getting the triangle co-ordinates using helper class.
public class Triangle_point_main {
	public static void main(String[] args)
	{
		// creating the objects of Point class for proving coordinates.... 
		Point pointA = new Point(1,2);
		Point pointB = new Point(3,5);
		Point pointC = new Point(4,7);
		
		// Assigning above objects for points into the member variables of Triangle class.
		Triangle triangle1 = new Triangle(pointA, pointB, pointC);

		// Calling getCoordinates() method on the object of Triangle class.....
		triangle1.getCoordinates();
	}
}
