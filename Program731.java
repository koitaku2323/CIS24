// Name: Ryan Yee
// Date: 7/15/19 
// Description: Excercise7.3.1
// File Name: Program731.java
// To Compile in terminal type: javac Program731.java
// To Run the program in terminal type: java Program731

import java.io.*;
import java.util.StringTokenizer;
public class Program731
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("This cannot be");
		int i, numChars;

		System.out.println("The original string is: " + str);
		numChars = str.length();
		System.out.println("This string has " + numChars + " characters");

		//insert characters
		str.insert(4, " I know"); //insert " I know" after the 4th character of the StringBuffer
		System.out.println("The string after insertion is now: " + str);
		numChars = str.length();
		System.out.println("This string has " + numChars + " characters");

		//replace characters
		str.replace(12,18,"to");//replace characters 12 to 18 with "to"
		System.out.println("The string after replacement is:" + str);
		numChars = str.length();
		System.out.println("This string has " + numChars + " characters");

		//reverse the characters
		str.reverse();
		System.out.println("This string after being reversed is:" + str);

		// split a string into words
		StringTokenizer  stb = new StringTokenizer("One two three four");
		System.out.println("First word is: " + stb.nextToken() );
		System.out.println("Second word is: " + stb.nextToken() );
		System.out.println("Third word is: " + stb.nextToken() );
		System.out.println("Fourth word is: " + stb.nextToken() );
	}
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac program731.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program731
The original string is: This cannot be
This string has 14 characters
The string after insertion is now: This I know cannot be
This string has 21 characters
The string after replacement is:This I know to be
This string has 17 characters
This string after being reversed is:eb ot wonk I sihT
First word is: One
Second word is: two
Third word is: three
Fourth word is: four
*/