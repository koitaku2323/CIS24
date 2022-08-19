// Name: Ryan Yee
// Date: 7/8/19 
// Description: the if and switch statements.
// File Name: Selection.java
// To Compile in terminal type: javac Selection.java
// To Run the program in terminal type: java Selection

import java.io.*;
import java.text.*;
class Selection
{
	public static void main(String[] args)
	throws IOException
	{
		double temperature;
		String s1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a temperature:");
		s1 = br.readLine();
		temperature = Double.parseDouble(s1);

		if (temperature < 0)
		{
			System.out.print("The temperature");
			System.out.print(" is negative");
		}
		else if(temperature == 0)
			System.out.println("The temperature is zero");
		else
			System.out.println("The temperature is positive");
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Selection.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Selection
Enter a temperature:0
The temperature is zero
*/