// Name: Ryan Yee
// Date: 7/10/19 
// Description: Excercise6.2.2
// File Name: Program622.java
// To Compile in terminal type: javac Program622.java
// To Run the program in terminal type: java Program622

class Program622
{
	public static void main(String[] args)
	{
		int stop = 60;
		int start = -10;
		int increment = 10;
		double celsius;
		double fahren;

		System.out.println("Degrees    Degrees");
		System.out.println("Celsius    Fahrenheit");

		celsius = start;
		while(celsius <= stop)
		{
			fahren = (9.0/5.0) * celsius + 32.0;
			System.out.printf("%2.0f         %-5.2f \n", celsius, fahren);
			celsius = celsius + increment;
		}
	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program622.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program622
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