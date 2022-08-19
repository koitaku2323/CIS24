// Name: Ryan Yee
// Date: 7/2/19 
// Description: program that calculates and returns the fourth root of the number 81, which is 3.
// File Name: Program454.java
// To Compile in terminal type: javac Program454. java
// To Run the program in terminal type: java Program454
 
class Program454
{
    public static void main(String[] args)
    {
 	    double num1, root2, root4;
 	    num1 = 81;
 	    root2 = Math.sqrt(num1);
 	    root4 = Math.sqrt(root2);

 	    System.out.println("The fourth root of 81 is " + root4);
    }
}

/*
PS C:\Users\Ryan Yee\Desktop\CSIS24> javac Program454.java
PS C:\Users\Ryan Yee\Desktop\CSIS24> java Program454
The fourth root of 81 is 3.0
*/