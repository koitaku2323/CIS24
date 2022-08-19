// Name: Ryan Yee
// Date: 7/2/19 
// Description: Exercise10.p222
// File Name: Program10.java
// To Compile in terminal type: javac Program10. java
// To Run the program in terminal type: java Program10

class Program10
{
	public static void main(String[] args)
	{
		double cx1, cy1, midpointx, midpointy, cx2, cy2;
		cx1 = 3;
		cy1 = 7;
		cx2 = 8;
		cy2 = 12;
		midpointx = (cx1 + cx2)/2;
		midpointy = (cy1 + cy2)/2;

		System.out.printf("The x coordinate of the midpoint is %5.2f\n" , midpointx);
		System.out.printf("The y coordinate of the midpoint is %5.2f\n" , midpointy);

	}
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program10.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program10
The x coordinate of the midpoint is  5.50
The y coordinate of the midpoint is  9.50
*/