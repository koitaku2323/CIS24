// Name: Ryan Yee
// Date: 7/15/19 
// Description: Excercise7.2.6
// File Name: Program726.java
// To Compile in terminal type: javac Program726.java
// To Run the program in terminal type: java Program726

class Program726
{
	public static void main(String[] args)
	{
		String str = new String("Counting the number of vowels");
		int numChars = str.length(), vowelCount = 0;

		System.out.println("The string: " + str);

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
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program726.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program726
The string: Counting the number of vowels
has 9 vowels
*/