// Name: Ryan Yee
// Date: 7/23/19 
// Description: Exercise 10.2.4
// File Name: Program1024
// To Compile in terminal type: javac Program1024.java
// To Run the program in terminal type: java Program1024

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

public class Program1024 extends JFrame
{
	private JFrame mainFrame;
	private JButton messageButton;
	private JButton clearButton;
	private JButton exitButton;
	private JTextField tField;
	
	public Program1024()
	{
		mainFrame = new JFrame("Evil Message");
		
		messageButton = new JButton("Eyes");
		clearButton = new JButton("Ears");
		exitButton = new JButton("Mouth");
		tField = new JTextField("Click Click Click");

		Container c = mainFrame.getContentPane();
		//c.setLayout(new FlowLayout());
        c.add(tField,BorderLayout.NORTH);
		c.add(messageButton,BorderLayout.WEST);
		c.add(clearButton,BorderLayout.CENTER);
		c.add(exitButton,BorderLayout.EAST);

		messageButton.setMnemonic('m');
		clearButton.setMnemonic('c');
		exitButton.setMnemonic('x');
		
		mainFrame.setSize(300,150);

		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0); }
		});
        
        MessageButtonHandler mhandler = new MessageButtonHandler();
		messageButton.addActionListener(mhandler);

		ClearButtonHandler chandler = new ClearButtonHandler();
		clearButton.addActionListener(chandler);

		ExitButtonHandler ehandler = new ExitButtonHandler();
		exitButton.addActionListener(ehandler);
		
		mainFrame.setVisible(true);
	
	}
	
	class MessageButtonHandler implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			tField.setText("See no evil");
		}
	}
	class ClearButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tField.setText("Hear no evil");
		}
	}
	class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tField.setText("Speak no evil");
		}
	}

	public static void main(String args[])
	{
		new Program1024();
	}
}

/*
see screenshots for results
*/