//BookClubPoints.java
//Serendipity Booksellers has a book club that awards points to its customers based on the number
// of books purchased each month. The points are awarded as follows:

//If a customer purchases 0 books, he or she earns 0 points.
//If a customer purchases 1 book, he or she earns 5 points.
//If a customer purchases 2 books, he or she earns 15 points.
//If a customer purchases 3 books, he or she earns 30 points.
//If a customer purchases 4 or more books, he or she earns 60 points.

//Write a program that asks the user to enter the number of books that he or she has purchased
// this month and then displays the number of points awarded.

//A Sample Run…
//Please enter number of books purchased: 3
//You have earned 30 points.

import java.util.Scanner;

public class BookClubPoints {

    public static void main(String[] args) {

        //scanner variable for input
        Scanner input = new Scanner(System.in);

        //prompt the user to enter the number of books
        System.out.print("Please enter the total number of books purchased: ");
        int numBooks = input.nextInt();


        //initialize the points
        int bookPoints;


        //if statement to determine the proper points to award
        if ( numBooks == 0){
            bookPoints = 0;
        }
        else if ( numBooks == 1) {
            bookPoints = 5;
        }
        else if (numBooks == 2) {
            bookPoints = 15;
        }
        else if (numBooks == 3) {
            bookPoints = 30;
        }
        else bookPoints = 60;


        //display the results
        System.out.println("You have earned " + bookPoints + " points!");
    }
}
