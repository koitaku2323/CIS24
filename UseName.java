// Name: Ryan Yee
// Date: 6/28/19 
// Description: Shows how to swap values between objects
// File Name: UseName.java
// To Compile in terminal type: javac UseName. java
// To Run the program in terminal type: java UseName
class UseName
{
	public static void main(String[] args)
	{
		// "me" and "you" are each an "INSTANCE" of the Name class
		Name nameA = new Name("Ryan"); // calls explicit constructor
		Name nameB = new Name("Derek"); // calls explicit constructor
		//                   ^^^^^  ARGUMENTS = the values that go into the PARAMETERS
		System.out.println("me = " + nameA);
		System.out.println("you = " + nameB);
		nameA.swap(nameB);
		System.out.println("me = " + nameA);
		System.out.println("you = " + nameB);
	}
}
/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac UseName.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java UseName
me = Ryan
you = Derek
me = Derek
you = Ryan
*/