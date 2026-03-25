//MultiplicationTable2.java
//Revisit 8.1 and use a for loop to create the multiplication table


import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting user input for the number
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        //printing the header
        System.out.println("Multiplication table for " + number);
        System.out.println("Multiplier Result");
        System.out.println("-------------------------");

        //using a for-loop to generate and display the multiplication table
        for (int i = 1; i <= 10; i++) { // Multipliers from 1 to 10
            int result = number * i;
            System.out.printf("%-10d %d\n", i, result);
        }

    }
}