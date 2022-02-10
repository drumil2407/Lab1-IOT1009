//Name : Drumil Ashokkumar Shekhda
//Student Number: A00226212
//Program Description: A test class which gives different values before and after

import java.lang.Math;

//to use the methods of Die class i used inheritance
public class DiceGame extends Die
{

  public static void main(String[] args)
  {

    //creating three dice object to use Die members
    Die d = new Die();
    Die d1 = new Die(20);
    Die d2 = new Die(10,"Percentile");
    System.out.println("Testing the roll method");
    System.out.println("");
    System.out.print("Rolling the ");
    System.out.print(d.nameOfDice);
    System.out.println("....");
    System.out.print("The New value is ");
    d.rollDice();
    System.out.print("Rolling the d");
    d1.print();
    System.out.println("");
    System.out.print("The current side up for d");
    System.out.print(d1.numOfSides);
    System.out.print(" is ");
    d.rollDice();
    System.out.print("Rolling the ");
    d2.print2();
    System.out.println("");
    System.out.print("The New value is ");
    d.rollDice();

  }


}
