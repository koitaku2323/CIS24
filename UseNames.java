// Name: Ryan Yee
// Date: 6/27/19 
// Description: Shows how UseNames.java file uses Names.java file
// File Name: UseNames.java
// To Compile in terminal type: javac UseNames. java
// To Run the program in terminal type: java UseNames
class UseNames
{
	public static void main(String[] args)
	{
		// "me" and "someone" are each an "INSTANCE" of the Names class
		Names me = new Names(); // calls default constructor
		Names someone = new Names("Ellen", "H.", "Venable"); //calls explicit constructor
		//                         ^^^^^    ^^    ^^^^^^^  ARGUMENTS = the values that go into the PARAMETERS
		System.out.println(me); // Ryan Hsien-Chun Yee
		System.out.println(someone); // Ellen H. Venable
		someone.swap();
		System.out.println(someone); //Venable H. Ellen
	}
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac UseNames.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java UseNames
Ryan Hsien-chun Yee
Ellen H. Venable
Venable H. Ellen
*/