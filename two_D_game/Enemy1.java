package two_D_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy1 extends Entity1{

	private Rectangle hitbox;
	private boolean dead = false;
	private int ix, iy;
	private Dodge1 instance;
	
	// Entity1 is an abstract class, but it do not have abstract methods so we should atleast 
	 // implement the constructors.
	public Enemy1(Dodge1 instance,int x, int y) {
		super(x, y);
		this.instance = instance;
		hitbox = new Rectangle(x,y, 30,30);
		
		ix = 0;
		iy = 1;
	}

	private void move()
	{
		if(instance.getStage().isColloided(hitbox))
		{
			iy = 0;
			dead = true; 
		}
		
		hitbox.x += ix;
		hitbox.y += iy;
	}
	
	public boolean isDead()
	{
		return dead;
	}
	
	public Rectangle getHitbox()
	{
		return hitbox;
	}
	
	public void draw(Graphics g)
	{
		move();
		g.setColor(Color.GREEN);
		g.fillRect(hitbox.x, hitbox.y, hitbox.height, hitbox.width);
		
	}
}
