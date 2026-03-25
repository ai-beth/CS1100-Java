//RandomGrid.java
//generate a random  nXn grid

import java.util.Scanner;
import java.util.Random;

public class RandomGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //prompt the user for n
        System.out.print("Enter the number of rows and columns, or n: ");
        int n = scanner.nextInt();

        //generate and display the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //generate a random 0 or 1
                int randomNumber = random.nextInt(2);
                System.out.print(randomNumber);
            }
            System.out.println(); //move to the next line after printing each row
        }
    }
}