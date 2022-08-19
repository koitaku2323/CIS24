// Name: Ryan Yee
// Date: 7/10/19 
// Description: Excercise6.5.2
// File Name: Program652.java
// To Compile in terminal type: javac Program652.java
// To Run the program in terminal type: java Program652

import java.util.Scanner;
public class Program652
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid value of grade:");

		int grade1=-10;
		while(grade1 < 0 || grade1 > 100)
		{
			System.out.println("Invalid grade, enter another value b/w 0-100:");
			grade1 = sc.nextInt();
		}

		grade1=10;
		do
		{
			System.out.println("Enter another value b/w 0-100, which will be your final grade:");
			grade1 = sc.nextInt();
		}
		while (grade1 < 0 || grade1 > 100);
		System.out.println("A valid value is entered, your grade is:" + grade1);
	} 

}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program652.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program652
Enter a valid value of grade:Invalid grade, enter another value b/w 0-100:
4
Enter another value b/w 0-100, which will be your final grade:
100
A valid value is entered, your grade is:100
*/