// Name: Ryan Yee
// Date: 6/27/19 
// Description: Type up the below example program, then swap the fist and last name of instance "me" using method swap()
// File Name: Names.java
// To Compile in terminal type: javac Names. java
// To Run the program in terminal type: java Names

class Names
{
	// data declaration section
	String first, middle, last;

	// method definition section
	Names() // Default Constructor - makes the same Names every time
	{
		first = "Ryan";
		middle = "Hsien-chun";
		last = "Yee";
	}

	Names(String newF, String newM, String newL) // Explicit Constructor - makes different Names
	{//          ^^^^         ^^^^         ^^^^  PARAMENTS = variables that accept the ARGUMENTS
		first= newF;
		middle = newM;
		last = newL;
	}

	void changeFirst(String newF) //mutator 
	{
		first = newF;
	}

	void swap()
	{
		String temp; //need this to store the next "temp"orarily
		temp = first; // temp = "Ryan"
		first = last; // first = "Yee"
		last = temp; // last = "Ryan" ... we swapped the first and last names
	}

	public String toString()
	{
		return first + " " + middle + " " + last;
	}
}