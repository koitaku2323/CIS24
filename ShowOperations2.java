// Name: Ryan Yee
// 6/25/2019
// Description:Example of Output: shows messages in command line and calculates and displays the results of the following expressions:
//3.0 * 5.0
//7.1 * 8.3 - 2.2
//3.2 / (6.1 * 5)
// File Name: ShowOperations2.java
// To Compile in terminal type: javac ShowOperations2.java
// To Run the program in terminal type: java ShowOperations2
public class ShowOperations2
{
	public static void main(String[] args)
	{
		System.out.println(  "3.0 times 5.0 equals " +(3*5.0)+"\n"
	                       + "7.1 times 8.3 minus 2.2 equals " +(7.1*8.3-2.2)+ "\n"
                           + "3.2 divided by the product of 6.1 and 5.0 equals " +(3.2/6.1*5.0) );
                           
  
        System.out.println("This is ShowOperations2");

	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac ShowOperations2.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java ShowOperations2
3.0 times 5.0 equals 15.0
7.1 times 8.3 minus 2.2 equals 56.73
3.2 divided by the product of 6.1 and 5.0 equals 2.6229508196721314
This is ShowOperations2
PS C:\Users\Ryan Yee\Desktop\CSIS24>
/*