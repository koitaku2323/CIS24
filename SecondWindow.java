// Name: Ryan Yee
// Date: 7/22/19 
// Description: Exercise9.3.1 (SecondWindow.java)
// File Name: SecondWindow.java
// To Compile in terminal type: javac SecondWindow.java
// To Run the program in terminal type: java SecondWindow

import javax.swing.*;
import java.awt.event.*;

public class SecondWindow extends JFrame
{
	private JFrame mainFrame;

	public SecondWindow()
	{
		mainFrame = new JFrame("Second GUI Window");
        mainFrame.setSize(300,150);
        mainFrame.setVisible(true);

        WinHandler handler = new WinHandler();
        mainFrame.addWindowListener(handler);
	}

	public static void main(String[] args)
	{
		new SecondWindow();
	}

	class WinHandler implements WindowListener

    {
    	public void windowClosing(WindowEvent e)     {System.exit(0);}
    	public void windowClosed(WindowEvent e)      {   }
    	public void windowOpened(WindowEvent e)      {   }
    	public void windowIconified(WindowEvent e)   {   }
    	public void windowDeiconified(WindowEvent e) {   }
    	public void windowActivated(WindowEvent e)   {   }
    	public void windowDeactivated(WindowEvent e) {   }
    }
}

/*
result see screenshot
*/