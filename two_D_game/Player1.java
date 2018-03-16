package two_D_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player1 extends Entity1{
	
	private int xd, yd;
	private Dodge1 instance; // Dodge1 type variable.
	
	private Rectangle hitbox;  
	private int life = 3;
	
	// We will get the instance of Dodge1 from Player1 initialization in Dodge1 class
	// This instance of dodge will assign to Dodge1 type variable of this class.
	public Player1(Dodge1 instance, int x, int y) {
		super(x, y); // Default value of x and y will be 0 after parent constructor will be called.
		
		this.instance = instance; // purpose of "instance" will be to call getStage() method from  
		w = 16; h = 16;             // Dodge1 class.Entity1
		
		// Below code will construct the rectangle with the passed argument.
		hitbox = new Rectangle(x, y, w, h);
	}
		
	public void draw(Graphics g)
	{
		move();
		
		// <========= LOGIC FOR COLLISION DETECTION ============>
		
		// instance.getStage() will give Stage1 object.
		g.setColor(Color.orange);
		g.fillOval(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
		g.setColor(Color.LIGHT_GRAY);
		g.drawString("Lives Remaining:- "+life, 20, 20);
	}
	
	// This is the move method used for moving the entity.
	// Entity is there at x,y position as defined above, have width and height as above....
	// So for moving we are adding xd and yd into the current position. 
	private void move()
	{
//		x += xd;   // x = x + xd;
//		y += yd;   // y = y + yd;
		
		if(!instance.getStage().isColloided(hitbox))
		{
			// this block of code will even make rectangle fall downward.... 
			 // as 1 will keep on adding into y co-ordinate of rectangle inside move()
			yd = 1;
		}
		else
		{
			yd = 0;
		}
		
		hitbox.x += xd;
		hitbox.y += yd;
		
		if(instance.getEnemyManager().isCollide(hitbox))
		{
			if(life>0)
			{
				life--;
				
				hitbox.x = 800/2 - w/2;
				y = 400;
			}
			else
			{
				instance.setGameOver(true);
			}
		}
	}
	
	public void setXD(int value)
	{
		xd = value;
	}
	
	public void setYD(int value)
	{
		yd = value;
	}
	
}
