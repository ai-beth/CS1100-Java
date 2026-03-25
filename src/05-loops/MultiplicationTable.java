//MultiplicationTable.java
//Create a table that prompts the user for a single digit number and displays the multiplication table


import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        //prompt the user for input
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        //display the table header
        System.out.println("Multiplication table for " + number);
        System.out.printf("%-10s %s\n", "Multiplier", "Result"); // Adjusted for alignment
        System.out.println("--------------------------------");

        //initialize counter
        int counter = 1;

        //loop to display the multiplication facts
        while (counter <= 10) {

            //using printf for formatted output
            System.out.printf("%-10d %d\n", counter, number * counter);

            //increment the counter
            counter++;
        }
    }
}
