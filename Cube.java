// Name: Ryan Yee
// Date: 6/28/19 
// Description: a program which passes 3 integer arguments (height, width, length) into a method
// File Name: Cube.java
// To Compile in terminal type: javac Cube. java
// To Run the program in terminal type: java Cube

class Cube
{
	int volume, sideA, sideB, sideC;

	// constructor
	Cube(int newSideA, int newSideB, int newSideC)
	{
		sideA= newSideA;
		sideB= newSideB;
		sideC= newSideC;
	}

	// mutators
	void changeSideA(int newSideA) { sideA = newSideA; }
	void changeSideB(int newSideB) { sideB = newSideB; }
	void changeSideC(int newSideC) { sideC = newSideC; }

	//accessors
	int getSideA() { return sideA; }
	int getSideB() { return sideB; }
	int getSideC() { return sideC; }

	// method that returns the product of all sides
	int volume(int length, int width, int height)
	{
		return length*width*height;
	}

	public static void main(String[] args)
	{
		// make new box
		Cube vol = new Cube(1,2,3);
		// change it
		vol.changeSideA(15);
		vol.changeSideB(20);
		vol.changeSideC(25);
		// show product of all sides
		int volume = vol.volume(15,20,25);
		//"The volume of a " + sideA "x" + sideB "x" + sideC "= " + volume "cubic centimeter."
		System.out.println("The volume of a 15x20x25 cube = " + volume + "cubic centimeter.");
	}
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Cube.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Cube
The volume of a 15x20x25 cube = 7500cubic centimeter.
*/