//IsPalindrome.java
//create a program that takes a four digit integer from the user and tests if it is palindrome

//import scanner
import java.util.Scanner;

//create class
public class IsPalindrome {

    //create main
    public static void main(String[] args) {

        //prompt the user for input and create variable for our number data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 4-digit number:");
        int num = scanner.nextInt();

        //isolate the thousands, hundreds, tens, and ones digits
        int thousands = (int)(num / 1000);
        int hundreds = (int)(num % 1000) / 100;
        int tens = (int)(num % 100) / 10;
        int ones = (int)(num % 10);

        //check if the number is a palindrome
        if (thousands == ones && hundreds == tens) {
            System.out.println(num + " is a palindrome");
        }
        else {
            System.out.println(num + " is not a palindrome");
        }

        System.out.println("Enter another 4-digit number");
        //String number2 = input.next();

       // if( number2.charAt(0) == number2.charAt(3) && number2.charAt(1) == number2.charAt(2);



    }
}
