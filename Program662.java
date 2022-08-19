// Name: Ryan Yee
// Date: 7/11/19 
// Description: Excercise6.6.2
// File Name: Program662.java
// To Compile in terminal type: javac Program662.java
// To Run the program in terminal type: java Program662

class Program662
{
	public static int sum(int n)
	{
		if(n == 1)
			return 1;
		else return(n + sum(n-1) );
	}

	public static void main(String[] args)
	{
		int n = 5;
		int result;

		result = sum(n);
		System.out.println("The sum of 1 to " + n + " is " + result);
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program662.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program662
The sum of 1 to 5 is 15
*/