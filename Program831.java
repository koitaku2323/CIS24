// Name: Ryan Yee
// Date: 7/17/19 
// Description: Excercise8.3.1
// File Name: Program831.java
// To Compile in terminal type: javac Program831.java
// To Run the program in terminal type: java Program831

import java.util.Scanner; //needed for Scanner
import java.util.Arrays; // needed for Arrays.sort()
class Program831
{
	public static void main(String[] args)
	{
		String s1;
		int value, location, capacity, numbers[];
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the capacity of the array:" );
		capacity = keyboard.nextInt();
		numbers = new int[capacity]; // allocate the array
		// read the array values
		for (int i = 0; i< capacity; i++)
		{
			System.out.print("Enter number " + (i+1)+ " into the array:");
			numbers[i] = keyboard.nextInt();
		}

		System.out.println("The unsorted array" + Arrays.toString(numbers));
		Arrays.sort(numbers); //sort the array
		System.out.println("The sorted array" + Arrays.toString(numbers));

		System.out.print("Enter a value that you are searching for:");
		value = keyboard.nextInt();
		location = Arrays.binarySearch(numbers, value);
		if(location >= 0)
			System.out.print("The value was found at index :" + location );
		else
			System.out.print("The value was not found.");
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program831.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program831
Enter the capacity of the array:4
Enter number 1 into the array:3
Enter number 2 into the array:1
Enter number 3 into the array:2
Enter number 4 into the array:4
The unsorted array[3, 1, 2, 4]
The sorted array[1, 2, 3, 4]
Enter a value that you are searching for:4
The value was found at index :3
*/