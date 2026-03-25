//LargestValue.java
//Write a program that reads 10 integers and displays the largest value that
//was entered.

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter 10 values
        System.out.println("Enter 10 values:");

        int largest = Integer.MIN_VALUE;//initialize the largest variable with the smallest possible integer value

        //read and compare 10 integers
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            }
        }

        //display the largest value
        System.out.println("The largest value is: " + largest);
    }
}



