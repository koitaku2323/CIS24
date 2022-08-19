// Name: Ryan Yee
// Date: 7/10/19 
// Description: Excercise6.4.a
// File Name: Program64a.java
// To Compile in terminal type: javac Program64a.java
// To Run the program in terminal type: java Program64a

class Program64a
{
	public static void main(String[] args)
	{
		double celsius;
		double fahren;

		System.out.println("Degrees    Degrees");
		System.out.println("Celsius    Fahrenheit");

		for (celsius = -10; celsius <= 60; celsius = celsius + 10)
		{
			fahren = (9.0/5.0) * celsius + 32.0;
			System.out.printf("%2.0f         %-5.2f \n", celsius, fahren);
		}
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program64a.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program64a
Degrees    Degrees
Celsius    Fahrenheit
-10         14.00
 0         32.00
10         50.00
20         68.00
30         86.00
40         104.00
50         122.00
60         140.00
*/