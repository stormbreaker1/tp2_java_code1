package javaUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TryBorderLayout1 extends JFrame{
	private JLabel label1;
	private JTextField textfield1;
	private JButton button1,button2;
	private JTextArea textarea1;
	
	
	public TryBorderLayout1()
	{
		// Settings for JFrame...
		createView();
		
		setTitle("Border Layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(450,230));
		setResizable(true);
		setLocationRelativeTo(null);
		
		
	}
	
	public void createView()
	{
		// creating the view for the
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		getContentPane().add(panel);

		
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						new TryBorderLayout1().setVisible(true);
					}
				});
	}


}
