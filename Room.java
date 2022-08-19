//Name: Ryan Yee 
//6/25/19
//Description: Example of an Object: Room
//File Name: Room.java
//To Compile in terminal type: javac Room.java
//To Run the program in terminal type: java Room
class Room
{
	//Properties of the room=VARIABLES
	//Variable declaration section
	double length, width; // Variables: length, width
	//^data type of the  two variables

	//ACTIONS OF ROOM = METHODS
	//ways to "interact with the room" = ways to "change or show the properties/variables"
    //- make a new room - CONSTRUCTOR
    //- change the room's properties - ACCESSOR

    // CONSTRUCTOR - a Method that sets initial properties of the room
    Room() //Default constructor - sets the properties of a new room
    {
	    length=25.0;
	    width=12.0;
    } 

    //MUTATOR METHOD
    void changeRoom(double newL, double newW) // - change the room
    {
	    length= newL;
	    width= newW;
    }

    // ACCESSOR METHOD
    public String toString() // - show the room's properties
    {
	    return "has a length of " + length + " ,and a width of " + width;
    }

    public static void main(String[] args)
    {
	    //Room() below "Calls" the Default Constructor,
	    //"Calls" means execute what is in between { } of Room()
	    Room myRoom = new Room(); // make a new room 25 by 12 (Length, Width)
	    System.out.println("myRoom " + myRoom); // show the room
	    //                             ^^^^^^ calls toString()
	    myRoom.changeRoom(10,20); // calls changeRoom(), changes the room's properties
	    System.out.println("myRoom now " + myRoom); // show the room again
    }
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Room.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Room
myRoom has a length of 25.0 ,and a width of 12.0
myRoom now has a length of 10.0 ,and a width of 20.0
*/