//Name : Drumil Ashokkumar Shekhda
//Student Number: A00226212
//Program Description: A test class which gives different values before and after

import java.lang.Math;

//to use the methods of Die class i used inheritance
public class DiceGame extends Die
{

  public static void main(String[] args)
  {

    //i put all objects of Die class in DiceGame class to get output with one time
    //this object foe default constructor
    Die diceOb1 = new Die();
    //this obhect for 2 argument constructor
    Die diceOb2 = new Die(20);
    //this object for 3 argument costructor
    Die diceOb3 = new Die(10,"Percentile");
    System.out.println("Java dice game");
    System.out.println("Creating a default d6...");
    System.out.println("Creating a d20...");
    System.out.println("Creating percentile die (a special d10)...");
    System.out.print("The current side up for "+diceOb1.nameOfDice+" is ");
    diceOb1.rollDice();
    System.out.print("The current side up for ");
    diceOb2.print();
    System.out.print(" is ");
    diceOb2.rollDice();
    System.out.print("The current side of ");
    diceOb3.print2();
    System.out.print(" is ");
    diceOb3.rollDice();

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
