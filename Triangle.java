// Name: Ryan Yee
// Date: 6/27/19 
// Description: a Java class named Triangle that contains three instance variables (properties) named: sideOne, sideTwo, sideThree.
// File Name: Triangle.java
// To Compile in terminal type: javac Triangle. java
// To Run the program in terminal type: java Triangle
class Triangle
{
	//instance variables
	int perimeter, sideOne, sideTwo, sideThree;

	// constructor
	Triangle(int newSideOne, int newSideTwo, int newSideThree)
	{
		sideOne= newSideOne;
		sideTwo= newSideTwo;
		sideThree= newSideThree;
	}

	// mutators
	void changeSideOne(int newSideOne) { sideOne = newSideOne; }
	void changeSideTwo(int newSideTwo) { sideTwo = newSideTwo; }
	void changeSideThree(int newSideThree) { sideThree = newSideThree; }

	//accessors
	int getSideOne() { return sideOne; }
	int getSideTwo() { return sideTwo; }
	int getSideThree() { return sideThree; }

	// method that returns the sum of all sides
	int sum(int side1, int side2, int side3)
	{
		return side1+side2+side3;
	}

	public static void main(String[] args)
	{
		// make new box
		Triangle trig = new Triangle(1,2,3);
		// change it
		trig.changeSideOne(10);
		trig.changeSideTwo(20);
		trig.changeSideThree(29);
		// show sum of all sides
		int perimeter = trig.sum(10,20,29);
		System.out.println("The perimeter of the Triangle = " + perimeter);
	}
	

}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Triangle.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Triangle
The perimeter of the Triangle = 59
*/