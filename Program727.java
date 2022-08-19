// Name: Ryan Yee
// Date: 7/15/19 
// Description: Excercise7.2.7
// File Name: Program727.java
// To Compile in terminal type: javac Program727.java
// To Run the program in terminal type: java Program727
import java.io.*;

class Program727
{
	public static void main(String[] args)
	throws IOException
	{
		String str;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

        System.out.println("The string: ");
		str = br.readLine();
		int numChars = str.length(), vowelCount = 0;

		for(int i = 0; i < numChars; i++ )
		{
			switch(str.charAt(i))
			{
				case'a':
				case'e':
				case'i':
				case'o':
				case'u':
				vowelCount++;
			}
		}
	    System.out.println("has " + vowelCount + " vowels");
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program727.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program727
The string:
aeiou
has 5 vowels
*/