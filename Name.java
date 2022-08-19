// Name: Ryan Yee
// Date: 6/28/19 
// Description: show how objects can swap values 	
// File Name: Name.java
// To Compile in terminal type: javac Name. java
// To Run the program in terminal type: java Name

class Name
{
	//data declaration section
	String name;

	Name(String newName) // Explicit Constructor - makes different Names
	{//            ^^^^  PARAMETER = variable that accepts the ARGUMENT
		name = newName;
	}

	void changeName(String newName) // mutator 
	{
		name = newName;
	}

	String getName()
	{
		return name;
	}

	void swap(Name other_Name_object)
	{
		String temp;
		temp = this.name;
		this.name = other_Name_object.getName();
		//^^"this" refers to "me"
		// "other_Name_object" refers to "you"
		other_Name_object.changeName(temp);
	}

	public String toString()
	{
		return name;
	}
}