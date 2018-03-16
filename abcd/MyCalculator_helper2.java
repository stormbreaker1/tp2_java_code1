package abcd;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import javax.swing.JButton;

public class MyCalculator_helper2 extends JFrame {
	
	 static int counter = 0;
	
	// Buttons for mathematical operations.....
	private JButton plus;
	private JButton minus;
	private JButton answer;
	
	// Buttons for numbers......
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	
	// Integers to store the Input....
	private int num1;
	private int num2;
	
	// Constructor of this class which will be called as soon as 
	 // object of this class will be created...
	public MyCalculator_helper2()
	{
		super("The Calculator");
		
		setLayout(new FlowLayout());
		
		// Adding the buttons for mathematical operations....
		plus = new JButton("+");
		add(plus);
		minus = new JButton("-");
		add(minus);
		answer = new JButton("=");
		add(answer);
		
		// Adding all those button.......
		zero = new JButton("0");
		add(zero);
		one = new JButton("1");
		add(one);
		two = new JButton("2");
		add(two);
		three = new JButton("3");
		add(three);
		four = new JButton("4");
		add(four);
		five = new JButton("5");
		add(five);
		six = new JButton("6");
		add(six);
		seven = new JButton("7");
		add(seven);
		eight = new JButton("8");
		add(eight);
		nine = new JButton("9");
		add(nine);
		
		// Creating the object of the MyHandler interior class....
		MyHandler handler = new MyHandler();
		
		plus.addActionListener(handler);
		minus.addActionListener(handler);
		answer.addActionListener(handler);
		
		zero.addActionListener(handler);
		one.addActionListener(handler);
		two.addActionListener(handler);
		three.addActionListener(handler);
		four.addActionListener(handler);
		five.addActionListener(handler);
		six.addActionListener(handler);
		seven.addActionListener(handler);
		eight.addActionListener(handler);
		nine.addActionListener(handler);
		
	}
	
	private class MyHandler implements ActionListener
	{
		private int result = 0;
		protected int[] array1 = new int[100];
		
		StringBuffer sbf = new StringBuffer();
		
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if(event.getSource()==zero)
			{
				sbf.append(0);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==one)
			{
				sbf.append(1);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==two)
			{
				sbf.append(2);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==three)
			{
				sbf.append(3);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==four)
			{
				sbf.append(4);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==five)
			{
				sbf.append(5);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==six)
			{
				sbf.append(6);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==seven)
			{
				sbf.append(7);
				System.out.println(sbf);
				
			}
			
			if(event.getSource()==eight)
			{
				sbf.append(8);
				System.out.println(sbf);
			}
			
			if(event.getSource()==nine)
			{
				sbf.append(9);
				System.out.println(sbf);
			}
			
			
			if(event.getSource()==plus)
			{
					sbf.toString();
					String str = new String(sbf);
					
					// System.out.println(str1);
					// System.exit(0);
				//	array1[counter] = Integer.parseInt(str);
                //	result  = result + array1[counter];
					result  = result + Integer.parseInt(str);
					counter = counter + 1;
			}
			
			if(event.getSource()==minus)
			{
				sbf.toString();
				String str = new String(sbf);
				
				result  = result - Integer.parseInt(str);
				// System.out.println(str1);
				// System.exit(0);
				// array1[counter] = -Integer.parseInt(str);
//				result  = result + array1[counter];
				counter = counter + 1;
			}
			
			
			if(event.getSource()==answer)
			{
				sbf.toString();
				String str = new String(sbf);
				array1[counter] = Integer.parseInt(str);
				
				System.out.println();
				System.out.println("Result is " + result);
			}
			
			
		}	
	}
}
