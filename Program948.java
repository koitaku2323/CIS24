// Name: Ryan Yee
// Date: 7/22/19 
// Description: Exercise 9.4.8
// File Name: Program948
// To Compile in terminal type: javac Program948.java
// To Run the program in terminal type: java Program948

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
public class Program948 extends JFrame
{
	private JFrame mainFrame;
	private JButton firstB;
	public Program948()
	{
		mainFrame = new JFrame("JButton");
		firstB = new JButton("Press to show info");
		Container c = mainFrame.getContentPane();
		c.add(firstB);
		firstB.setToolTipText("This is a button");
		firstB.setMnemonic('N');
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
			JOptionPane.showMessageDialog(null, "Ryan Yee, 19261 Saffron Dr",
				"Your Name and Address", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void main(String[] args)
	{
		new Program948();
	}
}

/*
see screenshots for results
*/