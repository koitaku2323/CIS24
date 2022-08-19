// Name: Ryan Yee
// Date: 7/1/19 
// Description: Interactive Dialog Input 
// File Name: Program45.java
// To Compile in terminal type: javac Program45. java
// To Run the program in terminal type: java Program45

import javax.swing.JOptionPane;
public class Program45
{ // Catching Exceptions
	public static void main(String[] args)
	{
		String s1,s2, message;
		double num1, num2, average;
		try
		{
			s1 = JOptionPane.showInputDialog("Enter a number:");
			num1 = Double.parseDouble(s1);

			s2 = JOptionPane.showInputDialog("Enter another number:");
			num2 = Double.parseDouble(s2);

			average = (num1+num2)/2;
			message = "The average of " + num1 + " and " + num2 + " is " + average;

			JOptionPane.showMessageDialog(null,
				message,
				"QuickTest Program 4.5",
				JOptionPane.INFORMATION_MESSAGE);
		}
		catch (NumberFormatException n)
		{
			JOptionPane.showMessageDialog(null,
				"You must enter a number",
				"Input Data Error",
				JOptionPane.ERROR_MESSAGE);
		}
		catch (NullPointerException n)
		{
			JOptionPane.showMessageDialog(null,
				"You pressed the cancel button",
				"Program Termination",
				JOptionPane.ERROR_MESSAGE);
		}

	}
} // I added this%%%%%%%%%%%%%

/*
See screenshots of the 3 test runs
*/