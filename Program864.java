// Name: Ryan Yee
// Date: 7/17/19 
// Description: Excercise8.6.4
// File Name: Program864.java
// To Compile in terminal type: javac Program864.java
// To Run the program in terminal type: java Program864

import java.util.Scanner;
class Program864
{
	public static void main(String[] args)
	{
		int val[][] = {

			             {16,18,23},
			             {54,91,10}

		              };

		int val2[][] = {

			                {24,52,77},
			             	{16,19,50}
			           };

	    int res[][] = {

	    	                {16+24,18+52,23+77},
	    	                {54+16,91+19,10+50}

	                  };
        System.out.println(" " + val[0][0] + " " + val[0][1] + " " + val[0][2]);
	    System.out.println(" " + val[1][0] + " " + val[1][1] + " " + val[1][2]);
	    System.out.println("         +");
	    System.out.println(" " + val2[0][0] + " " + val2[0][1] + " " + val2[0][2]);
	    System.out.println(" " + val2[1][0] + " " + val2[1][1] + " " + val2[1][2]);
	    System.out.println("         =");
	    System.out.println(" " + res[0][0] + " " + res[0][1] + " " + res[0][2]);
	    System.out.println(" " + res[1][0] + " " + res[1][1] + " " + res[1][2]);
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program864.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program864
 16 18 23
 54 91 10
         +
 24 52 77
 16 19 50
         =
 40 70 100
 70 110 60
 */

