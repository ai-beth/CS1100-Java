//RockPaperScissors2.java
//Refine our first Rock Paper Scissors program to include a switch

//import the scanner
import java.util.Scanner;

//create the class
public class RockPaperScissors2 {

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

        //switch statement to determine personChoice value
        switch (userChoice) {
            case 0:
                personChoice = "Scissors";
                break;
            case 1:
                personChoice = "Rock";
                break;
            case 2:
                personChoice = "Paper";
                break;
            default:
                // to handle invalid user choices
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                
        }

        //create variable for the random computer choice
        int computerChoice = (int)(Math.random() * 3);
        //string variable to store the compChoice value
        String compChoice = switch (computerChoice) {
            case 0 -> "Scissors";
            case 1 -> "Rock";
            case 2 -> "Paper";
            default -> "";

            //switch statement to determine compChoice value
        };

        //string variable to store the win value
        String win = "";

        // Determine who wins and how to display the output
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
        System.out.println("The computer chose " + compChoice + ". You chose " + personChoice + win);
    }
}
