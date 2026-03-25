//SquareMethod.java
/* Write a method called square that accepts an integer argument and returns the square of
   that argument.  For example, with input of 5, the method would return 25
   Write a main that will get the user input, call the method, and display the results.
 */

import java.util.Scanner;

public class SquareMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int squareOfNumber = square(number);
        System.out.println("The square of " + number + " is " + squareOfNumber + ".");

    }
    public static int square(int number){
        return number * number;
    }
}