//NumberOccurences.java
//Write a program that reads the integers between 1 and 10 and counts the occurrences of each. Assume
//the input ends with 0. Use an array to keep track of occurrences.

//import scanner so we can get user input
import java.util.Scanner;

//create the class
public class NumberOccurences {

    //create the main
    public static void main(String[] args) {

        //new scanner to take input
        Scanner input = new Scanner(System.in);
        int[] counts = new int[11];  //array to store counts of numbers 1-10

        System.out.println("Enter numbers between 1 and 10 (enter 0 to stop):");

        while (true) {
            int num = input.nextInt();

            //check for sentinel value
            if (num == 0) {
                break;
            }

            //increment count for the entered number
            counts[num]++;
        }

        //print the counts
        for (int i = 1; i <= 10; i++) {
            System.out.println( i + " occurs " + counts[i] + " times.");
        }
    }
}


