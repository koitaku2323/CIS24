// Program name: Exercise 1.2.8. java
// Exercise 1.2.8
// Ryan Yee 
// 6/20/19
// Description:Assume that you are to create a plan for a Java program that simulates the selection of a state lottery that 
// randomly selects four numbers. For this plan, list the data item(s) and a set of methods that would be useful for such a
// program. Select your own class name and data item names.
import java.util.Random.ints;

public class LotterySelector
{
  //class data declaration section    
  //Start of  Data Section 
  private String lotteryStr; 
  private int in1,in2, in3, in4;


  //class method definition section 
  //Start of  Method Section 
 // public LotterySelector() 
//  { 
  	// lotteryStr = “Your lottery number: 1 1 1 1”;
  //	  	 lotteryStr = “ ”;
 // }
  //randomly summon integers for each variable 
  private lotteryRandom() { 
  	in1 = int(rand());
  	in2 = int(rand());
  	in3 = int(rand());
  	in4 = int(rand());
  //defining string
  	lotteryStr = “Your lottery number: ”+in1 +“ ”+in2 +“ ”+in3 +“ ”+in4；
  }
  //printing string 
  public void displayLottery() { System.out.println(lotteryStr); }

}

public static void main (String[] args)  
{ 
  class lotterySelector myLottery;

  myLottery.lotteryRandom();

  myLottery.displayLottery();


}

/*

*/