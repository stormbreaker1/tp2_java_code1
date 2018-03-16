package javaUI;

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

// We will be using Layouts in this program...
public class ChatBox2 extends JFrame{
	
	private JLabel label1;
	private JTextField textfield1;
	private JButton button1,button2;
	private JTextArea textarea1;
	
	
	public ChatBox2()
	{
		// Settings for JFrame...
		createView();
		
		setTitle("Aquazor Messanger");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(450,230));
		setResizable(true);
		setLocationRelativeTo(null);
		
		
	}
	
	public void createView()
	{
		// creating the view for the
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		label1 = new JLabel("Messages....");
		panel.add(label1);
		
		textfield1 = new JTextField(16);
		panel.add(textfield1);
		
		button1 = new JButton("Send");
		button1.setBackground(Color.CYAN);
		button1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String message = textfield1.getText();
						
						textarea1.append(message + "\n"); // Will append the text to the existing text...
					
						textfield1.setText("");
					}
				});
		panel.add(button1);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setLineWrap(true);
		textarea1.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textarea1);
		scrollPane.setPreferredSize(new Dimension(350,90));
		// scrollPane.setBackground(Color.LIGHT_GRAY);
		panel.add(scrollPane);
		
		button2 = new JButton("Clear Messages");
		button2.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						textarea1.setText(""); // This will clear all the text area...
					}
					
				});
		panel.add(button2);
		
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						new ChatBox1().setVisible(true);
					}
				});
	}

}
