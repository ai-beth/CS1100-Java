//BankCheckFees.java
/*
A bank charges a base fee of $10 per month, plus the following check fees for a
commercial checking account:
• $.10 each for less than 20 checks
• $.08 each for 20–39 checks
• $.06 each for 40–59 checks
• $.04 each for 60 or more checks
Write a program that asks for the number of checks written for the month. The program
should then calculate and display the bank’s service fees for the month
*/
//import the scanner for input
import java.util.Scanner;

//class
public class BankCheckFees{

    //main
    public static void main(String[] args){

        //constant variable for the $10 base fee
        final double BASE_FEE = 10.00;

        //scanner variable for input
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the nnumber of checks
        System.out.print("Please enter the total number of checks: ");
        int numChecks = input.nextInt();

        //initialize the checkFee variable
        double checkFee;

        //if statement to determine the proper fee
        if ( numChecks < 20){
            checkFee = 0.10;
        }
        else if (numChecks < 40) {
            checkFee = 0.08;
        }
        else if (numChecks < 60) {
            checkFee = 0.06;
        }
        else checkFee = 0.04;

        //total check cost
        double checkTotalAmount = checkFee * numChecks;

        //display the results
        System.out.println("The total charge is: $" + (BASE_FEE + checkTotalAmount));
    }//end main
}
