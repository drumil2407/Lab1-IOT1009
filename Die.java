
//Name : Drumil Ashokkumar Shekhda
//Student Number: A00226212
//Program Description: A die class to create three dice which is d6,d20 and percentile and a roll method which give random rumner when it rolls.
import java.lang.Math;

public class Die
{


  int numOfSides;
  String nameOfDice;


  //create a default constructor
  public Die()
  {
      nameOfDice = "d6";
  }
// create one argument constructor
  public Die(int Sides)
  {
      numOfSides = Sides;
  }
  //create two argument constructor
  public  Die(int Sides, String name)
  {
    numOfSides = numOfSides;
    nameOfDice = name;
  }
//roll method for getting different values everytime whem i role
public void rollDice()
{
        //initialize with 0
        int rand = 0;

        // define the range to 1 to 6
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 6
        for (int i = 1; i < 6; i++) {
             rand = (int)(Math.random() * range) + min;
          }
          // Output is different everytime this code is executed
            System.out.println(rand);

}

//method to print one argument constructor

public void print()
{
  System.out.print(numOfSides);
}
//method to print two argument constructor but used only for name
public void print2()
{
  //System.out.print(numOfSides);
  System.out.print(nameOfDice);
}

public static void main(String[] args)
{

    //this object foe default constructor
    Die diceOb1 = new Die();
    //this obhect for 2 argument constructor
    Die diceOb2 = new Die(20);
    //this object for 3 argument costructor
    Die diceOb3 = new Die(10,"Percentile");
    System.out.println("java dice game");
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

  }
}
