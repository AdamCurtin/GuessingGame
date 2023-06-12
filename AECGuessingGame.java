
// Programmer: Adam Curtin
// Class: CS 141
// Date: 2/9/2023
// Project: Number Guessing Game

// import libraries
import java.util.*; // import all the classes and interfaces within java. util package. Globstar is inclusive.

public class AECGuessingGame {

   public static void main(String[]args) {
   
      instructions();
      playGame();
      playAgain();
   }// end of main

   public static void instructions() {
      System.out.println(" This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and 100 \nand will allow you to guess until you get it.");
      System.out.println("For each guess, I will tell you whether the \ncorrect answer is higher or lower than your guess.");
    
   } // end instructions

   public static int playGame() { 
      Random rand = new Random(); // random class
      Scanner input = new Scanner(System.in); // scanner class
   
      int randomNumber = rand.nextInt (100) + 1; // create random number 1-100
      int guessTotal = 0; // Number of tries
      int gameTotal = 0; // Number of games
      
      System.out.println("Random number is " + randomNumber);
      System.out.println("Your guess is: ");
      int guess = input.nextInt();
   
      while(guess != randomNumber){ // begin while
       
         if(guess > randomNumber) {
            System.out.println("No, the number is LOWER. Guess again: ");
            guessTotal++;
         } else {
            System.out.println("No, the number is HIGHER. Guess again: ");
            guessTotal++;
         }// end if else
         guess = input.nextInt();
      } //end while loop
      guessTotal++;
      System.out.println("That's the number! You win!");
      System.out.println("It took you " + guessTotal + " try/tries.");
      return guessTotal; 
   } // end playGame

public static void playAgain() { // prompt for play again, or end game.  
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Wanna play again?");
    int gameTotal = 0;
    int guessTotal = 0;
    String userResponse = input.nextLine();  // Read user input
    //System.out.println("Username is: " + userResponse);  // Output user input
   char m1 = userResponse.charAt(0);
   //do {
   //playGame();
    while(m1 == 'y' || m1 == 'Y') { // begin while loop
    playGame();
    gameTotal++;
    userResponse = input.nextLine();
    } // end while loop
    System.out.println("You played " + gameTotal + " game(s)");
    System.out.println("Thanks, play again soon!"); 
   } // end playAgain
     
     
//     while (response.substring(0) == "Y" || "y"); {
//     playGame();
//     if (response.substring(0) == "N" || "n"); {
//     System.out.println("Thank you for playing. See ya!");
// } // end if
// } // end while

} // end of AECGuessingGame