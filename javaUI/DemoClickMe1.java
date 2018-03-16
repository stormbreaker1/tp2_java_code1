package javaUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
// We can create a frame separately but we will use JFrame class as parent class here...
public class DemoClickMe1 extends JFrame{
	private JLabel labelCount;
	private JButton buttonCounter, buttonReset;
	
	private int clicks = 0;
	
	// Creating the constructor...
	public DemoClickMe1()
	{
		createView();
		
		// All these below methods are used for setting JFrame...
		setTitle("Click Me");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack(); // This method is JFrame method which will pack everything just tightly...
		// pack() must come here else java will try centralize everything first and then 
		 //pack later which actually place the things in chaos...
		setLocationRelativeTo(null); // This will keep Frame in the middle of window...
		setResizable(false);
		
	}
	
	private void createView() {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		getContentPane().add(panel); // adding pannel to JFrame...
		panel.setBackground(Color.MAGENTA);
		
		labelCount = new JLabel();
		labelCount.setPreferredSize(
				new Dimension(350,230)
				);
		panel.add(labelCount);
		
		updateCounter();
		
		buttonCounter = new JButton("Click Me");
		buttonCounter.addActionListener(
				// Action Listener have only one method...
				new ButtonCounterActionListener());
		panel.add(buttonCounter);
		
		buttonReset = new JButton("Reset");
		buttonReset.addActionListener(
				new ActionListener() // ActionListener is an obstract class, so we need to
				 // implement abstract methods as well...
				{

					// It's same as creating class below and then using ActionPerformed()
					 // method...
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						clicks = 0;
						updateCounter();
					}
				});
		panel.add(buttonReset);
	}

	private void updateCounter() {
		// TODO Auto-generated method stub
		labelCount.setText("Clicked " + clicks + " times");
	}

	public static void main(String[] args)
	{
	// invokeLater() method is used when we are using multiple threads. It says that do whatever
	 // changes you wanna make, I will update everything and run after all the changes will be
	  // made. In case of single thread we use EDT. Here, we have single thread but still we are
		// using invokeLater method... 
		SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run() {
						// Object is getting created and it's constructor will run...
						// As this class inherits from JFrame, it's object can be used for setting
						 // visibility...
						new DemoClickMe1().setVisible(true);
						
					}
			
				});
	
	}
	private class ButtonCounterActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			clicks++;
			
			// We created this method above for updating counter...
			updateCounter();
		}
		
	}

 }
