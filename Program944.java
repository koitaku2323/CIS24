// Name: Ryan Yee
// Date: 7/22/19 
// Description: Exercise 9.4.4
// File Name: Program944
// To Compile in terminal type: javac Program944.java
// To Run the program in terminal type: java Program944

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
public class Program944 extends JFrame
{
	private JFrame mainFrame;
	private JButton firstB;
	public Program944()
	{
		mainFrame = new JFrame("Message");
		firstB = new JButton("Press to show Message");
		Container c = mainFrame.getContentPane();
		c.add(firstB);
		firstB.setToolTipText("This is a button");
		firstB.setMnemonic('M');
		mainFrame.setSize(300,150);
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0); }
		});

		ButEventHandler bhandler = new ButEventHandler();
		firstB.addActionListener(bhandler);

		mainFrame.setVisible(true);
	}

	class ButEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Display a message",
				"Message Displayed", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void main(String[] args)
	{
		new Program944();
	}
}

/*
see screenshots for results
*/