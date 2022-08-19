// Name: Ryan Yee
// Date: 7/24/19 
// Description: Final Project-TicTacToe
// File Name: TicTacToe
// To Compile in terminal type: javac TicTacToe.java
// To Run the program in terminal type: java TicTacToe

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;
import java.util.Random;
import java.awt.GridLayout;

class TicTacToe extends JFrame
{
	JFrame myWindow;
	JButton buttons[][] = new JButton[3][3];
	boolean playerXTurn; 

	TicTacToe()
	{
		myWindow = new JFrame("Tic Tac Toe");
		myWindow.setSize(500,500);
		myWindow.addWindowListener(new WindowClosing());
		myWindow.setLayout(new GridLayout(3,3));

		for(int row = 0; row < 3; row++)
			for(int column = 0; column < 3; column++)
			{
				buttons[row][column] = new JButton(row + " " + column);
				buttons[row][column].addActionListener(new ButtonEvents() );
				myWindow.add(buttons[row][column]);
			}

		myWindow.setVisible(true);
		playerXTurn = ( new Random().nextInt(2) == 0) ? true : false;

	}

	public static void main(String[] args)
	{
		new TicTacToe();
	}

	class WindowClosing extends WindowAdapter
	{
		public void windowClosing(WindowEvent e) { System.exit(0); }
	}

	class ButtonEvents implements ActionListener
	{
		int row = 0, column = 0;
		boolean found = false;
		@Override
		public void actionPerformed(ActionEvent e)
		{
			for(row = 0; row < 3; row++)
			{
				for(column = 0; column < 3; column++)
					if(buttons[row][column] == e.getSource() )
					{
						found = true;
						playerXTurn = !playerXTurn;

						if(playerXTurn
							&& !buttons[row][column].getText().equals("O")
							&& !buttons[row][column].getText().equals("X") )
						   buttons[row][column].setText("X");

						else if (!playerXTurn
							&& !buttons[row][column].getText().equals("X")
							&& !buttons[row][column].getText().equals("O") )
						   buttons[row][column].setText("O");

						break;
					}
				if(found)
					break;
			}  

			findWinner();
		}

		void findWinner()
		{
			for (int i = 0; i < 3; i++)
				if(buttons[i][0].getText().equals( buttons[i][1].getText())
					&& buttons[i][1].getText().equals( buttons[i][2].getText() ) )
					 displayWinner();

			for (int i = 0; i < 3; i++)
				if(buttons[0][i].getText().equals( buttons[1][i].getText())
					&& buttons[1][i].getText().equals( buttons[2][i].getText() ) )
					 displayWinner();

		    if(buttons[0][0].getText().equals( buttons[1][1].getText())
					&& buttons[1][1].getText().equals( buttons[2][2].getText() ) )
					 displayWinner();

			if(buttons[2][0].getText().equals( buttons[1][1].getText())
					&& buttons[1][1].getText().equals( buttons[0][2].getText() ) )
					 displayWinner();
		}

		void displayWinner()
		{
			if (buttons[row][column].getText().equals("X"))
				System.out.println("X wins");
			else
				System.out.println("O wins");
			System.exit(0);
		}
	}
}

/*
Results see screenshots
*/