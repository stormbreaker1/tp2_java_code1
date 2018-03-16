package abcd;

public class Triangle {
	// these are like objects of Point class
	 Point A;
	 Point B;
	 Point C;

	 public Triangle(Point a, Point b, Point c)
	 {
		 A = a;
		 B = b;
		 C = c;
	 }
	 
	 public void getCoordinates()
	 {
		 // methods are being called on the objects of Point class
		 System.out.println("Value of x is " + A.getX() + " and Value of y is " + A.getY() + " for vertex A");
		 System.out.println("Value of x is " + B.getX() + " and Value of y is " + B.getY() + " for vertex B");
		 System.out.println("Value of x is " + C.getX() + " and Value of y is " + C.getY() + " for vertex C");
	 }
	 
	 
	
}
