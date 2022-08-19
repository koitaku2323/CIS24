// Name: Ryan Yee
// Date: 7/1/19 
// Description: Compile and Run Program 4.1
// File Name: Program41.java
// To Compile in terminal type: javac Program41. java
// To Run the program in terminal type: java Program41

import java.io.*; // needed for InputStreamReader & BufferedReader
public class Program41
{
	public static void main(String[] args)
	throws IOException // need this for readLine()
	{
		String s1,s2;
		double num1, num2, product;

		// set up th ebasic input system 
		// needed for informatio  to be entered into program using the keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // needed for readLine()

		// tell the user what to enter
		System.out.print("Enter a number: ");
		//                   ^^^^^^^^^^^^^^ prompt
		// prompt - message that tells the user what to enter

		// When it reaches br.readLine(), the program will pause.
		// The user will type a number, press Enter, and then the program resumes
		s1 = br.readLine(); // INPUT: user enters a number which is read as a string
		num1 = Double.parseDouble(s1); // the string is converted into double

		System.out.print("Enter another number: ");
		s2 = br.readLine(); // INPUT
		num2 = Double.parseDouble(s2);

		product = num1 * num2; // multiply the two numbers

		System.out.println(num1 + " times " + num2 + " = " + product);
		// I added this #################
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program41.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program41
Enter a number: 3
Enter another number: 2
3.0 times 2.0 = 6.0
*/