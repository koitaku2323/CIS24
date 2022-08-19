// Name: Ryan Yee
// Date: 7/8/19 
// Description: Exercises 5.2.10
// File Name: Program5210.java
// To Compile in terminal type: javac Program5210.java
// To Run the program in terminal type: java Program5210

import java.io.*;
import java.text.*;
class Program5210
{
	public static void main(String[] args)
	throws IOException
	{
		double feel;
		String s1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("How are you today, scale of 1 to 5: ");
		s1 = br.readLine();
		feel = Double.parseDouble(s1);

		if (feel < 3)
		{
			System.out.print("You feel not so great today.");
			
		}
		else if(feel >= 3)
			System.out.println("You feel great today.");
		else
			System.out.println("Good luck!");
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program5210.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program5210
How are you today, scale of 1 to 5: 3
You feel great today.
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program5210.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program5210
How are you today, scale of 1 to 5: 1
You feel not so great today.
*/