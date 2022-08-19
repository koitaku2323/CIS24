// Name: Ryan Yee
// Date: 7/15/19 
// Description: Excercise7.3.5
// File Name: Program735.java
// To Compile in terminal type: javac Program735.java
// To Run the program in terminal type: java Program735

import java.io.*;
import java.util.StringTokenizer;
public class Program735
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("?uoy era woh ,olleH");
		int i, numChars;

		str.reverse();
		System.out.println("The string passed as an argument after being reversed is:" + str);
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program735.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program735
The string passed as an argument after being reversed is:Hello, how are you?
*/