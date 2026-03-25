//EvenChecker.java
//Write a program that prompts the user for a number and checks if that number is even

//import Scanner
import java.util.Scanner;

//Create Class
public class EvenChecker {

    //create a new scanner instance
    static Scanner input = new Scanner(System.in);

    //Create Main function
    public static void main(String[] args) {

        //Prompt the user for an integer and place that in a variable
        System.out.println("Please enter an integer:");
        int number = input.nextInt();

        //Display the results
        if ((number % 2) == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");

    }
}
