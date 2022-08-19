// Name: Ryan Yee
// Date: 6/26/19 
// Description: Example of ++ and += operations
// File Name: Operator.java
// To Compile in terminal type: javac Operator. java
// To Run the program in terminal type: java Operator
class Operator
{
	//PROPERTY: just a number, num
	int num; // VARIABLE = PROPERTY

	// METHODS (ways to change/see num):
	//Default Constructor 
	Operator() // make equal to 0 initially
	{
		num= 0;
	}
	//Mutator Method 1:
	void increment() // increase num by 1
	{
		num++; //num= num + 1
	}
	// Mutator Method 2:
	void incrementBy(int anotherNum) // increase num by antherNum
	{
		num+= anotherNum; //num= num + anotherNumber
	}
	void decrement() // decreases num by 1 
	{
		num--; //num= num - 1
	}
	void decrementBy(int anotherNum) //decreases num  by anotherNum 
	{
		num-= anotherNum; 
	}
	// Accessor Method (shows the property of the object/class)
	public String toString()
	{
		return "num is equal to " + num;
	}
	// main(...) is where the program starts
	public static void main(String[] args)
	{
		Operator op= new Operator(); // make a new Operator called op
		//               ^^^^^^^^^^^ calls Operator()
		System.out.println( op ); //0
		//                 ^^ call toString()
		op.decrement(); // calls decrement()
		System.out.println( op ); // 1
		op.decrementBy(10); // calls decrementBy(..)
		System.out.println( op ); // 11
	}
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Operator.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Operator
num is equal to 0
num is equal to 1
num is equal to 11
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Operator.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Operator
num is equal to 0
num is equal to -1
num is equal to -11
*/