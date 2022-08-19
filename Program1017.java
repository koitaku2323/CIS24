// Name: Ryan Yee
// Date: 7/23/19 
// Description: Exercise 10.1.7
// File Name: Program1017
// To Compile in terminal type: javac Program1017.java
// To Run the program in terminal type: java Program1017

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

public class Program1017 extends JFrame
{
	private JFrame mainFrame;
	private JButton messageButton;
	private JButton clearButton;
	private JButton exitButton;
	
	public Program1017()
	{
		mainFrame = new JFrame("Evil Message");
		
		messageButton = new JButton("Eyes");
		clearButton = new JButton("Ears");
		exitButton = new JButton("Mouth");

		Container c = mainFrame.getContentPane();
		c.setLayout(new FlowLayout());

		c.add(messageButton);
		c.add(clearButton);
		c.add(exitButton);

		messageButton.setMnemonic('m');
		clearButton.setMnemonic('c');
		exitButton.setMnemonic('x');
		
		mainFrame.setSize(300,150);

		MessageButtonHandler mhandler = new MessageButtonHandler();
		messageButton.addActionListener(mhandler);

		ClearButtonHandler chandler = new ClearButtonHandler();
		clearButton.addActionListener(chandler);

		ExitButtonHandler ehandler = new ExitButtonHandler();
		exitButton.addActionListener(ehandler);

		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0); }
		});

		mainFrame.setVisible(true);
	//}

	//public static void main(String[] args)
	//{
	//	Program1017 app;
	//	app = new Program1017();
	}
	class MessageButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "See no evil",
				"Demon",
				JOptionPane.INFORMATION_MESSAGE);
		}
	}
	class ClearButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Hear no evil",
				"Demon",
				JOptionPane.INFORMATION_MESSAGE);
		}
	}
	class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Speak no evil",
				"Demon",
				JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void main(String args[])
	{
		Program1017 app;
		app = new Program1017();
	}
}

/*
see screenshots for results
*/