//MinuteToYears.java
//Prompt the user to enter a number of minutes and convert it to years and days

//import Scanner
import java.util.Scanner;

//Create class
public class MinuteToYears {

    //Scanner object to get user input
    static Scanner input = new Scanner(System.in);

    //create main function
    public static void main(String[] args) {

        //prompt user for the number of minutes and create variable
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();

        //find the number of days in the minutes
        int days = minutes / 1440;

        //find the number of years in the days
        int years = days / 365;
        //find the remaining days after calculating the years
        int remainingDays = days % 365;

        //display the results
        System.out.println(minutes + " minutes is " + years + " years and " + remainingDays +" days.");

    }


}
