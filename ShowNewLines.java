// Name: Ryan Yee
// 6/25/2019
// Description: Show "numbers skipping lines" in the command line/terminal
// File Name: ShowNewLines.java
// To Compile in terminal type: javac ShowNewLines.java
// To Run the program in terminal type: java ShowNewLines
class ShowNewLines
{
	public static void main(String[] args)
    {
    	System.out.print("One \n two three \n"); // \n Shows a new line
    	System.out.print("four five six");
    	System.out.println("...seven eight");
    	System.out.print("nine");
    }// end of main() method
}// end of class ShowNewLines

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac ShowNewLines.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java ShowNewLines
One
 two three
four five six...seven eight
nine
PS C:\Users\Ryan Yee\Desktop\CSIS24>
/*