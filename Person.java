// Name: Ryan Yee
// Date: 6/26/19 
// Description: Accessor, Mutator, Constructor(Default, Explicit), Instance
// File Name: Person.java
// To Compile in terminal type: javac Person. java
// To Run the program in terminal type: java Person
class Person
{
	//data declaration section
	String name; //instance variable
	int age; //instance variable

	// method definition section
	Person() //Default Constructor - makes the same Person every time
	{
		name= "Ryan";
		age= 16;
	}

	Person(String newName, int newAge) //Explicit Constructor - makes different Person
	{//           ^^^^^^^      ^^^^^^ PARAMETERS = variables that accept the ARGUMENTS
		name = newName;
		age = newAge;
	}

	void changeName(String newName) //mutator
	{
		name= newName;
	}
	void changeAge(int newAge) // Mutator 2
	{
		age= newAge;
	}

	public String toString()
	{
		return "person's name = " + name + " , age =" + age;
	}

	public static void main(String[] args)
	{
		// "me" and "someone" are each an "INSTANCE" of the Person class
		Person me= new Person(); //calls default constructor
		Person someone= new Person("Ryan", 16); // calls explicit constructor
		//                          ^^^^^   ^^ ARGUMENTS = the values that go into the PARAMETERS
		System.out.println(me); // Ryan 16
		me.changeName("Ryan");
		System.out.println(me); // Ryan 16
		System.out.println(someone); // Ellen 56
	}
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Person.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Person
person's name = Ryan , age =16
person's name = Ryan , age =16
person's name = Ellen , age =56
*/
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Person.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Person
person's name = Ryan , age =16
person's name = Ryan , age =16
person's name = Ryan , age =16
*/