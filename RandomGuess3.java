// chapter 6 Pratice

// importation of package JOptionPane
import javax.swing.JOptionPane;

//Creation of RandomGuess3 class
public class RandomGuess3
{
	//Creation of method main()
	public static void main(String[]args)
	{
	 //Declaration of variables and constant
	   int userGuess;
	   int magicNumber;
	   String msg;
	   int attempts = 1;
	   final int LOW = 1;
	   final int HIGH = 10;

	  //Input phase
	    userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "PLease enter a number between" + LOW + "and" + HIGH));   

      //Processing phase
	    magicNumber = (int) (Math.random() * HIGH) + LOW;
       
       //Condition of WHILE-LOOP statement
         while(userGuess != magicNumber)
         {
         	//Condition of IF-ELSE statement
         	 if(userGuess > magicNumber)
         	 {
               msg = "Sorry, your guess was too high!";
         	 } 
         	 else
         	 {
                msg = "Sorry, your guess was too low!";
         	 }// end of IF-ELSE statement
            
               userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPLease enter a number between" + LOW + "and" + HIGH));   
             
             //Incrementation of attempts before the userGuess is checked again
               ++attempts;
         }// end of WHILE-LOOP statement

         //Display phase
         JOptionPane.showMessageDialog(null, "YOU'VE WON \nThe magic number was: " + magicNumber + "\nYou guess it in " + attempts + "attempt(s)!");

	}// end of main() method

}// end of RandomGuess class 