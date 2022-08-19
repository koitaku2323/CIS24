// Name: Ryan Yee
// Date: 7/19/19 
// Description: Sample Program 9.9(ButtonGuiThree)
// File Name: ButtonGuiThree
// To Compile in terminal type: javac ButtonGuiThree.java
// To Run the program in terminal type: java ButtonGuiThree

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
public class ButtonGuiThree extends JFrame
{
	private JFrame mainFrame;
	private JButton firstB;
	public ButtonGuiThree()
	{
		mainFrame = new JFrame("Example of a GUI with a button");
		firstB = new JButton("Press me");
		Container c = mainFrame.getContentPane();
		c.add(firstB);
		firstB.setToolTipText("This is a button");
		firstB.setMnemonic('p');
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
			JOptionPane.showMessageDialog(null, "Button was Pressed",
				"Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void main(String[] args)
	{
		new ButtonGuiThree();
	}
}// I added this, a comment.

/*
Results see screenshots
*/
