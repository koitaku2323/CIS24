// Name: Ryan Yee
// Date: 7/17/19 
// Description: Excercise8.2.7.b (Deep Copy)
// File Name: Program827b.java
// To Compile in terminal type: javac Program827b.java
// To Run the program in terminal type: java Program827b

import java.util.Scanner;
class Program827b
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3};
		int b[] = new int[a.length];
		System.arraycopy(a,0,b,0,a.length);; // deep copy, changing b does not change a 
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		for(int i = 0; i<3; i++)
		{
			System.out.println("a["+i+"]=" + a[i]);
			System.out.println("b["+i+"]=" + b[i]);
		}
		a[0] = -10; // changing a does not change b
		a[1] = -20;
		a[2] = -30;
		for(int i = 0; i<a.length; i++)
		{
			System.out.println("a["+i+"]=" + a[i]);
			System.out.println("b["+i+"]=" + b[i]);
		}
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program827b.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program827b
a[0]=1
b[0]=10
a[1]=2
b[1]=20
a[2]=3
b[2]=30
a[0]=-10
b[0]=10
a[1]=-20
b[1]=20
a[2]=-30
b[2]=30
*/