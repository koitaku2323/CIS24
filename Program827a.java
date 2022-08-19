// Name: Ryan Yee
// Date: 7/17/19 
// Description: Excercise8.2.7.a (Array Shallow Copy)
// File Name: Program827a.java
// To Compile in terminal type: javac Program827a.java
// To Run the program in terminal type: java Program827a

import java.util.Scanner;
class Program827a
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3};
		int b[];
		b = a; //shallow copy, changing b, changes a
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		for(int i = 0; i<3; i++)
		{
			System.out.println("a["+i+"]=" + a[i]);
			System.out.println("b["+i+"]=" + b[i]);
		}
		b[0] = -10;
		b[1] = -20;
		b[2] = -30;
		for(int i = 0; i<a.length; i++)
		{
			System.out.println("a["+i+"]=" + a[i]);
			System.out.println("b["+i+"]=" + b[i]);
		}
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program827a.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program827a
a[0]=10
b[0]=10
a[1]=20
b[1]=20
a[2]=30
b[2]=30
a[0]=-10
b[0]=-10
a[1]=-20
b[1]=-20
a[2]=-30
b[2]=-30
*/