// Name: Ryan Yee
// Date: 7/2/19 
// Description: The printf command for output
// File Name: NumberFormat.java
// To Compile in terminal type: javac NumberFormat. java
// To Run the program in terminal type: java NumberFormat

class NumberFormat
{
	public static void main(String[] args)
	{
		double num = 1.2345678;
		System.out.printf("Rounded to 1 decimal num = %.1f\n" , num);
		System.out.printf("Rounded to 2 decimal num = %.2f\n" , num);
		System.out.printf("Rounded to 2 decimal num = %5.2f\n" , num);
		// %5.2f is "Field of 5 numbers total with 2 decimal digits" |xxx.xx|
		System.out.printf("Rounded to 3 decimal num = %.3f\n" , num);
		System.out.printf("Rounded to 4 decimal num = %.4f\n" , num);
		// I added this &&&&&&&&&&&&
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac NumberFormat.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java NumberFormat
Rounded to 1 decimal num = 1.2
Rounded to 2 decimal num = 1.23
Rounded to 2 decimal num =  1.23
Rounded to 3 decimal num = 1.235
Rounded to 4 decimal num = 1.2346
*/