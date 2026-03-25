//EqualityChecker.java
//Question one on the final
//Write a program where the main reads in three integers
//and then invokes a method that displays whether the three integers are equal.
//public static void isEqual(int x, int y, int z)
//Enter 3 integers: 3 10 15
//The three values are not equal.

//Another sample run,
//Enter 3 integers: 5 5 5
//The three values are equal.

//import the scanner to take input
import java.util.Scanner;

public class EqualityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println(isEqual(num1, num2, num3));
    }

    public static String isEqual(int x, int y, int z) {
        if ((x == y) && (y == z)) {
            return "The three values are equal.";
        } else {
            return "The three values are not equal.";
        }
    }
}
