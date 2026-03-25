//ArrayModifier.java

import java.util.Scanner;

public class ArrayModifier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter an integer: "); // Changed prompt for clarity
            myArray[i] = input.nextInt();
        }

        myArray[2] = myArray[2] * 2;
        myArray[4] = myArray[1] + myArray[3];

        displayArray(myArray);
    }

    public static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // Removed semicolon
            System.out.println(numbers[i]);
        }
    }
}
