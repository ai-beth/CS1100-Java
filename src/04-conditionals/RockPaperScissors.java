//RockPaperScissors.java
//Create a rock paper scissors game

//import the scanner
import java.util.Scanner;

//create the class
public class RockPaperScissors {

    //create the main function
    public static void main(String[] args) {

        //new scanner for userChoice variable
        Scanner scanner = new Scanner(System.in);

        //prompt the user for information and create userChoice variable
        System.out.println("0 for Scissor, 1 for Rock, 2 for Paper: ");
        //integer variable for our user choice from user input data
        int userChoice = scanner.nextInt();
        //string variable to determine how to print out the users choice
        String personChoice = "";

        //if-else statement to determine personChoice value
        if (userChoice == 0) {
            personChoice = "Scissors";
        }
        else if (userChoice == 1) {
            personChoice = "Rock";
        }
        else {
            personChoice = "Paper";
        }

        //create variable for the random computer choice
        int computerChoice = (int)(Math.random() * 3);
        //string variable to store the compChoice value
        String compChoice = "";
        //string variable to store the win value
        String win = "";

        //if-else statement to determine compChoice value
        if (computerChoice == 0) {
            compChoice = "Scissors";
        }
        else if (computerChoice == 1) {
            compChoice = "Rock";
        }
        else {
            compChoice = "Paper";
        }

        //if statement to determine who wins and how to display the output
        if (userChoice == computerChoice) {
            win = " too. It's a tie!";
        }
        else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            win = ". You Win!";
        }
        else {
            win = ". You Lose";
        }

        //display the results as output
        System.out.println("The computer chose " + compChoice + ". You chose " + personChoice + win );
    }
}
