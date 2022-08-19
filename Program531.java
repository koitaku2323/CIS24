// Name: Ryan Yee
// Date: 7/8/19 
// Description: Exercises 5.3.1
// File Name: Program531.java
// To Compile in terminal type: javac Program531.java
// To Run the program in terminal type: java Program531

import java.io.*;
import java.text.*;
class Program531
{
	public static void main(String[] args)
	throws IOException
	{
		double grade;
		String s1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter your grade in percent: ");
		s1 = br.readLine();
		grade = Double.parseDouble(s1);

		if (grade >= 90)
		{
			System.out.print("You have an 'A'.");
		}
		
		if (grade >= 80 && grade < 90)
		{
			System.out.print("You have a 'B'.");
		}
		
		if (grade >= 70 && grade < 80)
		{
			System.out.print("You have a 'C'.");
		}
		
		if (grade >= 60 && grade < 70)
		{
			System.out.print("You have a 'D'.");
		}
		
		if (grade < 60)
		{
			System.out.print("You have a 'F'.");
		}
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program531.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program531
Enter your grade in percent: 60
You have a 'D'.
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program531.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program531
Enter your grade in percent: 70
You have a 'C'.
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program531.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program531
Enter your grade in percent: 80
You have a 'B'.
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program531.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program531
Enter your grade in percent: 90
You have a 'A'.
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program531.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program531
Enter your grade in percent: 50
You have a 'F'.
*/