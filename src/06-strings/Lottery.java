//Lottery.java
//Create a lottery program that creates one random variable between 0 and 11, inclusively
// and prompts the user for two single digit variables. compare the numbers and let the user know if they matched
//either of their two numbers to the random numbers. For an extra challenge let the user know
//if they got the correct position on top of guessing correctly

//import the Scanner
import java.util.Scanner;

//create the class
public class Lottery {

    //create the main
    public static void main(String[] args) {

        //generate two random numbers between 1 and 10 (inclusive)
        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;

        System.out.println(num1 + "and" + num2);

        //create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //prompt the user for data
        System.out.println("Enter two numbers between 1 and 10 (inclusive):");
        //read user's first guess
        int guess1 = scanner.nextInt();
        //read user's second guess
        int guess2 = scanner.nextInt();

        //check the user's guesses against the generated numbers
        if (guess1 == num1 && guess2 == num2) {

            //both guesses are correct and in the right order
            System.out.println("Wow, you got both right and in order. Do you want a medal or something?");
        } else if (guess1 == num2 && guess2 == num1) {

            //both guesses are correct but in the wrong order
            System.out.println("Wow both right but in the wrong order. Sucks doesn't it?!");
        } else if (guess1 == num1 || guess2 == num2) {

            //one guess is correct and in the right position
            System.out.println("One number right and in position? You must be so proud.");
        } else if (guess1 == num2 || guess2 == num1) {

            //one guess is correct but in the wrong position
            System.out.println("One number right but in the wrong position. You're not as smart as you thought, huh?");
        } else {

            //both guesses are incorrect
            System.out.println("You got none right. Wuah Wuah Wuah :(");
        }
    }
}
