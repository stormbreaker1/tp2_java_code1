package two_D_game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// This class is gonna be a class that will be controlling the enemies.
public class EnemyManager1 {
	private int amount;
	
	private List<Enemy1> enemies = new ArrayList<Enemy1>();
	
	private Dodge1 instance;
	
	public EnemyManager1(Dodge1 instance,int a)
	{
		this.amount = a;
		this.instance = instance; 
		
		// Method chaining.
		spawn();
	}
	
	private void spawn()
	{
		Random random = new Random();
		
		int ss = enemies.size();
		
		if(ss < amount)
		{
			for(int x=0; x<amount - ss; x++ )
			{
				enemies.add(new Enemy1(instance, random.nextInt(778),random.nextInt(100)));
			}
		}
		else if(ss > amount)
		{
			for(int x=0; x< ss - amount; x++ )
			{
				enemies.remove(x);
//				enemies.remove(x);
			}
		}
	}
	
	public void draw(Graphics g)
	{
		update();
		for(Enemy1 e:enemies)
		{
			e.draw(g);
		}
	}

	private void update() {
		boolean re = false;
		for(int i=0; i<enemies.size(); i++)
		{
			if(enemies.get(i).isDead())
			{
				enemies.remove(i);
				re = true;
			}
		}
		if(re)
		{
			spawn();
		}
	}
	public boolean isCollide(Rectangle hitbox)
	{
		boolean c  = false;
		for(int i=0; i<enemies.size(); i++)
		{
			if(hitbox.intersects(enemies.get(i).getHitbox()))
				{
					c = true;
				}
		}
		return c;
	}
}
