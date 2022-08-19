// Name: Ryan Yee
// Date: 7/8/19 
// Description: Excercise5.4.6
// File Name: Program546.java
// To Compile in terminal type: javac Program546.java
// To Run the program in terminal type: java Program546

import java.io.*;
class Program546
{
	public static void main(String[] args)
	throws IOException		
	{
		int code;
		String s1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter code (1,2,3,4,5,6): ");
		s1 = br.readLine();
		code = Integer.parseInt(s1);

		switch(code)
		{
			case 1:
			  System.out.println("Freshman");
			  break;
			case 2:
			  System.out.println("Sophomore");
			  break;
			case 3:
			  System.out.println("Junior");
			  break;
			case 4:
			  System.out.println("Senior");
			  break;
			case 5:
			  System.out.println("Masters Program");
			  break;
			case 6:
			  System.out.println("Doctoral Program");
			  break;
			default: 
			  System.out.println("Wrong code entered");
		}
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program546.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program546
Enter code (1,2,3,4,5,6): 1
Freshman
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program546.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program546
Enter code (1,2,3,4,5,6): 2
Sophomore
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program546.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program546
Enter code (1,2,3,4,5,6): 3
Junior
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program546.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program546
Enter code (1,2,3,4,5,6): 4
Senior
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program546.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program546
Enter code (1,2,3,4,5,6): 5
Masters Program
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program546.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program546
Enter code (1,2,3,4,5,6): 6
Doctoral Program
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program546.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program546
Enter code (1,2,3,4,5,6): 123456
Wrong code entered
*/
