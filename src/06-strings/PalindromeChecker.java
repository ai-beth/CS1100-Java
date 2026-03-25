//PalindromeChecker.java
//Revist the palindrome problem and make it a method, create a main to test it

import java.util.Scanner;

//create class
public class PalindromeChecker {

    //method to check if a number is a palindrome
    public static boolean IsPalindrome(int num) {
        //isolate the thousands, hundreds, tens, and ones digits
        int thousands = num / 1000;
        int hundreds = (num % 1000) / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        //check if the first digit is the same as the fourth, and the second is the same as the third
        return thousands == ones && hundreds == tens;
    }

    //create main
    public static void main(String[] args) {

        //create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter a 4-digit number
        System.out.println("Enter a 4-digit number:");
        int num = scanner.nextInt();

        //call the IsPalindrome method and print the result
        if (IsPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
