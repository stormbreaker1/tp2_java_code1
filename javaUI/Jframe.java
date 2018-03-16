package javaUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// This program is for understanding the JFrame.
// JFrame is a container where we will be placing the components. Buttons and Text fields are 
 // components... Same way JPanel is also a container which can hold the components.... 
public class Jframe {
//	private JFrame frame1;
//	private JPanel panel;
//	private JButton button1;
 // We need to make those containers and components static so that we can define them above and
	// use them later...
	public static void main(String[] args)
	{
		// Dedining the properties for JFrame...
		JFrame frame = new JFrame();
		frame.setTitle("FRAME-1");
		frame.setSize(new Dimension(750,570));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel); // adding the panel into the JFrame...
		panel.setBackground(Color.green);
		
		JButton button1 = new JButton("Button1");
		panel.add(button1); // adding the button1 into the panel...
	}
}
