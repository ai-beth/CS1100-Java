//LetterToPhoneNumber.java
//Write a program that prompts the user to enter a lowercase or uppercase letter and
//display its corresponding number. For a bad input, display "invalid input".

//import scanner
import java.util.Scanner;
//create class
public class LetterToPhoneNumber {
    //create the main function
    public static void main(String[] args) {

        //scanner for input
        Scanner scanner = new Scanner(System.in);
        //prompt the user for a letter and create a string variable for the input
        System.out.println("Enter a letter: ");
        String input = scanner.next();

        // Check if the input length is 1 and if it is a letter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            // Convert input to uppercase to simplify the switch cases
            char letter = Character.toUpperCase(input.charAt(0));
            //variable for the number returned
            int number;

            //switch to determine the number corresponding to the letter input by the user
            //If the letter is ABC, then the number is 2
            switch (letter) {
                case 'A':
                case 'B':
                case 'C':
                    number = 2;
                    break;
                //if the DEF the number is 3, and so on
                case 'D':
                case 'E':
                case 'F':
                    number = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    number = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    number = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    number = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    number = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    number = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    number = 9;
                    break;
                default:
                    // This should never happen due to the input validation
                    //creates a value for number that will produce an error message if the user
                    //inputs the wrong value
                    number = -1;
                    break;
            }
            //if the data is valid, print the results
            if (number != -1) {
                System.out.println("The corresponding number is " + number);
            }
            //else if it's not, print an error
            else {
                System.out.println("Unexpected error.");
            }
        }
        //this is the else statement fo the first if statement.
        //it provides the error message if the input is invalid and not a letter
        else {
            System.out.println(input + " is invalid input");
        }
    }
}