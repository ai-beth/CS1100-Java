//MultiplesOfFour.java
//Write a program to take a starting and ending number and give all multiples of four in between them

import java.util.Scanner;

public class MultiplesOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt user for input for starting and ending numbers
        System.out.print("Enter starting number: ");
        int x = scanner.nextInt();
        System.out.print("Enter ending number: ");
        int y = scanner.nextInt();

        //display the header
        System.out.printf("Multiples of 4 between %d and %d include: ", x, y);

        //use a for-loop to find and print multiples of 4
        for (int i = x; i <= y; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
