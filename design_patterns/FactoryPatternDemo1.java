package design_patterns;

public class FactoryPatternDemo1 {
	public static void main(String[] args)
	{
		// This is the main class which will create
		ShapeFactory1 shapefactoryobject = new ShapeFactory1();
		
		Shape1 shape_x = shapefactoryobject.getShape("Circle");
		shape_x.draw();
		
		Shape1 shape_y = shapefactoryobject.getShape("Triangle");
		shape_y.draw();
		
		Shape1 shape_z = shapefactoryobject.getShape("Rectangle");
		shape_z.draw();
	}
}
