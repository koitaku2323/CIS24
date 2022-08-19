// Name: Ryan Yee
// Date: 7/16/19 
// Description: Excercise8.1.14
// File Name: Program8114.java
// To Compile in terminal type: javac Program8114.java
// To Run the program in terminal type: java Program8114

import java.util.Scanner;
import javax.swing.JOptionPane;
class Program8114
{
	public static void main(String[] args)
	{
		int numgrades;
		int grades [];
		//double num;
		//String s1;
		int s1;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of grades to be processed:");
		numgrades = keyboard.nextInt();
		grades = new int[numgrades];

		System.out.println("An array was created for " + numgrades + " integers.");
        System.out.println("Please enter the values to be stored in the array:");
        Scanner number = new Scanner(System.in);
        s1 = number.nextInt();
        //s1 = JOptionPane.showInputDialog("Please enter the values to be stored in the array");
        //num = Double.parseDouble(s1);
		System.out.println("The values stored in the array have been initialized to:");
		for (int i = 0; i < numgrades; i++)
			System.out.println("grades["+i+"]=" + s1);
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program8114.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program8114
Enter the number of grades to be processed:5
An array was created for 5 integers.
Please enter the values to be stored in the array:
20
The values stored in the array have been initialized to:
grades[0]=20
grades[1]=20
grades[2]=20
grades[3]=20
grades[4]=20
*/