package javaUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
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

public class TryGridBagLayout1 extends JFrame{
	
	// Setting Constructor
	public TryGridBagLayout1()
	{
		createView();
		
		setTitle("Trying Grid Bag Layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(751,571));
		setResizable(true);
		setLocationRelativeTo(null);
	}
	
	public void createView()
	{
		JPanel panelMain = new JPanel();
		getContentPane().add(panelMain);
		
		JPanel panelForm = new JPanel(new GridBagLayout());
		
		// We have put a panel inside a panel.
		panelMain.add(panelForm);
		
		// This will create the grid for us....
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.LINE_END;
		
		// This c.gridy ++  will increase by 1 in vertical downward direction.
		panelForm.add(new JLabel("First Name: "), c);
		c.gridy ++;
		panelForm.add(new JLabel("Last Name: "), c);
		c.gridy ++;
		panelForm.add(new JLabel("Email: "), c);
		c.gridy ++;
		panelForm.add(new JLabel("Username: "), c);
		c.gridy ++;
		panelForm.add(new JLabel("Password: "), c);
		
		// Now, we are moving the 2nd Column.
		c.gridx = 1;
		c.gridy = 0; // resetting the grid y back to 0 so that we will reach top row.
		c.anchor = GridBagConstraints.LINE_START;
		panelForm.add(new TextField(15), c);
		c.gridy ++;
		panelForm.add(new TextField(15), c);
		c.gridy ++;
		panelForm.add(new TextField(20), c);
		c.gridy ++;
		panelForm.add(new TextField(10), c);
		c.gridy ++; 
		panelForm.add(new TextField(16), c);
		
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
				{

					@Override
					public void run()
					{
						new TryGridBagLayout1().setVisible(true);
					}
					
				});
		
	}
}
