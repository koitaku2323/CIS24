// Name: Ryan Yee
// Date: 7/1/19 
// Description: Exercise 4.1.4: calculates and displays the area of the circle
// File Name: Program414.java
// To Compile in terminal type: javac Program414. java
// To Run the program in terminal type: java Program414

import java.io.*; // needed for InputStreamReader & BufferedReader
public class Program414
{
	public static void main(String[] args)
	throws IOException // need this for readLine()
	{
		String radius;
		double num1, pi, area;

		pi = 3.1415;


		// set up th ebasic input system 
		// needed for informatio  to be entered into program using the keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // needed for readLine()

		// tell the user what to enter
		System.out.print("Enter the radius of the circle: ");
		
		// When it reaches br.readLine(), the program will pause.
		// The user will type a number, press Enter, and then the program resumes
		radius = br.readLine(); // INPUT: user enters a number which is read as a string
		num1 = Double.parseDouble(radius); // the string is converted into double

		area = num1*num1*pi; // calculate the area

		System.out.println("The area of a circle that has a radius of " + num1 + "= " + area);
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program414.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program414
Enter the radius of the circle: 5
The area of a circle that has a radius of 5.0= 78.53750000000001
*/