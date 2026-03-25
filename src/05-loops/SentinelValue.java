//SentinelValue.java
//create a program that takes numbers as input and finds their average and sum.
//the program stops taking numbers from the user when they enter 0


import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;

        //loop to read numbers
        while (true) {
            System.out.print("Please enter a value and terminate with 0: ");
            number = scanner.nextInt();

            if (number == 0) { //check for sentinel value
                break; //exit the loop
            }

            sum += number; //add the number to sum
            count++; //increment the count of numbers entered
        }

        //calculate average only if at least one number was entered
        double average = count > 0 ? (double)sum / count : 0;

        //display the results
        System.out.println("The sum is " + sum);
        System.out.printf("The average is %.4f\n", average);
    }
}
