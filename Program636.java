// Name: Ryan Yee
// Date: 7/10/19 
// Description: Excercise6.3.6
// File Name: Program636.java
// To Compile in terminal type: javac Program636.java
// To Run the program in terminal type: java Program636

import javax.swing.JOptionPane;
class Program636
{
	public static void main(String[] args)
	{
		String s1, s2, info, outMessage;
		int count;
		double num, max, total, average;
		s2 = JOptionPane.showInputDialog("Please type in the total number of data values to be averaged: ");
		max = Double.parseDouble(s2);

		info = "This program will ask you to enter "
		       + max + " numbers. ";
		JOptionPane.showMessageDialog(null, info,
			"QuickTest Program", JOptionPane.INFORMATION_MESSAGE);

		outMessage = "The average of the numbers: \n";
		count = 1;
		total = 0;

		while(count <= max)
		{
			s1 = JOptionPane.showInputDialog("Enter number " + count + ":");
			num = Double.parseDouble(s1);

			total = total + num;
			outMessage = outMessage + num + " ";
			count++;
		}
		average = total / max;
		JOptionPane.showMessageDialog(null, outMessage + "\n is " + average,
			"QuickTest Program 6.7", JOptionPane.INFORMATION_MESSAGE);
	}
}

/*
See screenshots for results
*/