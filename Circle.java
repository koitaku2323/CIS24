//Name: Ryan Yee 
//6/25/19
//Description: Write a new Java Program Circle.java
//File Name: Circle.java
//To Compile in terminal type: javac Circle.java
//To Run the program in terminal type: java Circle 
class Circle
{
	//Properties of the circle =VARIABLES
	//Variable declaration section
	double radius; // Variable: radius
	//^data type of the variable

	//ACTIONS OF CIRCLE = METHODS
	//ways to "interact with the circle" = ways to "change or show the properties/variables"
    //- make a new circle - CONSTRUCTOR
    //- change the circle's properties - ACCESSOR

    // CONSTRUCTOR - a Method that sets initial properties of the circle
    Circle() //Default constructor - sets the properties of a new circle
    {
	    radius=10.0;
    } 

    //MUTATOR METHOD
    void changeCircle(double newR) // - change the circle
    {
	    radius= newR;
    }

    // ACCESSOR METHOD
    public String toString() // - show the circle's properties
    {
	    return "has a radius of " + radius;
    }

    public static void main(String[] args)
    {
	    //Circle() below "Calls" the Default Constructor,
	    //"Calls" means execute what is in between { } of Circle()
	    Circle myCircle = new Circle(); // make a new circle 
	    System.out.println("myCircle " + myCircle); // show the circle
	    //                             ^^^^^^ calls toString()
	    myCircle.changeCircle(20.0); // calls changeCircle(), changes the circle's properties
	    System.out.println("myCircle now " + myCircle); // show the circle again
    }
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Circle.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Circle
myCircle has a radius of 10.0
myCircle now has a radius of 20.0
*/