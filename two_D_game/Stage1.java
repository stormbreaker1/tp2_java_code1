package two_D_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Stage1 {
	
	private Rectangle platform1 = new Rectangle(0, 500, 759, 20);
	
	public Stage1()
	{
		
	}
	
	public boolean isColloided(Rectangle entity)
	{
		// "intersects" method actaully check if two rectangles have collided or not ?
		return platform1.intersects(entity);
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.WHITE); // setting color to white
		
		// We can't change the variables here, they are fixed....
		g.fillRect(platform1.x, platform1.y, platform1.width, platform1.height); // we are creating a rectangle.	
	}
}
