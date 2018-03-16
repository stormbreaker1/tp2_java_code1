package abcd;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	// These getters are very important as in Triangle class we are using these getters.
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
