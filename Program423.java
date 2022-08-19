// Name: Ryan Yee
// Date: 7/2/19 
// Description: Exercise 4.2.3:  a program that displays the sale tax 
// File Name: Program423.java
// To Compile in terminal type: javac Program423. java
// To Run the program in terminal type: java Program423

import java.io.*; // needed for InputStreamReader & BufferedReader
public class Program423
{
	public static void main(String[] args)
	throws IOException // need this for readLine()
	{
		String bill;
		double num1, taxrate, tax;

		taxrate = 0.06;


		// set up th ebasic input system 
		// needed for informatio  to be entered into program using the keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // needed for readLine()

		// tell the user what to enter
		System.out.print("Enter the amount of the bill: ");
		
		// When it reaches br.readLine(), the program will pause.
		// The user will type a number, press Enter, and then the program resumes
		bill = br.readLine(); // INPUT: user enters a number which is read as a string
		num1 = Double.parseDouble(bill); // the string is converted into double

		tax = num1*taxrate; // calculate the area

		System.out.println("The sale tax of the " + num1 + "$ bill is " + tax + "$");
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program423.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program423
Enter the amount of the bill: 20
The sale tax of the 20.0$ bill is 1.2$
*/