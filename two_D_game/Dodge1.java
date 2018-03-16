package two_D_game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Dodge1 extends JPanel implements KeyListener{
	
//	private int x = 5;
//	private int y = 5;
	
	private Player1 player_instance;
	private Stage1 stage_instance;
	// private Enemy1 enemy_instance;
	private EnemyManager1 enemy_mg_instance;
	private boolean isGameOver = false;
	
	// constructor
	public Dodge1()
	{
		setSize(751,571);
		setPreferredSize(new Dimension(751,571));
		// setBackground(Color.BLACK); // this is background color of the JPanel.
		setFocusable(true); // This is very useful for KeyListener to work.
		addKeyListener(this);
		
		stage_instance = new Stage1();
		
		// "this" will have reference of Dodge1 class.
		player_instance = new Player1(this,200,200); 
		
		enemy_mg_instance = new EnemyManager1(this, 10);
		
		// creating instance of enemy; 
	//	enemy_instance = new Enemy1(this, 20, 20);
	}
	
	@Override
	public void update(Graphics g)
	{
		paint(g);
	}
	
	// Every swing class have a paint method which can be called once only.
	public void paint(Graphics g)
	{
		// This will give the black color to the background or say board.
		g.setColor(Color.BLACK);
		// getWidth() and getHeight() will receive the height and width of JPanel automatically.
		g.fillRect(0, 0, getWidth(), getHeight());
		
		// We want stage to be below the player so, we have created stage first stage player.
		stage_instance.draw(g);
		
		if(!isGameOver)
		{
			player_instance.draw(g);
			//	enemy_instance.draw(g);
			enemy_mg_instance.draw(g);
		}
		else
		{
			g.setFont(new Font("Century Gothic",Font.BOLD, 24));
			g.drawString("GAME OVER", 200, 200);
		}
		
	
		
//		g.setColor(Color.WHITE); // setting color to white
//		g.fillRect(0, 500, 759, 20); // we are creating a rectangle.
		g.dispose();
		
		repaint();
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
	int key_code1 = e.getKeyCode();
		
		if(key_code1 == KeyEvent.VK_W)
		{
			// player_instance.setYD(-1);
		}
		
		if(key_code1 == KeyEvent.VK_S)
		{
			// player_instance.setYD(1);
		}
		if(key_code1 == KeyEvent.VK_A)
		{
			player_instance.setXD(-1);
		}
		if(key_code1 == KeyEvent.VK_D)
		{
			player_instance.setXD(1);
		}
		
	}

	public void setGameOver(boolean flag)
	{
		isGameOver = flag;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		player_instance.setXD(0);
		player_instance.setYD(0);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	
	}
	
	public Stage1 getStage()
	{
		return stage_instance;
	}
	
	public EnemyManager1 getEnemyManager()
	{
		return enemy_mg_instance;
	}
	
	// main method
	public static void main(String[] args)
	{ 
		// Frame is just like basic structure of the game and it is a container.
		// But, other contents has to be placed on something. So, we will be putting components on 
		 // a container called as JPanel which is also a kind of container.
		JFrame frame1 = new JFrame();
		frame1.setTitle("Dodge is my First Game");
		frame1.add(new Dodge1()); // This way panel has been added into Frame.
		frame1.setResizable(false);
		frame1.setSize(new Dimension(751,571));
		
		// If we were extending JFrame class then we would not had to use JFrame.EXIT_ON_CLOSE
		// Then, we would have used EXIT_ON_CLOSE directly....
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
		
	}

}
